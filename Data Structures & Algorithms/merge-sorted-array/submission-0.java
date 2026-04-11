class Solution {
    public void merge(int[] nums1, int x, int[] nums2, int y) {
        
        int i = nums1.length - 1;
        int m = x-1;
        int n = y-1;
        while(m >= 0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[i--] = nums1[m--];
            }
            else {
                nums1[i--] = nums2[n--];
            }
            
        }

        while(m >= 0){
            nums1[i--] = nums1[m--];
        }

        while(n >= 0){
            nums1[i--] = nums2[n--];
        }
    }
}