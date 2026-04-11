class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0){
            return 0;
        }
        
        int i = 0, j = 0;
        int res = 1;
        int count = 1;

        Map<Character, Integer> set = new HashMap<>();

        while(j < s.length()){
            char c = s.charAt(j);

            if(set.containsKey(c)){
                // count = j - set.get(c);
                // set = new HashMap<>();
                i = Math.max(set.get(c) + 1, i);
                
            }
            set.put(c, j);
            res = Math.max(res, j - i + 1);
            j++;
        }

        return res;
    }
}
