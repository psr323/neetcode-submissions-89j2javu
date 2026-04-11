class Solution {
    public String largestNumber(int[] nums) {
        
        String[] arr = new String[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a,b) -> {
           return (b+a).compareTo(a+b);
        });

        String res = "";

        for(String str : arr){
            if(res.equals("") && str.equals("0")) continue;

            res += str;
        }
        return res.isBlank() ? "0" : res;

    }
}