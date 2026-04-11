class Solution {
    public String minWindow(String s, String t) {
        

        int i = 0, j = t.length() - 1;
        String result = "";

        while(j < s.length() & i <= j){

            String sub = s.substring(i, j + 1);

            if(sub.length() >= t.length() && contains(sub, t)){
                if(result.isBlank()){
                    result = sub;
                } else {
                    result = result.length() > sub.length() ? sub : result;
                }
                i++;
            } else {
                j++;
            }
        }

        return result;
    }

    private boolean contains(String s, String t){
        Map<Character, Integer> count = new HashMap<>();

        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(count.containsKey(c)){
                int val = count.get(c);
                val--;
                if(val > 0){
                    count.put(c, val);
                } else {
                    count.remove(c);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
