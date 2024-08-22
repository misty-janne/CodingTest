class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while(n >= 1) {
            sb.append(n%3);
            n /= 3;
            cnt++;
        }
        int idx = 0;
        while(cnt > 0) {
            answer += ((sb.charAt(idx++))-'0')*Math.pow(3,--cnt);
        }
        return answer;
    }
}