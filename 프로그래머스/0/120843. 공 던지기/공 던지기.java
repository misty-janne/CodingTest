class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for (int i=0, cnt=0; cnt < k; i+=2, cnt++) {
            if (i >= numbers.length) {
                i = i-numbers.length;
            }
            answer = numbers[i];
        }
        return answer;
    }
}