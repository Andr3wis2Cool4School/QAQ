public class MySqrit{
    public static int mySqrit(int x){
        int L = 0, R = x;
        while (L <= R){
            int mid = L + (R - L) / 2;
            if (mid * mid == x){
                return mid;
            } else if(mid*mid < x){
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        
        int res1 = mySqrit(8);
        System.out.println(res1);

        
        int res2 = mySqrit(4);
        System.out.println(res2);
    }
}

