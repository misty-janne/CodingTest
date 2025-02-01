class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            int len = s.length();
            int n = len - s.replaceAll("0","").length();
            s = Integer.toBinaryString(len - n);
            answer[0]++;
            answer[1] += n;
        }
        
        return answer;
    }
}