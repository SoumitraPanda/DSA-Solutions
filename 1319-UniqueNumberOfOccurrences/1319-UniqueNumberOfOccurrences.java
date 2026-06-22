// Last updated: 6/22/2026, 9:33:46 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        HashSet<Integer> hs=new HashSet<>(hm.values());

        return hs.size()==hm.size();
    }
}