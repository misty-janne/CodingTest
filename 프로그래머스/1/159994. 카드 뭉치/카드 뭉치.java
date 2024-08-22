class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        for (String goals : goal) {
            if (idx1 < cards1.length && goals.equals(cards1[idx1])) {
                idx1++;
            } else if (idx2 < cards2.length && goals.equals(cards2[idx2])) {
                idx2++;
            } else {
                answer = "No";
                break;                
            }
        }
        return answer;
    }
}