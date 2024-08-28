#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3

# Function to check value and 
# return accordingly
# Function to check value and 
# return accordingly
def check_status(a, b, flag):
    # Case 1: One of a or b is non-negative and the flag is False
    if (a >= 0) != (b >= 0) and not flag:
        return True
    # Case 2: Both a and b are negative and the flag is True
    elif a < 0 and b < 0 and flag:
        return True
    # For all other cases
    else:
        return False

    ##Your code here
    ##Either True or False is returned

#{ 
 # Driver Code Starts.

# Driver Code
def main():
    
    # Testcase input
    testcases = int(input())
    
    # Looping through testcases
    while(testcases > 0):
        a = int(input())
        b = int(input())
        flag = input()
        
        if(flag == "True"):
            flag = True
        else:
            flag = False
        
        if(check_status(a, b, flag) is True):
            print ("True")
        else:
            print ("False")
        
        testcases -= 1
 
if __name__ == '__main__':
    main()
# } Driver Code Ends