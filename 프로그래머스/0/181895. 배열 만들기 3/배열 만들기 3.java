class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = 
            new int[intervals[0][1]-intervals[0][0]+1
                    +intervals[1][1]-intervals[1][0]+1];
        int j = 0;
        for (int i = 0; i < 2; i++) {
            for (int a = intervals[i][0]; a <= intervals[i][1]; a++) {
                answer[j++] = arr[a];
            }
        }
        
        return answer;
    }
}