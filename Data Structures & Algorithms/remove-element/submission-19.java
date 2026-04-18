class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0, r = nums.length;

        while( i < r){

            if(nums[i] == val){
                nums[i] = nums[--r];
            } else {
                i++;
            }
        }

        return r;
    }
}