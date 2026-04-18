class Solution {
    public String longestCommonPrefix(String[] strs) {
        

        String prefix = "";
        int idx = 0;
        for(char c : strs[0].toCharArray()){
            for(String str : strs){
                if(idx >= str.length() || c != str.charAt(idx)){
                    return prefix;
                }
            }
            prefix += c;
            idx++;
        }


        return prefix;
    }
}