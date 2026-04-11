class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n1 = -1, n2 = -1, cnt1 = 0, cnt2 = 0;
        int len = nums.length;
        for(int n : nums){
            if(n == n1){
                cnt1++;
            } else if(n == n2){
                cnt2++;
            } else if(cnt1 == 0){
                cnt1++;
                n1 = n;
            } else if(cnt2 == 0){
                cnt2++;
                n2 = n;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = cnt2 = 0;

        for(int n : nums){
            if(n == n1){
                cnt1++;
            } else if(n == n2){
                cnt2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(cnt1 > len/3){
            list.add(n1);
        }
        if(cnt2 > len/3){
            list.add(n2);

        }

        return list;
    }
}