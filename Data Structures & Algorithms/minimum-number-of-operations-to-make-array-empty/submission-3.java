class Solution {
    public int minOperations(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int result = 0;

        for(int n : nums){

            int cnt = map.getOrDefault(n, 0) + 1;
            
            map.put(n, cnt);
        }

        for(int n : map.values()){
            if(n == 1) return -1;

            result += (n + 2)/3;
        }

        return result;
    }
}