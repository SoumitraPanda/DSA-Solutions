// Last updated: 5/29/2026, 3:59:13 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=0){
6                int temp=nums[j];
7                nums[j]=nums[i];
8                nums[i]=temp;
9                j++;
10            }
11
12        }
13    }
14}
15
16
17