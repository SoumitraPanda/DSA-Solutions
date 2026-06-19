// Last updated: 6/19/2026, 9:08:06 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max=0;
4        int sum=0;
5        for(int i=0;i<gain.length;i++){
6            
7            sum+=gain[i];
8            max=Math.max(max,sum);
9            
10        }
11
12        return max;
13    }
14}