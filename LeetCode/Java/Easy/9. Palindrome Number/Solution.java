class Solution {
    public boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while(n > 0) {
            int rem = n % 10;
            rev = rev*10+rem;
            n /= 10;
        }
        if(temp == rev) {
            return true;
        }
        return false;
    }
}