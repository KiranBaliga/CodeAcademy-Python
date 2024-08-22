#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3
    
def doge_count(s):
    count = 0
    n = len(s)
    
    # Iterate over every possible starting index of a 4-character substring
    for i in range(n - 3):
        # Extract the substring of length 4
        substring = s[i:i+4]
        
        # Check if the substring matches the pattern "do_e"
        if substring[0] == 'd' and substring[1] == 'o' and substring[3] == 'e':
            count += 1
    
    return count


#{ 
 # Driver Code Starts.



def main():
    testcases = int(input()) #testcases
    while(testcases > 0):
        str = input()
        print(doge_count(str))
        testcases -= 1
        


if __name__=='__main__':
    main()
# } Driver Code Ends
