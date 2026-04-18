class Solution {
    public boolean check(int[] nums) {
        
        int cnt = 1;
        int len = nums.length;
        for(int i = 1 ; i < len * 2; i++){
            if(nums[(i - 1) % len] <= nums[i % len]){
                cnt++;
            } else {
                cnt = 1;
            }

            if(cnt == len) return true;
        }

        return 1 == len;
    }
}