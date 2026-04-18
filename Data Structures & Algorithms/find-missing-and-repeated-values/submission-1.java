class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        Set<Integer> set = new HashSet<>();
        int res[] = new int[2];

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                int num = grid[i][j];
                if(set.contains(num)){
                    res[0] = num;
                } else {
                    set.add(num);
                }
            }
        }

        for( int i = 1 ; i < grid.length * grid.length + 1 ; i++){
            if(!set.contains(i)){
                res[1] = i;
                break;
            }
        }

        return res;
    }
}