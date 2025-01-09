
// LifeLoom App - Enhanced Functionality

// Initialize from local storage
document.addEventListener("DOMContentLoaded", () => {
    loadThreads();
    loadBoard();
});

// Add new threads
const addThreadButton = document.getElementById("add-thread");
const threadsContainer = document.getElementById("threads");

addThreadButton.addEventListener("click", () => {
    const threadName = prompt("Enter thread name:");
    if (threadName) {
        const thread = createThread(threadName);
        threadsContainer.appendChild(thread);
        saveThreads();
    }
});

function createThread(name) {
    const thread = document.createElement("div");
    thread.classList.add("thread");
    thread.innerHTML = `
        <h3>${name}</h3>
        <div class="milestones"></div>
        <button class="add-milestone">Add Milestone</button>
        <div class="progress-bar">
            <div class="progress"></div>
        </div>
    `;

    const milestonesContainer = thread.querySelector(".milestones");
    const progressBar = thread.querySelector(".progress");
    const addMilestoneButton = thread.querySelector(".add-milestone");

    addMilestoneButton.addEventListener("click", () => {
        const milestoneName = prompt("Enter milestone name:");
        if (milestoneName) {
            const milestone = document.createElement("div");
            milestone.classList.add("milestone");
            milestone.innerHTML = `
                <input type="checkbox" class="milestone-check">
                <span>${milestoneName}</span>
            `;
            milestone.querySelector(".milestone-check").addEventListener("change", () => {
                updateProgress(milestonesContainer, progressBar);
                saveThreads();
            });
            milestonesContainer.appendChild(milestone);
            updateProgress(milestonesContainer, progressBar);
            saveThreads();
        }
    });

    return thread;
}

function updateProgress(milestonesContainer, progressBar) {
    const milestones = milestonesContainer.querySelectorAll(".milestone-check");
    const completed = milestonesContainer.querySelectorAll(".milestone-check:checked").length;
    const progress = milestones.length ? (completed / milestones.length) * 100 : 0;
    progressBar.style.width = `${progress}%`;
}

// Save and Load Threads
function saveThreads() {
    const threads = [];
    threadsContainer.querySelectorAll(".thread").forEach((thread) => {
        const name = thread.querySelector("h3").textContent;
        const milestones = [];
        thread.querySelectorAll(".milestone").forEach((milestone) => {
            milestones.push({
                name: milestone.querySelector("span").textContent,
                completed: milestone.querySelector(".milestone-check").checked,
            });
        });
        threads.push({ name, milestones });
    });
    localStorage.setItem("threads", JSON.stringify(threads));
}

function loadThreads() {
    const threads = JSON.parse(localStorage.getItem("threads") || "[]");
    threads.forEach(({ name, milestones }) => {
        const thread = createThread(name);
        const milestonesContainer = thread.querySelector(".milestones");
        const progressBar = thread.querySelector(".progress");

        milestones.forEach(({ name, completed }) => {
            const milestone = document.createElement("div");
            milestone.classList.add("milestone");
            milestone.innerHTML = `
                <input type="checkbox" class="milestone-check" ${completed ? "checked" : ""}>
                <span>${name}</span>
            `;
            milestone.querySelector(".milestone-check").addEventListener("change", () => {
                updateProgress(milestonesContainer, progressBar);
                saveThreads();
            });
            milestonesContainer.appendChild(milestone);
        });

        updateProgress(milestonesContainer, progressBar);
        threadsContainer.appendChild(thread);
    });
}

// Add items to the vision board
const addItemButton = document.getElementById("add-item");
const boardContainer = document.getElementById("board");

addItemButton.addEventListener("click", () => {
    const itemName = prompt("Enter vision item:");
    if (itemName) {
        const item = document.createElement("div");
        item.classList.add("vision-item");
        item.textContent = itemName;
        item.setAttribute("draggable", "true");
        item.addEventListener("dragstart", dragStart);
        boardContainer.appendChild(item);
        saveBoard();
    }
});

// Drag and drop functionality for vision board
function dragStart(e) {
    e.dataTransfer.setData("text/plain", e.target.textContent);
}

boardContainer.addEventListener("dragover", (e) => e.preventDefault());

boardContainer.addEventListener("drop", (e) => {
    e.preventDefault();
    const data = e.dataTransfer.getData("text/plain");
    const item = document.createElement("div");
    item.classList.add("vision-item");
    item.textContent = data;
    boardContainer.appendChild(item);
    saveBoard();
});

// Save and Load Vision Board
function saveBoard() {
    const items = [];
    boardContainer.querySelectorAll(".vision-item").forEach((item) => {
        items.push(item.textContent);
    });
    localStorage.setItem("visionBoard", JSON.stringify(items));
}

function loadBoard() {
    const items = JSON.parse(localStorage.getItem("visionBoard") || "[]");
    items.forEach((itemName) => {
        const item = document.createElement("div");
        item.classList.add("vision-item");
        item.textContent = itemName;
        item.setAttribute("draggable", "true");
        item.addEventListener("dragstart", dragStart);
        boardContainer.appendChild(item);
    });
}
