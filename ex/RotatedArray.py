
'''
将数组一分为二，其中一定有一个是有序的，另一个可能是有序，也能是部分有序。

此时有序部分用二分法查找。无序部分再一分为二，其中一个一定有序，另一个可能有序，可能无序。

就这样循环. 
'''

def search(nums, target):
    if len(nums) == 0:
        return -1
    L = 0
    R = len(nums) - 1
    while L <= R:
        mid = L + (R-L)//2
        if nums[mid] == target:
            return mid 
        if nums[0] <= nums[mid]:
            if nums[0] <= target and target < nums[mid]:
                R = mid - 1
            else: 
                L = mid + 1
        else:
            if nums[mid] < target and target <= nums[len(nums) -1 ]:
                L = mid + 1
            else:
                R = mid - 1
    return -1





nums = [4, 5, 6, 7, 0, 1, 2]
target = 0

print(search(nums, target))

target = 3
print(search(nums, target))
