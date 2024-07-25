class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int a : array) {
            for (String b : (a+"").split("")) {
                if (b.contains("7")) answer++;
            }
        }
        return answer;
    }
}