def mySqirt(x):
    L = 0
    R = x
    while L <= R:
        mid = L + (R - L) // 2
        if mid ** mid == x:
            return mid
        if mid ** mid < x:
            L = mid + 1
        else: 
            R = mid - 1
    return -1

x = 8
print(mySqirt(x))

x = 4
print(mySqirt(x))
