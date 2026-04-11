class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    maxAscendingSum(nums) {

         
        let res = 0;
        let count = 0 ;
        let prev = -1;

        nums.forEach(n => {
            if(n > prev){
                count += n;
                res = Math.max(count, res);
                prev = n;
            } else {
                count = n;
                prev = n;
            }

        })

        return res;
    }
}
