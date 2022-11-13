class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i=0;
        while(i<intervals.length && newInterval[0]>intervals[i][1]){
            result.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && newInterval[1]>=intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        while(i<intervals.length){
            result.add(intervals[i]);
            i++;
        }
        int[][] resultArray = new int[result.size()][2];
        for(int j=0; j<result.size(); j++){
            resultArray[j] = result.get(j); 
        }
        return resultArray;
    }
}