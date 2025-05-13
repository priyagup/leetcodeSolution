class Solution {
    public int maxArea(int[] height) {
        int left =0; 
        int right = height.length -1;
        int maxArea = 0;

            while(left < right){
                int amount_of_water = Math.min(height[left], height[right]) * ((right - left));
                maxArea = Math.max(amount_of_water,maxArea);

                // Move the pointer at the shorter line inward
                if(height[left] < height[right] ){
                    left++;
                }else {
                    right--;
                }
            }
        
        return maxArea;

    }
}