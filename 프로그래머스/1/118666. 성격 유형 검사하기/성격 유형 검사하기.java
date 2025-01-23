import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        char[] mbti = {'R','T','C','F','J','M','A','N'};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < mbti.length; i++) {
            map.put(mbti[i],i);
        }
        int[] scores = new int[mbti.length];
        
        for (int i = 0; i < choices.length; i++) {
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            int score = Math.abs(choices[i]-4);
            if (choices[i] < 4) {
                scores[map.get(c1)] += score;
            } else if (choices[i] > 4) {
                scores[map.get(c2)] += score;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mbti.length; i+=2) {
            sb.append(scores[i] < scores[i+1] ? mbti[i+1] : mbti[i]);
        }
        return sb.toString();
    }
}