// Last updated: 6/13/2026, 7:10:03 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left=0;
4        int rigth =nums.length-1;
5
6        while(left<=rigth){
7            int mid=left+(rigth-left)/2;
8
9            if(nums[mid]==target){
10                return mid;
11            }
12
13            else if(nums[mid]<target){
14                left=mid+1;
15            }
16
17            else{
18                rigth=mid-1;
19            }
20        }
21
22        return -1;
23    }
24}