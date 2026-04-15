class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i = 0 ; i < nums.length ; i++){
            int num = Math.abs(nums[i]) - 1;

            if(nums[num] < 0) return num + 1;

            else {
                nums[num] *= -1; 
            }
        }

        return -1;
    }
}
