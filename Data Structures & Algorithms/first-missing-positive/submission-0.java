class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int x = 1 ; x <= nums.length; x++){
            if(!set.contains(x)){
                return x;
            }
        }

        return nums.length+1;
    }
}