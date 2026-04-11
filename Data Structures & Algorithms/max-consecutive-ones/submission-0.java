class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;

        int curr = 0;
        for(int num : nums){

            
            if(num == 0) curr = 0;
            else curr++;

            if(curr > count) count = curr;
        }

        return count;
    }
}