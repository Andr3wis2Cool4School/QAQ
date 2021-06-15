public class RotatedArray {
    public static int search(int[] nums, int target){
        int L = 0;
        int R = nums.length - 1;
        
        while(L <= R){
            int mid = L + (R - L) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[0] <= nums[mid]){
                if (nums[0] <= target && target < nums[mid]){
                    R = mid - 1;
                } else {
                    L = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[nums.length -1]){
                    L = mid + 1;
                } else {
                    R = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int target2 = 3;

        int res1 = search(nums, target1);
        int res2 = search(nums, target2);
        System.out.println(res1);
        System.out.println(res2);
        }
}


