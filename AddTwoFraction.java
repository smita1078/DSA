class Solution{
      public int gcd(int a , int b){
        return b==0 ? a : gcd(b,a%b);
    }
    void addFraction(int num1, int den1, int num2, int den2) {
        int lcm = (den1 * den2) /gcd(den1,den2);
        int newnum1 = num1 * (lcm/den1);
        int newnum2 = num2 * (lcm/den2);
        int resultnum = newnum1 + newnum2;
        int resultden = lcm;
        
        int commongcd = gcd(Math.abs(resultnum),resultden);
        resultnum/=commongcd;
        resultden/=commongcd;
        System.out.println(resultnum +"/"+resultden);
    }
}
