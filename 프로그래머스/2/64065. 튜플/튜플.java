import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] arr = s.substring(2,s.length()-2).split("},\\{");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int[] answer = new int[arr.length];
        answer[0] = Integer.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            for (String a : arr[i].split(",")) {
                if (!Arrays.stream(answer).anyMatch(x -> x == Integer.valueOf(a))) {
                    answer[i] = Integer.valueOf(a);
                }
            }
        }
        return answer;
    }
}