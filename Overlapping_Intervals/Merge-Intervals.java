class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();

        for(int[] interval : intervals){
             // If merged is empty or no overlap, add interval
            if(result.isEmpty() || result.get(result.size() - 1)[1] < interval[0])
                result.add(interval);

            else {
                 // Overlap: merge with the last interval
                result.get(result.size() -1 )[1] = Math.max(result.get(result.size() - 1 )[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}