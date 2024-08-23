#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3


def avg(mylist):
    # Sort the list to easily access the minimum and maximum values
    mylist.sort()
    
    # Exclude the smallest and largest values
    trimmed_list = mylist[1:-1]
    
    # Calculate the sum and the count of the remaining elements
    total_sum = sum(trimmed_list)
    count = len(trimmed_list)
    
    # Calculate the average using integer division
    average = total_sum // count
    
    return average

#{ 
 # Driver Code Starts.




def main():
    testcases = int(input()) #testcases
    while(testcases > 0):
        
        mylist = [int(x) for x in input().split()]
        print(avg(mylist))
        testcases -= 1
        


if __name__=='__main__':
    main()
# } Driver Code Ends