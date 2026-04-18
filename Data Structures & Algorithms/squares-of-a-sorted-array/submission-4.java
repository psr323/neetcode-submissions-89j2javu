class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i = 0, j = nums.length - 1;
        int k = nums.length - 1;

        int res[] = new int[nums.length];

        while(i <= j){
            int i1 = nums[i] * nums[i];
            int j1 = nums[j] * nums[j];

            if(i1 > j1){
               res[k--] = i1;
               i++;
            } else {
                res[k--] = j1;
                j--;
            }
        }

        return res;
    }
}