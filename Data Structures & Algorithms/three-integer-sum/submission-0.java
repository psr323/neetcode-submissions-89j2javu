class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> resultSet = new HashSet<>();

        for(int i = 0; i < nums.length ; i++){
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = i+1; j < nums.length ; j++){

                int k = (nums[i] + nums[j]) * -1;
                if(map.containsKey(k)){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(k);
                    
                    Collections.sort(res);
                    resultSet.add(res);

                } else {
                    map.put( nums[j], j);
                }
            }
        }

        return new ArrayList<>(resultSet);
    }
}
