// Last updated: 6/22/2026, 9:34:09 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int missing = -1;

        // while (set.contains(missing)) {
        //     missing++;
        // }

        for (int i = 1; i <= set.size() + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return set.size()+1;



    }
}