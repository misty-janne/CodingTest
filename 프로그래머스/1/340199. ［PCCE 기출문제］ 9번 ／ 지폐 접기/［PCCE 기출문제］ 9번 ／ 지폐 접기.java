class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        return store(wallet, bill, answer);
    }
    public int store(int[] w, int[] b, int cnt) {

        if ((w[0] >= b[0] && w[1] >= b[1])
           || (w[0] >= b[1] && w[1] >= b[0])) {
            return cnt;
        } else {
            if (b[0] > b[1]) b[0]/=2;
                else b[1]/=2;
            return store(w, b, ++cnt);
        }
    }
    
}