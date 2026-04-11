class Solution {
    public void sortColors(int[] nums) {
        
        int l = 0, r = nums.length - 1;

        while(l < r){
            if(nums[l] == 0){
                l++;
                continue;
            }
            if(nums[r] == 0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;

                r--;
                l++;
            } else {
                r--;
            }
        }
        r = nums.length - 1;

        while(l < r){

            if(nums[l] == 1){
                l++;
                continue;
            }
            if(nums[r] == 1){
                 int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;

                r--;
                l++;
            } else {
                r--;
            }
        }
    }
}

// 1 1 1 2 0 2 0 0 1 2 1

// 0 0 0 2 1 2 1 1 1 2 1