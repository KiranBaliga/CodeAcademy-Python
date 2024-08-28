#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3
#User function Template for python3

def multiplicationTable(N):
    for i in range(1, 11):  # i goes from 1 to 10
        print(i * N, end=" ")  # Multiplying i by N and printing the result





#{ 
 # Driver Code Starts.


def main():
    testcases=int(input()) #testcases
    while(testcases>0):
        N = int(input())
        multiplicationTable(N)
        print()
        testcases-=1
        


if __name__=='__main__':
    main()
# } Driver Code Ends