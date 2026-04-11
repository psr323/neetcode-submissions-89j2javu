class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int res[] = new int[nums.length];

        int i = 0, j = nums.length -1 ;
        int index = nums.length -1 ;

        while(i <= j){
            int n = 0;
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                n = nums[i];
                i++;
            } else {
                n = nums[j];
                j--;
            }
           res[index] = n * n;
           index--;
        }

        return res;
    }
}