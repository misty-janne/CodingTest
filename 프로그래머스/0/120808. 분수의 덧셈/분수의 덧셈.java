class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int bunja = (numer1 * denom2) + (numer2 * denom1);
        int bunmo = denom1 * denom2;
        
        //최대공약수
        int gcd = 0;
        int _bunja = bunja;
        int _bunmo = bunmo;        
        while (_bunmo != 0) {
            int temp = _bunmo;
            _bunmo = _bunja % _bunmo;
            _bunja = temp;
        }
        gcd = _bunja;        
        
        return new int[] {bunja / gcd, bunmo / gcd};
    }
    
}