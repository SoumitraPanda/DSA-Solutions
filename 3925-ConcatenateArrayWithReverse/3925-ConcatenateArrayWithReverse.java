// Last updated: 5/30/2026, 4:46:30 PM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int []ar=new int[nums.length*2];
4        int i=0;
5        int j=nums.length*2-1;
6
7        for(int k:nums){
8            ar[i]=k;
9            ar[j]=k;
10            i++;
11            j--;
12
13        }
14
15        return ar;
16    }
17}