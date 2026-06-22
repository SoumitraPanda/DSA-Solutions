// Last updated: 6/22/2026, 9:33:31 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        double sum=0;
        double sq=0;

        while(n>0){
            int digit=n%10;
            sum+=digit;
            sq=sq+Math.pow(digit,2);
            n/=10;
        }

        return sq-sum>=50;
    }
}