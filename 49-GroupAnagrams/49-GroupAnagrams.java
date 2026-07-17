// Last updated: 7/17/2026, 8:40:23 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> groups = new HashMap<>();
4
5        for (String str : strs) {
6            // Count the frequency of each letter
7            char[] count = new char[26];
8
9            for (int i = 0; i < str.length(); i++) {
10                count[str.charAt(i) - 'a']++;
11            }
12
13            // Strings with the same frequencies will have the same key
14            String key = new String(count);
15
16            // Get the existing group
17            List<String> group = groups.get(key);
18
19            // Create a new group if it doesn't exist
20            if (group == null) {
21                group = new ArrayList<>();
22                groups.put(key, group);
23            }
24
25            // Add the original string to its group
26            group.add(str);
27        }
28
29        return new ArrayList<>(groups.values());
30    
31    }
32}