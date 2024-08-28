#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3

# Function to print x in increasing order
# Function to print numbers in increasing order whose squares are less than or equal to x
def printIncreasingPower(x):
    i = 1
    
    # Loop to print the square of each number until its square exceeds x
    while i**2 <= x:
        print(i**2, end=" ")
        i += 1


#{ 
 # Driver Code Starts.
# Driver Code
def main():
    
    # Testcase input
    testcases = int(input())
    
    # Looping through testcases
    while(testcases > 0):
        x = int(input())
        
        printIncreasingPower(x);
        print ()
        
        
        testcases -= 1
 
if __name__ == '__main__':
    main()
# } Driver Code Ends