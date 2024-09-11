class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        for (String b : babbling) {
            String prev = "";
            boolean isValid = true;
            while (isValid && !b.isEmpty()) {
                boolean found = false;
                for (String w : word) {
                    if (b.startsWith(w) && !w.equals(prev)) {
                        b = b.substring(w.length());
                        prev = w;
                        found = true; break;
                    }
                }
                if (!found) isValid = false;
            }
            if (isValid && b.isEmpty()) answer++;
        }
        
        return answer;
    }
}