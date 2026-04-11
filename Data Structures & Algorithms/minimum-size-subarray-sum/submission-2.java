class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i = 0, j = 0;

        int sum = 0;
        int count = Integer.MAX_VALUE;

        while(i <= j && j < nums.length){
            sum += nums[j];

            if(sum < target){
                j++;
            } else {
                // 
                sum -= nums[j];
                count = Math.min(count, j-i + 1);
                if(i == j){
                    j++;
                } else {
                    sum -= nums[i];
                }
                i++;
            }
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }
}