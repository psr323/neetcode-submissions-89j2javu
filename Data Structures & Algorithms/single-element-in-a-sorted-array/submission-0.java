class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int l = 0, r = nums.length - 1;

        while(l < r){

            int mid = ( l + r )/2;
            int index = mid - 1 ;
            if(mid % 2 == 0){
                index = mid + 1;
            }
            if(nums[mid] != nums[index]){
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return nums[r];
    }
}