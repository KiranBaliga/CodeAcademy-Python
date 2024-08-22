#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3
    ##Your code here
def isNeighbour(N):
    lower_multiple = (N // 10) * 10
    upper_multiple = lower_multiple + 10
    
    if lower_multiple <= N <= lower_multiple + 2 or upper_multiple - 2 <= N <= upper_multiple:
        return True
    return False




#{ 
 # Driver Code Starts.



def main():
    testcases=int(input()) #testcases
    while(testcases>0):
        N = int(input())
        print(isNeighbour(N))
        testcases-=1
        


if __name__=='__main__':
    main()
# } Driver Code Ends