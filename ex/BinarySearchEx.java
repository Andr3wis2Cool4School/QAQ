public class BinarySearchEx {
    public static int binarySearch(int[] array, int target){
        int L = 0;
        int R = array.length - 1;
        while(L <= R){
            int mid = L + (R - L) / 2; // 2
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target){
                L = mid + 1;
            } else{
                R = mid - 1;
            }
        }
        return -1; // no target value return -1
    }

    public static void main(String[] args){
        int[] array = {2, 3, 5, 6, 8, 10, 12};
        int target = 10;
        int res = binarySearch(array, target);
        System.out.println(res);
    }
}
