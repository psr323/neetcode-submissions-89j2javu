class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character> row;
        // Set<Character> col = new HashSet<>();
        Map<String, Set<Character>> col = new HashMap<>();
        Map<String, Set<Character>> sq = new HashMap<>();
        

        for(int i = 0 ; i < 9 ; i++){
            row = new HashSet<>();
            for(int j = 0 ; j < 9 ; j++){
                char c = board[i][j];
                if( c == '.') continue;
                String sqKey = i/3 + "_" + j/3;
                String colKey = "_" + j;
                Set<Character> sqset = sq.getOrDefault(sqKey, new HashSet<>());
                Set<Character> colset = col.getOrDefault(colKey, new HashSet<>());

                if(row.contains(c) || colset.contains(c) || sqset.contains(c)){
                    return false;
                }

                row.add(c);

                colset.add(c);
                col.put(colKey, colset);

                sqset.add(c);
                sq.put(sqKey, sqset);
            }
        }

        return true;

    }
}
