class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        int i = 0, j = 0;

        while(j < nums.length){
            if(!set.contains(nums[j])){
                nums[i] = nums[j];
                i++;
                set.add(nums[j]);
            }

            j++;
        }

        return i;
    }
}