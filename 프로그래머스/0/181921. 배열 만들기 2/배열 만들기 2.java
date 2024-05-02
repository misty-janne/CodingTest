import java.util.Arrays;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        for (int i = l; i <= r; i++) {
            if (i == 0 || i == 5) {
                int[] arr = Arrays.copyOf(answer, answer.length+1 );
                arr[answer.length] = i;
                answer = arr;
            } else {
                String is = i+"";
                int cnt = 0;
                for (char c : is.toCharArray()) {
                    if(c == '5' || c == '0'){
                        cnt++;
                    }
                    if(cnt == is.length()){
                        int[] arr = Arrays.copyOf(answer, answer.length+1 );
                        arr[answer.length] = i;
                        answer = arr;
                    }
                }
            }

        }
        answer = answer.length == 0 ? new int[] {-1} : answer;
        
        return answer;
    }
}