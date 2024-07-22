class Solution {
    public String solution(String my_string) {
        String result = "";
        String vow = "aeiou";
        for (char c : my_string.toCharArray()) {
            if (!vow.contains(c+"")) {
                result += c;
            }
        }
        return result;
    }
}