class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xMax = board[0]/2, yMax = board[1]/2;
        for (String k : keyinput) {
            switch (k) {
                case "up": answer[1] = answer[1] == yMax ? answer[1] : answer[1]+1;
                break;
                case "down": answer[1] = answer[1] == yMax*(-1) ? answer[1] : answer[1]-1;
                break;
                case "left": answer[0] = answer[0] == xMax*(-1) ? answer[0] : answer[0]-1;
                break;
                case "right": answer[0] = answer[0] == xMax ? answer[0] : answer[0]+1;
                break;
            }
        }
        return answer;
    }
}