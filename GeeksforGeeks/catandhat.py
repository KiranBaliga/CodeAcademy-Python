#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3

def cat_hat(s):
    # Count the number of times 'cat' appears in the string
    cat_count = s.count('cat')
    # Count the number of times 'hat' appears in the string
    hat_count = s.count('hat')
    
    # Return True if both counts are the same, otherwise False
    return cat_count == hat_count
  ##your code here##
  ##You need to write complete code this time 


#{ 
 # Driver Code Starts.




def main():
    testcases=int(input()) #testcases
    while(testcases>0):
        str = input()
        print(cat_hat(str))
        testcases-=1
        


if __name__=='__main__':
    main()
# } Driver Code Ends