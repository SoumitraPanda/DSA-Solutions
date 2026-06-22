// Last updated: 6/22/2026, 9:33:32 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        int[] result = new int[friends.length];
        int j = 0;

        HashSet<Integer> hs=new HashSet<>();

        for(int i:friends){
            hs.add(i);
        }

        for(int i:order){
            if(hs.contains(i)){
                result[j++]=i;
            }
        }
        return result;
    }
}