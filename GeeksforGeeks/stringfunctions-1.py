# User function Template for python3

def trim(str):
    # Use strip() to remove leading and trailing spaces
    return str.strip()

def exists(str, x):
    # Use find() to locate the substring x in str
    return str.find(x)

def titleIt(str):
    # Use title() to convert each word's first letter to uppercase
    return str.title()

def casesSwap(str):
    # Use swapcase() to swap the case of all letters
    return str.swapcase()

# Driver Code Starts
def main():
    testcases = int(input())  # Number of test cases
    while testcases > 0:
        str = input()          # Input string
        x = input()            # Substring to find
        str = trim(str)
        print(str)
        print(exists(str, x))
        print(titleIt(str))
        print(casesSwap(str))
        testcases -= 1

if __name__ == '__main__':
    main()
# Driver Code Ends
