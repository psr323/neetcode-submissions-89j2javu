class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> subArrCount = new HashMap<>();

        subArrCount.put(0, 1);
        int sum = 0, count = 0;
        for(int n : nums){

            sum += n;

            int diff = sum - k;

            int curr = subArrCount.getOrDefault(diff, 0); 

            count += curr;

            subArrCount.put(sum, subArrCount.getOrDefault(sum, 0) + 1);
        }

        return count;
        
    }
}