class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0, j = nums.length -1 ;

        while(i <= j){
            if(nums[j] != val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
            } else {
                j--;
            }
        }

// System.out.println(Arrays.toString(nums));
        return j+ 1;
    }
}