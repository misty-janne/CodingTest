class Solution {
    public String solution(String s) {
        int min = Integer.valueOf(s.split(" ")[0]);
        int max = min;
        for (String a : s.split(" ")) {
            min = Math.min(Integer.valueOf(a),min);
            max = Math.max(Integer.valueOf(a),max);
        }
        return min+" "+max;
    }
}