class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
      
        double sum = 0;

        //Setting up the window
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
          double maxSum = sum; 

        //Sliding the window
        for(int i = k ; i<nums.length; i++){
            sum = sum - nums[i-k] + nums[i];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum/k;
        
    }
}