// Last updated: 6/22/2026, 9:33:26 AM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int []ar=new int[nums.length*2];
        int i=0;
        int j=nums.length*2-1;

        for(int k:nums){
            ar[i]=k;
            ar[j]=k;
            i++;
            j--;

        }

        return ar;
    }
}