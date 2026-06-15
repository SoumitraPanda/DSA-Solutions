// Last updated: 6/15/2026, 4:44:42 PM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int left=0;
4        int piv=0;
5        
6        int[] ans=new int[nums.length];
7
8        for(int i:nums){
9            if(i==pivot){
10                piv++;
11            }
12            else if(i<pivot){
13                left++;
14            }
15
16        }
17
18        int right=left+piv;
19        int mid=left;
20        int idx=0;
21
22        for(int i=0;i<ans.length;i++){
23            if(nums[i]<pivot){
24                ans[idx++]=nums[i];
25            }
26
27            else if(nums[i]>pivot){
28                ans[right++]=nums[i];
29            }
30
31            else{
32                ans[mid++]=nums[i];
33            }
34
35        }
36
37        return ans;
38
39    }
40}