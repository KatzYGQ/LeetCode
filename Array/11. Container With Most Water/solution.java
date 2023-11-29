class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r =height.length-1;

        int maxWater = 0;

        while(l < r ){
            int h = Math.min(height[l], height[r]);
            maxWater=Math.max(maxWater, h*(r-l));
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }

        return maxWater;
    }
}
