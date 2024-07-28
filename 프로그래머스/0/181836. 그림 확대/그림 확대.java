class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx = 0;
        for (String p : picture) {
            StringBuilder sb = new StringBuilder();
            for (char c : p.toCharArray()) {
                for (int i = 0; i < k; i++) sb.append(c);
            }
            String str = sb.toString();
            for (int i = 0; i < k; i++) answer[idx++] = str;
        }
        return answer;
    }
}