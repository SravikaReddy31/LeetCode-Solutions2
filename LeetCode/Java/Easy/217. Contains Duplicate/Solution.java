class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=j+1;i<nums.length;i++) {
            if(nums[j] == nums[i]) {
                j++;
                return true;
            }
        }
        return false;
    }
}