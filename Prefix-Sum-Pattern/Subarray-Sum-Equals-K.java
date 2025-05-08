class Solution {
    public int subarraySum(int[] nums, int k) {
        int count_subarray = 0;
        int currentSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);


        for( int num: nums){
            currentSum += num;
        
            if(map.containsKey(currentSum - k)){
                count_subarray += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count_subarray;
    }
}