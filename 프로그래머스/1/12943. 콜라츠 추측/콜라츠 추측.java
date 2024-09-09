class Solution {
    public int solution(int num) {
        int answer = 0;
        long l = Long.valueOf(num);
        for (; answer < 500; answer++) {
            if (l == 1) break;
            l = l % 2 == 0 ? l/2 : (l*3)+1;
        }
        return answer == 500 ? -1 : answer;
    }
}