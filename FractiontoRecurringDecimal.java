class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0) return "0";
        StringBuilder result = new StringBuilder();

        if((numerator<0) ^ (denominator<0)) result.append("-");

    long n = Math.abs((long) numerator);
    long d = Math.abs((long) denominator);

        result.append(n/d);
        long rem = n%d;
        if(rem==0) return result.toString();
        result.append(".");

        Map<Long,Integer>mp = new HashMap<>();

        while(rem!=0){
            if(mp.containsKey(rem)){
                int pos = mp.get(rem);
                result.insert(pos,"(");
                result.append(")");
                break;
            }

            mp.put(rem,result.length());
            rem*=10;
            result.append(rem/d);
            rem%=d;
        }

        return result.toString();
    }
}
