// Last updated: 6/12/2026, 12:27:26 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4
5        for (int num : nums) {
6            set.add(num);
7        }
8
9        int longest = 0;
10
11        for (int num : set) {
12            if (!set.contains(num - 1)) {
13                int curr = num;
14                int streak = 1;
15
16                while (set.contains(curr + 1)) {
17                    curr++;
18                    streak++;
19                }
20
21                longest = Math.max(longest, streak);
22            }
23        }
24
25        return longest;
26    }
27}