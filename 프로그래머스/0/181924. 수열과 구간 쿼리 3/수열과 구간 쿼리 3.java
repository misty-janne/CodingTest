class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int j = 0; j < queries.length; j++) {
            int idx_1 = queries[j][0];
            int idx_2 = queries[j][1];

            int temp = arr[idx_1];
            arr[idx_1] = arr[idx_2];
            arr[idx_2] = temp;

        }
        answer = arr;
        return answer;
    }
}