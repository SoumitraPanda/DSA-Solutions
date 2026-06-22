// Last updated: 6/22/2026, 9:33:36 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int left=0;
        int piv=0;
        
        int[] ans=new int[nums.length];

        for(int i:nums){
            if(i==pivot){
                piv++;
            }
            else if(i<pivot){
                left++;
            }

        }

        int right=left+piv;
        int mid=left;
        int idx=0;

        for(int i=0;i<ans.length;i++){
            if(nums[i]<pivot){
                ans[idx++]=nums[i];
            }

            else if(nums[i]>pivot){
                ans[right++]=nums[i];
            }

            else{
                ans[mid++]=nums[i];
            }

        }

        return ans;

    }
}