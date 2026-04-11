class Solution {
    public boolean check(int[] nums) {
        
       int count = 1;
       int len = nums.length;

       for(int i = 1; i < nums.length * 2 ; i++){
        if(nums[(i - 1) % len] <= nums[i % len]){
            count++;
        } else {
            count = 1;
        }

        if(count == len) return true;
       }

       return len == 1;

    }
}