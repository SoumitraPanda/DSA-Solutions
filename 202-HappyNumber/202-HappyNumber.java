// Last updated: 6/17/2026, 9:26:40 AM
1class Solution {
2    public boolean isHappy(int n) {
3        
4        Set<Integer> hs=new HashSet<>();
5
6        while(n!=1 && !hs.contains(n)){
7            hs.add(n);
8            int sum=0;
9            
10            while(n>0){
11                int digit=n%10;
12                sum+=digit*digit;
13                n/=10;
14            }
15
16            n=sum;
17        }
18
19        return n==1;
20    }
21}