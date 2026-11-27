class Solution {
    public int climbStairs(int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        int a = climbStairs(n-2);
        int b = climbStairs(n-1);
        return a+b;
    }
}