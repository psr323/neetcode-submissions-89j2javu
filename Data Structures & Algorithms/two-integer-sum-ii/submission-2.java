class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < numbers.length ; i++){
            Integer curr = map.get(numbers[i]);
            if(curr == null){
                map.put(target - numbers[i], i);
            } else {
                return new int[]{curr + 1, i+1};
            }
        }

        return new int[]{-1, -1};
    }
}
