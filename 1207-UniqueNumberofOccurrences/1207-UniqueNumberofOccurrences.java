// Last updated: 6/1/2026, 4:46:05 PM
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4
5        for(int i:arr){
6            hm.put(i,hm.getOrDefault(i,0)+1);
7        }
8
9        HashSet<Integer> hs=new HashSet<>(hm.values());
10
11        return hs.size()==hm.size();
12    }
13}