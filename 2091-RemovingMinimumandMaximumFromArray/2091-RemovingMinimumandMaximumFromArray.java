// Last updated: 8/30/2026, 12:23:49 PM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n= nums.length;
4
5        int min=0;
6        int max=0;
7
8        for(int i=0;i<n;i++){
9            if(nums[i]<nums[min]){
10                min=i;
11            }
12
13            if(nums[i]>nums[max]){
14                max=i;
15            }
16        }
17
18        int left=Math.min(min,max);
19        int right=Math.max(min,max);
20
21        int leftside=right+1;
22        int rightside=n-left;
23        int bothside= (left+1)+(n-right);
24
25        int ans=Math.min(leftside,Math.min(rightside,bothside));
26
27        return ans;
28    }
29}