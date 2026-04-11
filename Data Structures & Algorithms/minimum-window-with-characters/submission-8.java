class Solution {
    public String minWindow(String s, String t) {
    int[] tCount = new int[128];
    int[] sCount = new int[128];
    
    for(char c : t.toCharArray()) tCount[c]++;
    
    int required = 0;
    for(int i = 0; i < 128; i++) if(tCount[i] > 0) required++;
    
    int satisfied = 0, minLen = Integer.MAX_VALUE, start = 0;
    int i = 0;
    
    for(int j = 0; j < s.length(); j++){
        char c = s.charAt(j);
        sCount[c]++;
        if(tCount[c] > 0 && sCount[c] == tCount[c]) satisfied++;
        
        while(satisfied == required){
            if(j - i + 1 < minLen){
                minLen = j - i + 1;
                start = i;
            }
            
            c = s.charAt(i);
            if(tCount[c] > 0 && sCount[c] == tCount[c]) satisfied--;
            sCount[c]--;
            i++;
        }
    }
    
    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
}
}
