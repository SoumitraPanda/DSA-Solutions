// Last updated: 6/14/2026, 6:14:48 PM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        double sum=0;
4        double sq=0;
5
6        while(n>0){
7            int digit=n%10;
8            sum+=digit;
9            sq=sq+Math.pow(digit,2);
10            n/=10;
11        }
12
13        return sq-sum>=50;
14    }
15}