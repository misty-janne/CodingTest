class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        for (int i = 0; i < answer.length; i++) answer[i] = i+1;
        double[] idxs = new double[N];
        int[] stageCnt = new int[N+1];
        for (int stage : stages) if (stage <= N) stageCnt[stage-1]++; 
        int challenger = stages.length;
        for (int i = 0; i < N; i++) {
            idxs[i] = (double)stageCnt[i]/challenger;
            challenger -= stageCnt[i];
        }
        for (int i = 0; i < idxs.length-1; i++) {
            for (int j = i+1; j < idxs.length; j++) {
                if (idxs[i] < idxs[j]) {
                    double temp = idxs[i];
                    idxs[i] = idxs[j];
                    idxs[j] = temp;
                    
                    int temp2 = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp2;
                } else if (idxs[i] == idxs[j]) {
                    if (answer[i] > answer[j]) {
                        int temp2 = answer[i];
                        answer[i] = answer[j];
                        answer[j] = temp2;
                    }
                }
            }
        }
        return answer;
    }
}