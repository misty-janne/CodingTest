class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 > 0 && num1 <= 100
           && num1 > 0 && num1 <= 100) {
            answer = num1 / num2;
        } else {
            System.out.println("0 이상 100 이하의 정수를 입력해 주세요.");
        }
        return answer;
    }
}