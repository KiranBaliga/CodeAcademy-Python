#User function Template for python3



def imgExtracter(html_str):
    # Regular expression to match the image URL ending with .jpg
    pattern = r'<img[^>]+src=["\']([^"\']+\.jpg)["\']'
    
    # Find the first match
    match = re.search(pattern, html_str)
    
    if match:
        # Extract the URL from the first match
        print(match.group(1))
    else:
        # If no match is found
        print("")

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import re





def main():
    testcases=int(input()) #testcases
    while(testcases > 0):
        str = input()
        imgExtracter(str)
        testcases -= 1
        


if __name__=='__main__':
    main()
# } Driver Code Ends
