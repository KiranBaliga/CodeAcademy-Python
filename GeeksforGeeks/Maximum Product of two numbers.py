#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3
class Solution:

	def maxProduct(self,arr):
		# code here
        max1 = max2 = 0
        
        for num in arr:
            if num > max1:
                max2 = max1
                max1 = num
            elif num > max2:
                max2 = num
        
        # Return the product of the two largest numbers
        return max1 * max2

#{ 
 # Driver Code Starts.
#Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    while t > 0:
        arr = list(map(int, input().split()))
        ob = Solution()
        res = ob.maxProduct(arr)
        print(res)
        t -= 1


# } Driver Code Ends
