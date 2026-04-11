class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        while(n >= 1){

            int sq = 0;

            while(n > 0){
                int l = n % 10;
                sq = sq + (l * l);
                n = n/10;
            }

            n = sq;
            if(set.contains(n)) return false;

            if(n == 1) return true;

            set.add(n);
        }

        return false;
    }
}
