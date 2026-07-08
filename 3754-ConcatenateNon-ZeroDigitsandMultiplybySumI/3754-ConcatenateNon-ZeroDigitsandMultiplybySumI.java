// Last updated: 7/8/2026, 9:04:25 AM
1class Solution {
2    public long sumAndMultiply(int n) {
3
4        long ans=0;
5        long digit=0;
6        long rdigit=0;
7
8        while(n>0){
9            int rem=n%10;
10            if(rem!=0){
11            digit=digit*10+rem;
12            ans+=rem;}
13            n/=10;
14        }
15
16        while(digit>0){
17            long rem=digit%10;
18            
19            rdigit=rdigit*10+rem;
20            
21            digit/=10;
22        }
23
24        return rdigit*ans;
25
26
27        // String s = String.valueOf(n);
28        // long x = 0;
29        // long sum = 0;
30
31        // for (char c : s.toCharArray()) {
32        //     if (c != '0') {
33        //         int d = c - '0';
34        //         x = x * 10 + d;
35        //         sum += d;
36        //     }
37        // }
38
39        // return x * sum;
40
41    }
42}