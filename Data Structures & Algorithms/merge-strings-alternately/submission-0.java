class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String res = "";

        int len = Math.min(word1.length(), word2.length());
        int i = 0;

        while( i < len * 2 ){
            if(i % 2 == 0){
                res += word1.charAt(i/2);
            } else {
                res += word2.charAt(i/2);
            }

            i++;
        }

        i = i/2;
        while( i < word1.length()){
            res += word1.charAt(i++);
        }

        while( i < word2.length()){
            res += word2.charAt(i++);
        }

        return res;
    }
}