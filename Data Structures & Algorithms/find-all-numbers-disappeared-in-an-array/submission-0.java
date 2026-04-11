class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> res = new ArrayList<>();

        for(int i : nums){
            int index = Math.abs(i);
            if(nums[index - 1] > 0){
                nums[index - 1] = nums[index - 1] * -1;
            }
        }

        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
        
    }
}