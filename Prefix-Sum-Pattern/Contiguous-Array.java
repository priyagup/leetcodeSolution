class Solution {
    public int findMaxLength(int[] nums) { 
        int prefixSum =0;
        int maxLength =0;
       
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        for(int i=0; i<nums.length; i++){
           
            if(nums[i] == 0) nums[i] = -1;
            prefixSum += nums[i];
           
            if(map.containsKey(prefixSum)){
                int prevIndex = map.get(prefixSum);
                int length = i - prevIndex;
               
                maxLength = Math.max(maxLength, length);
            }else {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }
}
/*
Imagine you walk a line:
You go right for 1 (+1), and left for 0 (-1)
If you end up at the same place twice (same prefix sum), the trip in between was a closed loop
→ Net zero → Equal 1s and 0s
This is why we can find the longest balanced subarray using just prefix sum and first occurrence tracking.
*/