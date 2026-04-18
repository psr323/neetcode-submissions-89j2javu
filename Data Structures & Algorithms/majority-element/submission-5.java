class Solution {
    public int majorityElement(int[] nums) {
        
        int ele = nums[0];
        int cnt = 0;

        for(int n : nums){
            if(ele == n){
                cnt++;
            } else {
                cnt--;
                if(cnt == 0){
                    ele = n;
                    cnt = 1;
                }
            }
        }

        return ele;
    }
}