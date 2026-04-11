class Solution {
    public int firstMissingPositive(int[] nums) {
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }

        //3, 0, -6, 3, 2
        for(int i = 0 ; i < nums.length ; i++){

            int ele = nums[i];
            int val = Math.abs(ele);

            if(val > 0){
                if(val - 1 < nums.length){
                    if(nums[val - 1] == 0){
                        nums[val - 1] = (nums.length + 1) * -1;
                    } else if(nums[val - 1] > 0) {
                        nums[val - 1] = Math.abs(nums[val - 1]) * -1;
                    }
                }
            }
        }

        for(int i = 1; i < nums.length + 1 ;i++){
            if(nums[i - 1] >= 0){
                return i;
            }
        }

        return nums.length + 1;
    }
}