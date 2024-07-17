class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            answer = n == i ? ++answer : answer;
        }
        return answer;
    }
}