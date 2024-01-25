class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int memberIdx = 1;
        int turns = 1;
        
        final String ERROR_CASE_01 = "단어의 길이는 2 이상 50 이하입니다.";
        final String ERROR_CASE_02 = "앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.";
        final String ERROR_CASE_03 = "이전에 등장했던 단어는 사용할 수 없습니다.";
        
        for (int i = 0; i < words.length; i++) {
            if (memberIdx > n) {
            	memberIdx = 1;
                turns ++;
            }

            if (words[i].length() < 2 || words[i].length() > 50) {
                System.out.println(ERROR_CASE_01);
                return new int[] {memberIdx, turns};
            }

            if (i > 0) {
                if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                    System.out.println(ERROR_CASE_02);
                    return new int[] {memberIdx, turns};					
                }				
            }

            for( int j=0; j<i; j++ ) {
                if( words[i].equals(words[j])) {
                    System.out.println(ERROR_CASE_03);
                    return new int[] {memberIdx, turns};
                }
            }			
            memberIdx++;
        }

        return answer;
    }
}