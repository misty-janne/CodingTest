class Solution {
    public int[] solution(int n) {
        int maxIdx = n % 2 == 0 ? n/2 : n/2+1;
        int[] answer = new int[maxIdx];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }
}