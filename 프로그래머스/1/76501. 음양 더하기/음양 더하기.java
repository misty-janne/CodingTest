class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        long sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) absolutes[i] *= (-1);
            sum += absolutes[i];
        }
        return (int) sum;
    }
}