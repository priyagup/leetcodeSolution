class Solution {
    public int climbStairs(int n) {
        int result =0;

        if( n < 2) return 1;

        int a=1, b=1;

        for(int i = 2; i <= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        /*
        result = climbStairs(n-1) + climbStairs(n-2);

        return result; */

        return b;
    }
}