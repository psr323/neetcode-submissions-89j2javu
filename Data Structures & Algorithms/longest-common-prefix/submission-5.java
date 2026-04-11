class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int len = 0;
        for(char x : strs[0].toCharArray()){
            for(String stri : strs){
                if(stri.length() <= len){
                    return stri.substring(0, len);
                }
                char y = stri.charAt(len);
                if(x != y){
                    return stri.substring(0, len);
                }
            }
            len++;
        }

        return strs[0].substring(0, len);
    }
}