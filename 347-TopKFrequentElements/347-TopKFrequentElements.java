// Last updated: 6/9/2026, 5:37:41 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> freq = new HashMap<>();
4
5        // Count frequencies
6        for (int num : nums) {
7            freq.put(num, freq.getOrDefault(num, 0) + 1);
8        }
9
10        // Min Heap based on frequency
11        PriorityQueue<Map.Entry<Integer, Integer>> pq =
12                new PriorityQueue<>(
13                    (a, b) -> a.getValue() - b.getValue()
14                );
15
16        // Keep only k most frequent elements
17        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
18            pq.offer(entry);
19
20            if (pq.size() > k) {
21                pq.poll();
22            }
23        }
24
25        // Extract result
26        int[] result = new int[k];
27
28        for (int i = k - 1; i >= 0; i--) {
29            result[i] = pq.poll().getKey();
30        }
31
32        return result;
33    }
34}