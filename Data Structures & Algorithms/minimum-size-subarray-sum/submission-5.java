class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i = 0, j = 0;
        int sum = 0; int result = Integer.MAX_VALUE;
        while(j < nums.length){
            sum += nums[j];
            while(sum >= target){
                result = Math.min(result, j - i + 1);
                sum -= nums[i];
                i++;
            }
                j++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}