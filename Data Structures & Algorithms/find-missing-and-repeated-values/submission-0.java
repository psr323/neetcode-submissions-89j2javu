class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int map[] = new int[grid.length * grid.length];

        int[] res = new int[2];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                map[grid[i][j] - 1]++;
            }
        }

        for(int i = 0 ; i < map.length ; i++){
            if(map[i] > 1){
                res[0] = i + 1;
            }
            if(map[i] == 0){
                res[1] = i+1;
            }
        }

        return res;
    }
}