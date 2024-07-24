class Solution {
    public int solution(int order) {
        String str = order+"";
        return str.length() - str.replaceAll("3|6|9","").length();
    }
}