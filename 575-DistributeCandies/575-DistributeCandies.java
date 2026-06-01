// Last updated: 6/1/2026, 5:09:16 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashSet<Integer> hs=new HashSet<>();
4
5        for(int i:candyType){
6            hs.add(i);
7        }
8       
9       return Math.min(hs.size(), candyType.length / 2);
10       
11    }
12}