class Solution {
    public int arrayPairSum(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        for(int i=0;i<arr.length;i+=2) {
            max += arr[i];
        }
        return max;
    }
}