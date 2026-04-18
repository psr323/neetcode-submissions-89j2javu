class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int i = 0 ; i < nums.length ; i++){
            int ele = Math.abs(nums[i]);
            if(nums[ele - 1] > 0)
            nums[ele - 1] = nums[ele - 1] * -1;
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                res.add(i + 1);
            }
        }
        return res;
    }
}