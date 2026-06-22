// Last updated: 6/22/2026, 9:33:52 AM
class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int rigth =nums.length-1;

        while(left<=rigth){
            int mid=left+(rigth-left)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]<target){
                left=mid+1;
            }

            else{
                rigth=mid-1;
            }
        }

        return -1;
    }
}