// Last updated: 6/13/2026, 4:35:13 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int count=0;
5        int num=0;
6
7        for(int i=cost.length-1;i>=0;i--){
8            count++;
9            if(count%3==0){
10                continue;
11            }
12
13            else{
14                num+=cost[i];
15            }
16        }
17
18        return num;
19    }
20}