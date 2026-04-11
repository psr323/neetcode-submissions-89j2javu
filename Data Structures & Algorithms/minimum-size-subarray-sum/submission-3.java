class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i = 0, j = 0, count = 0;
        int sum = 0; int result = Integer.MAX_VALUE;

        while(j < nums.length){
            sum += nums[j];
            count++;
            while(sum > target){
                if(sum - nums[i] < target) break;
                sum -= nums[i];
                i++;
                count--;

            }
                j++;
            
            if(sum >= target)
            result = Math.min(result, count);
        }


        return result == Integer.MAX_VALUE ? 0 : result;
    }
}