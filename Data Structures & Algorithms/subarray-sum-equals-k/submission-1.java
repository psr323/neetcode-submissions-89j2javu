class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        int sum = 0;
    
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int n : nums){
            sum = sum + n;

            int d = sum - k;

            int c = map.getOrDefault(d, 0);
            count += c;

            int curr = map.getOrDefault(sum, 0) + 1;
            map.put(sum, curr);
        }


        return count;
    }
}