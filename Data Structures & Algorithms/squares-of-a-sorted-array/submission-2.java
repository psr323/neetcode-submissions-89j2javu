class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int firstNonNeg = -1;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= 0){
                firstNonNeg = i;
                break;
            }
        }

        if(firstNonNeg == -1){
            firstNonNeg = nums.length - 1;
        }

        int l = 0;
        int r = nums.length -1;
        int i = nums.length -1;
        int result[] = new int[nums.length];
        while(l < firstNonNeg && r >= firstNonNeg) {
            int sL = nums[l] * nums[l];
            int sR = nums[r] * nums[r];

            if(sL > sR){
                result[i] = sL;
                l++;
            }
            else {
                result[i] = sR;
                r--;
            }
            i--;

        }

        while(l < firstNonNeg){
            int sL = nums[l] * nums[l];
            result[i] = sL;
            l++;
            i--;
        }

        while(r >= firstNonNeg){
            int sR = nums[r] * nums[r];
            result[i] = sR;
            r--;
            i--;
        }

        return result;

    }
}