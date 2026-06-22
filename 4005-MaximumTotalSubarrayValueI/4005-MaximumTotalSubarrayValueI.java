// Last updated: 6/22/2026, 9:33:28 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }

        return 1L*k*(max-min);
    }
}