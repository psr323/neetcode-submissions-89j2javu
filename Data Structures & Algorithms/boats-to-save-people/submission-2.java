class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        //1 2 4 5 -> 6
        //1 2 2 3 3 -> 3
        Arrays.sort(people);
        int result = 0;

        int l = 0, r = people.length - 1;

        while(l <= r){

            if(people[r] + people[l] <= limit){
                l++;
            }

            result++;
            r--;
        }
        return result;
    }
}