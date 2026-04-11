class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length * 2];
        
        for(int i = 0 ; i < (nums.length * 2 ); i++){
            int index = i;
            if(index >= nums.length){
                index = index - nums.length;
            }
            // System.out.println("Index = " + index + " i = " + i);
            arr[i] = nums[index];
        }

        return arr;
    }
}