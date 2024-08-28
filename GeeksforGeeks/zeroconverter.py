#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3

#User function Template for python3

def pos(n):
    # Print numbers from n-1 down to 0
    for i in range(n-1, -1, -1):
        print(i, end=" ")

def neg(n):
    # Print numbers from n up to 0
    for i in range(n, 1):
        print(i, end=" ")

#{ 
# Driver Code Starts.


# } Driver Code Ends

    

#{ 
 # Driver Code Starts.


def main():
    testcases=int(input()) #testcases
    while(testcases>0):
        n = int(input())
        if(n > 0):
            pos(n)
        elif(n < 0):
            neg(n)
        else:
            print("already Zero",end="")
        print()
        testcases-=1
        


if __name__=='__main__':
    main()
# } Driver Code Ends