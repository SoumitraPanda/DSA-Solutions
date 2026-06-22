// Last updated: 6/22/2026, 9:33:29 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];

        int leftsum = 0;
        int rightsum = 0;

        int sum=0;

        ans[0]=0;

        for(int i=1;i<nums.length;i++){
            leftsum=leftsum+nums[i-1];

            ans[i]=leftsum;
        } 

        for(int i=nums.length-1;i>=0;i--){
            ans[i]=Math.abs(ans[i]-rightsum);
            rightsum+=nums[i];
            
        }

        return ans;
    }
}