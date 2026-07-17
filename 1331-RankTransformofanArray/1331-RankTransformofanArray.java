// Last updated: 7/17/2026, 5:53:16 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        Map<Integer,Integer> hm =new HashMap<>();
4
5        int[] sortedArr = arr.clone();
6        Arrays.sort(sortedArr);
7
8        int idx=1;
9
10        for(int i:sortedArr){
11            if(!hm.containsKey(i)){
12                hm.put(i,idx++);
13            }
14        }
15
16        for (int i = 0; i < arr.length; i++) {
17            arr[i] = hm.get(arr[i]);
18        }
19
20        return arr;
21    }
22}