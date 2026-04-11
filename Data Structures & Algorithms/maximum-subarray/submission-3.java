class Solution {
    public int maxSubArray(int[] nums) {
        //[2,-3,4,-2,2,1,-1,4]

        int result = nums[0];
        int sum = 0;
        for(int n : nums){
            if(sum < 0){
                sum = 0;
            }
            sum += n;
            result = Math.max(result, sum);
        }
        return result;
    }
}
