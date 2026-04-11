class Solution {
    public boolean isPalindrome(String s) {
        
        int l = 0, r = s.length() - 1;

        while(l < r){
            if(Character.isWhitespace(s.charAt(l)) || !Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(Character.isWhitespace(s.charAt(r)) || !Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }

            if(!isSameChar(s.charAt(l), s.charAt(r))){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    private boolean isSameChar(char a, char b){

        return Character.toUpperCase(a) ==  Character.toUpperCase(b);


    }
}
