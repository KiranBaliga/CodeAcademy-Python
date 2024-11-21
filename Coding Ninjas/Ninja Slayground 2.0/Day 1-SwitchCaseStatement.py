from typing import List
import math
def areaSwitchCase(ch: int, a: List[float]) -> str:
    if ch == 1:
        # Calculate the area of a circle: ?r?
        r = a[0]
        area = math.pi * r * r  # Use math.pi for higher precision
    elif ch == 2:
        # Calculate the area of a rectangle: l ? b
        l, b = a
        area = l * b
    else:
        raise ValueError("Invalid choice")
    
    # Return area formatted to 5 decimal places
    return "{:.5f}".format(area)
# Example usage:
if __name__ == "__main__":
    # Sample input
    ch = int(input())
    a = list(map(float, input().split()))
    
    # Function call
    print(areaSwitchCase(ch, a))
