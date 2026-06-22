// Last updated: 6/22/2026, 9:33:43 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            
            sum+=gain[i];
            max=Math.max(max,sum);
            
        }

        return max;
    }
}