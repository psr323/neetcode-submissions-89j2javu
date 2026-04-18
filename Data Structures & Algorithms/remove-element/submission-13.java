class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0, j = nums.length -1;

        while(i < j){

            if(nums[i] != val){
                i++;
            } else {
                if(nums[j] != val){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
                j--;
            }
        }

        if (j >= 0 && nums[j] == val) {
    return j;
}
return j < 0 ? 0 : j + 1;
    }
}