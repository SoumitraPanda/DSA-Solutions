// Last updated: 6/22/2026, 9:33:35 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs=new HashSet<>();
        

        for(int i: nums){
            hs.add(i);
        }

        while (hs.contains(original)) {
            original *= 2;
        }
        return original;
    }
}