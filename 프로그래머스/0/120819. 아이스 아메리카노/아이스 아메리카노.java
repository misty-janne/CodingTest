class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cups = (int) money / 5500;
        int charge = money % 5500 > 1 ? money % 5500 : 0;
        answer[0] = cups;
        answer[1] = charge;
            
        return answer;
    }
}