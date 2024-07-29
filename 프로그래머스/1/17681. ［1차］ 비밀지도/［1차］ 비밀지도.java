class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int len = arr1.length;
        String[] answer = new String[len];
        for (int i = 0; i < len; i++) {
            String bin = Integer.toBinaryString(arr1[i] | arr2[i]);
            while (bin.length() < n) {
                bin = "0"+bin;
            }
            answer[i] = bin.replaceAll("0"," ").replaceAll("1","#");
        }
        return answer;
    }
    
}