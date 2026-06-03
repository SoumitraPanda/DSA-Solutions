// Last updated: 6/3/2026, 6:24:07 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for (char ch : s.toCharArray()) {
6            if (ch == '(' || ch == '{' || ch == '[') {
7                stack.push(ch);
8            } else {
9                if (stack.isEmpty()) {
10                    return false;
11                }
12
13                char top = stack.pop();
14
15                if ((ch == ')' && top != '(') ||
16                    (ch == '}' && top != '{') ||
17                    (ch == ']' && top != '[')) {
18                    return false;
19                }
20            }
21        }
22
23        return stack.isEmpty();
24    }
25}