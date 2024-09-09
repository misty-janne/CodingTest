class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int i = 1;
        int succ;
        for (int[] a : attacks) {
            for (succ = 0; i < a[0]; i++) {
                if (++succ == bandage[0]) {
                    answer = answer+bandage[2]; succ = 0;
                }
                answer = answer+bandage[1] > health ? health : answer+bandage[1];
            }
            answer -= a[1]; i++;
            if (answer <= 0) return -1;
        }
        return answer;
    }
}