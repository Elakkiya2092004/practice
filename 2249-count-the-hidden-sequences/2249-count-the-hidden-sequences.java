class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum=0;  long min=0; long max=0;
        for(int diff:differences){
            sum+=diff;
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        }
        return (int)Math.max(0,(upper-lower)-(max-min)+1);
    }
}