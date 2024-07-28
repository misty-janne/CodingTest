class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] top = new int[3];
        int idx = 0;
        
        for (int r = 1; idx < 3; r++) {
            for (int i = 0; i < rank.length; i++) {
                if (rank[i] == r && attendance[i]) {
                    top[idx++] = i;
                    break;
                }
            }
        }
        answer = (top[0] * 10000) + (top[1] * 100) + top[2];
        return answer;
    }
}