// Last updated: 6/12/2026, 12:57:11 PM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int min= Integer.MAX_VALUE;
4        int max = Integer.MIN_VALUE;
5
6        for(int i:nums){
7            min=Math.min(min,i);
8            max=Math.max(max,i);
9        }
10
11        return 1L*k*(max-min);
12    }
13}