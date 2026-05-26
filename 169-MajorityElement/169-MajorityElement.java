// Last updated: 5/26/2026, 4:50:03 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        
5        
6        for(int i : nums){
7            map.put(i,map.getOrDefault(i,0)+1);
8        }
9        for(int i : nums){
10            if(map.get(i)>nums.length/2){
11                return i;
12            }
13        }
14    return -1;
15    }
16}