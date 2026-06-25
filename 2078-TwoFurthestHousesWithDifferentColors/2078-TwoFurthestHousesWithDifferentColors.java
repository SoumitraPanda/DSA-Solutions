// Last updated: 6/25/2026, 5:09:32 PM
1class Solution {
2    public int maxDistance(int[] colors) {
3
4        int max=1;
5        int n=colors.length;
6
7        for(int i=0;i<n;i++){
8            if(colors[i]!=colors[n-1]){
9                max=Math.max(max,n-1-i);
10                break;
11            }
12
13            if(colors[n-1-i]!=colors[0]){
14                max=Math.max(max,n-1-i);
15                break;
16            }
17        }
18
19        return max;
20        
21    }
22}