

# User function Template for python3

# Function to print x in decreasing order
def printInDecreasing(x):
    # Loop until x reaches 0
    while x >= 0:
        # Print the current number with a space at the end
        print(x, end=" ")
        # Decrement the value of x
        x -= 1

# Driver Code
def main():
    # Testcase input
    testcases = int(input())
    
    # Looping through testcases
    while testcases > 0:
        x = int(input())
        
        printInDecreasing(x)
        
        print()
        
        testcases -= 1

if __name__ == '__main__':
    main()
