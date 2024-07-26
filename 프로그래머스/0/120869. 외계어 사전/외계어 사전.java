class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String d : dic) {
            int cnt = 0;
            for (int i = 0; i < spell.length; i++) {
                if (d.contains(spell[i])) cnt++;
            }
            if (cnt == spell.length) return 1;
        }
        return answer;
    }
}