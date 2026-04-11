class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            sum += n;

            int diff = sum % k;

            if(diff == 0 && i >= 1) return true;

            if(map.containsKey(diff) && i - map.get(diff) > 1 ){
                return true;
            }
            if(!map.containsKey(diff))
            map.put(diff, i);
        }

        return false;
    }
}