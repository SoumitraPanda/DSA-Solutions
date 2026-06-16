// Last updated: 6/16/2026, 8:55:27 AM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        for (int i = digits.length - 1; i >= 0; i--) {
4
5            if (digits[i] < 9) {
6                digits[i]++;
7                return digits;
8            }
9
10            digits[i] = 0;
11        }
12
13        int[] result = new int[digits.length + 1];
14        result[0] = 1;
15
16        return result;
17    }
18}