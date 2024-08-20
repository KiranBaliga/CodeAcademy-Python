#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python

def digitsSum(N):
    # Extract the tens place digit
    tens_digit = N // 10
    # Extract the units place digit
    units_digit = N % 10
    # Return the sum of the digits
    return tens_digit + units_digit

    ##Your code here

#{ 
 # Driver Code Starts.

def main():
    testcases=int(input()) #testcases
    while(testcases>0):
        N = int(input())
        print(digitsSum(N))
        testcases -= 1
        


if __name__=='__main__':
    main()
# } Driver Code Ends
