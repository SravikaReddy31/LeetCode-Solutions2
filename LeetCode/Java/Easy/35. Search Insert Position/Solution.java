class Solution {
    public int searchInsert(int[] arr, int target) {
        int i=0; // low
        int j=arr.length-1; //high
        while(i <= j) {
            int mid = i+(j-i)/2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }
}