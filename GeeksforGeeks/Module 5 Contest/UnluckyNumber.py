#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3

def realSum(mylist):
    if not mylist:  # Check if the list is empty
        return 0
    
    total_sum = 0
    i = 0
    
    while i < len(mylist):
        if mylist[i] == 7:
            i += 2  # Skip the current element (7) and the next element
        else:
            total_sum += mylist[i]
            i += 1
    
    return total_sum


#{ 
 # Driver Code Starts.




def main():
    testcases = int(input()) #testcases
    while(testcases > 0):
        
        mylist = [int(x) for x in input().split()]
        print(realSum(mylist))
        testcases -= 1
        


if __name__=='__main__':
    main()
# } Driver Code Ends
