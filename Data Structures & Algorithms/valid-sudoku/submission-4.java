class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character> row;
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<String, Set<Character>> sq = new HashMap<>();
        

        for(int r = 0 ; r < 9 ; r++){
            row = new HashSet<>();
            for(int c = 0 ; c < 9 ; c++){
                char ch = board[r][c];
                if( ch == '.') continue;
                String sqKey = r/3 + "_" + c/3;
                Set<Character> sqset = sq.getOrDefault(sqKey, new HashSet<>());
                Set<Character> colset = col.getOrDefault(c, new HashSet<>());

                if(row.contains(ch) || colset.contains(ch) || sqset.contains(ch)){
                    return false;
                }

                row.add(ch);

                colset.add(ch);
                col.put(c, colset);

                sqset.add(ch);
                sq.put(sqKey, sqset);
            }
        }

        return true;

    }
}
