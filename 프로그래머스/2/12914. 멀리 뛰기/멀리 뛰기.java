import java.math.*;
class Solution {
    public BigInteger solution(int n) {
        BigInteger answer = BigInteger.ONE;
        int _n, two = 0;
        while ((++two*2) <= n) {
            if (two*2 == n) {
                return answer.add(BigInteger.ONE).remainder(BigInteger.valueOf(1234567));
            }
            _n = n-(two*2)+two;
            answer = answer.add(nr(_n, two));
        }
        return answer.remainder(BigInteger.valueOf(1234567));
    }

    private BigInteger nr(int n, int r) {
        if (r > n-r) r = n-r;
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }
}