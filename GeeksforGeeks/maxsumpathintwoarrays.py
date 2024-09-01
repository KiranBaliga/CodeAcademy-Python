class Solution:
    def maxPathSum(self, arr1, arr2):
        # Initialize pointers and sums for both arrays
        i, j = 0, 0
        sum1, sum2 = 0, 0
        result = 0
        
        # Traverse both arrays
        while i < len(arr1) and j < len(arr2):
            if arr1[i] < arr2[j]:
                # Add to sum1 if the element in arr1 is smaller
                sum1 += arr1[i]
                i += 1
            elif arr1[i] > arr2[j]:
                # Add to sum2 if the element in arr2 is smaller
                sum2 += arr2[j]
                j += 1
            else:
                # Common element found, add the maximum of both sums to the result
                result += max(sum1, sum2) + arr1[i]
                # Reset sums and move both pointers
                sum1 = 0
                sum2 = 0
                i += 1
                j += 1
        
        # Add the remaining elements from arr1 and arr2
        while i < len(arr1):
            sum1 += arr1[i]
            i += 1
        
        while j < len(arr2):
            sum2 += arr2[j]
            j += 1
        
        # Add the maximum of the remaining sums to the result
        result += max(sum1, sum2)
        
        return result

# Driver code
if __name__ == "__main__":
    t = int(input().strip())
    for _ in range(t):
        arr1 = list(map(int, input().strip().split()))
        arr2 = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.maxPathSum(arr1, arr2)
        print(ans)
