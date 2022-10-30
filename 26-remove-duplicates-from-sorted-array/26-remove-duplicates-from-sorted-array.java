class Solution {
    public int removeDuplicates(int[] nums) {
        int location = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[location]) {
                location++;
                nums[location] = nums[i];
            }
        }
        return location + 1;
    }
}