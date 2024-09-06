# User function Template for python3

class Solution:
    
    # Function to reverse words in a given string.
    def reverseWords(self, S):
        # Step 1: Split the string into words
        words = S.split('.')
        # Step 2: Reverse the list of words
        reversed_words = words[::-1]
        # Step 3: Join the reversed list back into a string with dots
        result = '.'.join(reversed_words)
        # Step 4: Return the resulting string
        return result


# Driver code
if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        s = str(input())
        obj = Solution()
        print(obj.reverseWords(s))
