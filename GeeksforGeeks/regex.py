import re  # Import the re module to use regex

def numberMatcher(str):
    pat = r'\d+'  # Pattern to match one or more digits
    match = re.findall(pat, str)  # Find all matched texts and return as a list
    if match:
        for i in match:
            print(i, end=" ")
    else:
        print(-1, end="")

# Driver Code

def main():
    testcases = int(input())  # Number of test cases
    while testcases > 0:
        str = input()  # Input string
        numberMatcher(str)  # Call the numberMatcher function
        print()  # Print newline after each test case
        testcases -= 1

if __name__ == '__main__':
    main()
