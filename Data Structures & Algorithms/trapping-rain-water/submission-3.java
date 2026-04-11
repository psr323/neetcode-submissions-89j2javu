class Solution {
    public int trap(int[] h) {
        
        int leftMax = h[0], rightMax = h[h.length - 1], res = 0;
        int left = 0, right = h.length - 1;
        while(left < right){
            if(leftMax > rightMax){
                right--;
                rightMax = Math.max(rightMax, h[right]);
                res += rightMax - h[right];
            } else {
                left++;
                leftMax = Math.max(leftMax, h[left]);
                res += leftMax - h[left];
            }
        }
        return res;
    }
}
