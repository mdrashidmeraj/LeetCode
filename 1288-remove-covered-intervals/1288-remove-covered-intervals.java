class Solution {
    class intervalsComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            if(a[0]>b[0]) return 1;
            else if(a[0] == b[0] && a[1]<b[1]) return 1;
            return -1;
        }
    }
    public int removeCoveredIntervals(int[][] intervals) {
        if(intervals.length==1) return 1;
        int count = 0;
        Arrays.sort(intervals,new intervalsComparator());
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] a: intervals){
            System.out.println(a[0]+"      "+a[1]);
            if(a[0]<=end && a[1]<=end){
                continue;
            }
            count++;
            start = a[0];
            end = a[1];
        }
        return ++count;
        
    }
}