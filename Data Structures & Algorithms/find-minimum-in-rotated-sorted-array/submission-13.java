class Solution {
    public int findMin(int[] nums) {
        //[3,4,5,6,1,2]
        int l = 0, r = nums.length -1 ;

        while(l < r){

            int mid = (l + r)/2;

            if(nums[mid] > nums[r]){
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return nums[l];
    }
}
