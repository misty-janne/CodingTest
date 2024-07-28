class Solution {
    public int solution(String A, String B) {
        String BB = B+B;
        int idx = BB.indexOf(A);
        return idx >= B.length() ? idx - B.length() : idx;
    }
}