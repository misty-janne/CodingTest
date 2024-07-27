class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer = new int[len];
        double[] avg = new double[len];
        for (int i = 0; i < len; i++) {
            avg[i] = (double)(score[i][0]+score[i][1])/2;
        }
        for (int i = 0; i < len; i++) {
            int rank = 1;
            for (int j = 0; j < len; j++) {
                if (i == j) {continue;}
                if (avg[i] < avg[j]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }
}