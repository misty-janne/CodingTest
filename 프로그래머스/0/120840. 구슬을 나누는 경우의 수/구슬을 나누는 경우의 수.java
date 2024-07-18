import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        return comb(balls, share).intValue();
    }

    public BigInteger fact(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public BigInteger comb(int n, int m) {
        BigInteger numerator = fact(n);
        BigInteger denominator = fact(m).multiply(fact(n - m));
        return numerator.divide(denominator);
    }
}