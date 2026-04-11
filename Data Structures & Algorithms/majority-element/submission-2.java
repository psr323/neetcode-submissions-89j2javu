class Solution {
    public int majorityElement(int[] nums) {
        
        int currMaj = nums[0];
        int cnt = 1;

        for(int i = 1 ; i < nums.length ; i++){
            if(currMaj == nums[i]){
                cnt++;
            } else {
                cnt--;
            }
            if(cnt == 0){
                currMaj = nums[i];
                cnt++;
            }
        }

        return currMaj;
    }
}