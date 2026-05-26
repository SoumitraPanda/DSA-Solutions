// Last updated: 5/26/2026, 4:36:13 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6        HashMap<Character, Integer> countMap = new HashMap<>();
7        for (char c : s.toCharArray()) {
8            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
9        }
10        for (char c : t.toCharArray()) {
11            if (!countMap.containsKey(c) || countMap.get(c) == 0) {
12                return false;
13            }
14            countMap.put(c, countMap.get(c) - 1);
15        }
16        return true;
17    }
18}