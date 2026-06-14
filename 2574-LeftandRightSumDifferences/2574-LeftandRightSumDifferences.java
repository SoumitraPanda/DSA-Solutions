// Last updated: 6/14/2026, 11:50:35 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int[] ans=new int[nums.length];
4
5        int leftsum = 0;
6        int rightsum = 0;
7
8        int sum=0;
9
10        ans[0]=0;
11
12        for(int i=1;i<nums.length;i++){
13            leftsum=leftsum+nums[i-1];
14
15            ans[i]=leftsum;
16        } 
17
18        for(int i=nums.length-1;i>=0;i--){
19            ans[i]=Math.abs(ans[i]-rightsum);
20            rightsum+=nums[i];
21            
22        }
23
24        return ans;
25    }
26}