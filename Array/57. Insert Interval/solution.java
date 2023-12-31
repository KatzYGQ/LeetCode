class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged=new ArrayList<>();
        int index=0;
        int lowVal = newInterval[0];
        int highVal = newInterval[1];

        while(index < intervals.length && intervals[index][1]<newInterval[0]){
           merged.add(intervals[index++]);
        }

        while(index < intervals.length && intervals[index][0] <= newInterval[1]){
            lowVal=Math.min(lowVal,intervals[index][0]);
            highVal=Math.max(highVal,intervals[index][1]);
            index++;
        }

        merged.add(new int[]{lowVal,highVal});
        while(index <intervals.length){
            merged.add(intervals[index++]);
        }

        return merged.toArray(new int[merged.size()] [] );
        
    }
}         
