class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        for(int j=0;j<arr.length;j++) {
            if(arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }
        for(int k=i;k<arr.length;k++) {
            arr[k] = 0;
        }
    }
}