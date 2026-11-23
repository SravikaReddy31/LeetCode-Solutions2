class Solution {
    public int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i=1;i<arr.length;i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}