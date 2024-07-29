class Solution {
    boolean solution(String s) {
        String p = s.replaceAll("P|p","");
        String y = s.replaceAll("Y|y","");
        return p.length() == y.length() ? true : false;
    }
}