class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] sarr = myString.split("");
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = sarr[i].equals("A") ? "B" : "A";
        }
        myString = String.join("",sarr);

        return myString.contains(pat) ? 1 : 0;
    }
}