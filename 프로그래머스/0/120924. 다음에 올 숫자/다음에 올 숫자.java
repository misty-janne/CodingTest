class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int k = 0;
        if (common[1] - common[0] < common[2] - common[1]) {
            k = (common[2] - common[1])/(common[1] - common[0]);
            answer = common[0] * (int)Math.pow(k, common.length);
        } else {
            k = common[1] - common[0];
            answer = common[common.length-1] + k;
        }
        return answer;
    }
}