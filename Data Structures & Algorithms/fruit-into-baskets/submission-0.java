class Solution {
    public int totalFruit(int[] fruits) {

        int count = 0; int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
       
       int l = 0;

       for(int r = 0 ; r < fruits.length ; r++){
        map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
        count++;
        while(map.size() > 2){
            int newCount = map.get(fruits[l]) - 1;
            count--;
            if(newCount == 0){
                map.remove(fruits[l]);
            } else {
                 map.put(fruits[l], newCount);
            }
            l++;
        }

        res = Math.max(count, res );
       }

       return res;
}

}

//[1,2,3,2,2, 4, 5,6] 