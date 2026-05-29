// Last updated: 5/29/2026, 3:36:06 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        HashSet<Integer> a= new HashSet<>();
4
5        for(int i:nums){
6            a.add(i);
7        } 
8        for (int i = 0; i <= nums.length; i++) {
9            if (!a.contains(i)) {
10                return i;
11            }
12        }
13
14        return -1;
15    }
16}