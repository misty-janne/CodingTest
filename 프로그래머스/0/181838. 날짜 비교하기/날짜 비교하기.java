class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] != date2[i]) {
                answer = date1[i] > date2[i] ? 0 : 1;
                break;
            }
        }
        return answer;
    }
}