class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int a = 1;
        int b = 0;
        
        for (int n : num_list) {
            a*=n;
            b+=n;
        }
        
        
        return a < b*b ? 1 : 0;
    }
}