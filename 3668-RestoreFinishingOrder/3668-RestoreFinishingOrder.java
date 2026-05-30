// Last updated: 5/30/2026, 5:01:03 PM
1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        
4        int[] result = new int[friends.length];
5        int j = 0;
6
7        HashSet<Integer> hs=new HashSet<>();
8
9        for(int i:friends){
10            hs.add(i);
11        }
12
13        for(int i:order){
14            if(hs.contains(i)){
15                result[j++]=i;
16            }
17        }
18        return result;
19    }
20}