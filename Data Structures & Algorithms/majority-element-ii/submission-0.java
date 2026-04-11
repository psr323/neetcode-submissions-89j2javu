class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            int val = map.getOrDefault(n, 0) + 1;
            map.put(n, val);
        }

        int target = nums.length / 3;
        List<Integer> list = new ArrayList<>();

        for(var entry : map.entrySet()){

            if(entry.getValue() > target){
                list.add(entry.getKey());
            }
        }


        return list;
    }
}