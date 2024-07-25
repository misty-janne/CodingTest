class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] barr = binomial.split(" ");
        int a = Integer.valueOf(barr[0]), b = Integer.valueOf(barr[2]);
        String op = barr[1];
        switch(op) {
            case "+":
                answer = a+b;
                break;
            case "-":
                answer = a-b;
                break;
            case "*":
                answer = a*b;
                break;
        }
        return answer;
    }
}