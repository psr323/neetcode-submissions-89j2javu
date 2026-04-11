class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        if(nums.length < 2) return false;

        Map<Integer, Integer> prefixSum = new HashMap<>();

        // prefixSum.add(0, -1);

        int sum = 0;
        for(int i = 0; i < nums.length; i++){

            sum += nums[i];

            int r = sum % k;

            if(r == 0) return true;

            if(!prefixSum.containsKey(r)){
                prefixSum.put(r, i);
            } else if(i - prefixSum.get(r) > 1){
                return true;
            }


        }

        return false;
    }
}