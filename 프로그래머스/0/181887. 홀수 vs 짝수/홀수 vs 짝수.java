class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 0;
        int cnt = 0;
        for (int n : num_list) {
            if (cnt % 2 == 0) {
                a += n;
            } else {
                b += n;
            }
            cnt++;
        }
        return a > b ? a : b;
    }
}