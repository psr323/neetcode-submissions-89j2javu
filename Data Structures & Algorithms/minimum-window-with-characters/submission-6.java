class Solution {
    public String minWindow(String s, String t) {
        

        int i = 0, j = 0;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int minLen = Integer.MAX_VALUE;
        int[] res = new int[2];

        while(j < s.length() && i <= j){
            char c = s.charAt(j);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            // String sub = s.substring(i, j + 1);
            // System.out.println("SUB = " + sub);
            while(contains(sMap, tMap)){
                if(minLen > j - i + 1){
                    minLen = j - i + 1;
                    res[0] = i;
                    res[1] = j;
                }
                if(sMap.containsKey(s.charAt(i))){
                    int v = sMap.get(s.charAt(i));
                    v--;
                    if(v > 0){
                        sMap.put(s.charAt(i), sMap.get(s.charAt(i)) - 1);
                    } else {
                        sMap.remove(s.charAt(i));
                    }
                }
                i++;
            } 
                j++;
            
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1) ;
    }

    private boolean contains(Map<Character, Integer> s, Map<Character, Integer> t){
       
       for(char key : t.keySet()){
        int need = t.get(key);
        int actual = s.getOrDefault(key, 0);
        if(actual < need){
            return false;
        }
       }
        return true;
    }
}
