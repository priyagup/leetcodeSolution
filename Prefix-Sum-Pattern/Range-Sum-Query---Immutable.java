class NumArray {

    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n];
        
        for(int i=0; i<nums.length; i++){
            if(i== 0){
                prefixSum[i] = nums[i];
            }else{
                prefixSum[i] = prefixSum[i-1] + nums[i];
            }
            
        }
    }
    
    public int sumRange(int left, int right) {

        if (left == 0) {
            return prefixSum[right];
        }

        return prefixSum[right] - prefixSum[left -1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */