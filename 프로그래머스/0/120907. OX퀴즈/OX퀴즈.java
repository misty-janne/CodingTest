class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            answer[i] = correct(quiz[i].split(" = "));
        }
        return answer;
    }
    
    String correct(String[] arr) {
        int dap = 0;
        int check = Integer.valueOf(arr[1]);
        String[] narr = arr[0].split(" ");
        int a = Integer.valueOf(narr[0]);
        int b = Integer.valueOf(narr[2]);
        switch (narr[1]) {
            case "+": dap = a + b;
            break;
            case "-": dap = a - b;
            break;
            case "*": dap = a * b;
            break;
            case "/": dap = a / b;
            break;
            case "%": dap = a % b;
            break;
        }
        return dap == check ? "O" : "X"; 
    }
}