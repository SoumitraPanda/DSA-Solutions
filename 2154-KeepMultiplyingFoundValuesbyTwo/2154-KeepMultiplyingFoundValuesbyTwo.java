// Last updated: 5/29/2026, 11:09:11 PM
1class Solution {
2    public int findFinalValue(int[] nums, int original) {
3        HashSet<Integer> hs=new HashSet<>();
4        
5
6        for(int i: nums){
7            hs.add(i);
8        }
9
10        while (hs.contains(original)) {
11            original *= 2;
12        }
13        return original;
14    }
15}