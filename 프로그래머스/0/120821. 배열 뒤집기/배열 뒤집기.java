class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int ln = num_list.length;
        answer = new int[ln];

        for (int num : num_list) {
            answer[ln-1] = num;
            ln--;	
        }
        
        return answer;
    }
}