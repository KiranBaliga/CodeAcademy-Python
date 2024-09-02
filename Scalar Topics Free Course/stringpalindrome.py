s = input()

# s[::-1] prints the string in reversed
if s == s[::-1]:
    print("Yes, this is a palindrome")
else:
    print("No, this is not a palindrome")