// Last updated: 5/28/2026, 7:09:54 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4        for (int i : nums) {
5            result ^= i;
6        }
7        return result;
8    }
9}