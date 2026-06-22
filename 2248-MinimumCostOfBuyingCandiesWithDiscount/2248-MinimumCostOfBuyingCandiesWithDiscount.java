// Last updated: 6/22/2026, 9:33:38 AM
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count=0;
        int num=0;

        for(int i=cost.length-1;i>=0;i--){
            count++;
            if(count%3==0){
                continue;
            }

            else{
                num+=cost[i];
            }
        }

        return num;
    }
}