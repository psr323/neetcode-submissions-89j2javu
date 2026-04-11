class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0) break;

            int l = i+1, r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    Collections.sort(list);
                    result.add(list);
                    l++;
                    r--;
                } else if(sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
