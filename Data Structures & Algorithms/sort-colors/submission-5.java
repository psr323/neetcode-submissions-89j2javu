class Solution {
    private void swap(int[] arr, int i, int j ){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        
        int i = 0, l = 0, r = nums.length - 1;

        while( i <= r){

            if(nums[i] == 0){
                swap(nums, i, l);
                l++;
                i++;

            } else if(nums[i] == 2){
                swap(nums, i, r);
                r--;
                
            } else {
                i++;
            }
        }
    }
}