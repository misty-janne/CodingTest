class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (; i <= j; i++) {
            for (String s : (i+"").split("")) {
                if (s.contains(k+"")) answer++;
            }
        }
        return answer;
    }
}