class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // List<ArrayList<Integer>> list = new ArrayList<>(nums.length + 1);

        Object[] list = new Object[nums.length + 1];

        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            int cnt = map.getOrDefault(n, 0);
            cnt++;
            map.put(n, cnt);
            ArrayList<Integer> temp = null;
            if(list[cnt] == null){
                temp = new ArrayList<>();
            } else {
                temp = (ArrayList) list[cnt];
            }
            
            temp.add(n);
            list[cnt] = temp;
        }


        List<Integer> resultList = null;
        int i = list.length - 1;
        while(i > 0){

            List<Integer> l = (List) list[i];
            if(l != null && l.size() == k){
                resultList = l;
                break;
            }
            i--;
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    

    }
}
