class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] > 0) break;
            int left = i+1;
            int right = nums.length -1;

            while(left < right){
                
                int total = nums[i] + nums[left] + nums[right];

                if(total > 0){
                    right--;
                }else if(total < 0){
                    left++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    // Skip duplicates on left
                    while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicates on right
                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }

           
        }
         return res;
    }
}