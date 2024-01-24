class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if (num1 > 0 && num1 <= 100
           && num2 > 0 && num2 <= 100) {
            double d = num1 * 1000 / num2 * 1000;
            answer = (int) d / 1000;
        } else {
            System.out.println("0 초과 100 이하의 정수를 입력해 주세요.");
        }
        
        return answer;
    }
}