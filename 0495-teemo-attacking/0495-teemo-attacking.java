class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int c=0;
        int n=timeSeries.length-1;
        for(int i=0;i<n;i++){
          c+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        c+=duration;
        return c;
    }
}