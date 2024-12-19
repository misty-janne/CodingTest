class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[][] keys = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
        int[] left = {3,0}, right = {3,2};
        
        for (int n : numbers) {
            int[] aim = keys[n];
            if (aim[1] == 0) {
                sb.append("L"); left = aim;
            } else if (aim[1] == 2) {
                sb.append("R"); right = aim;
            } else {
                int laim = Math.abs(left[0]-aim[0]) + Math.abs(left[1]-aim[1]);
                int raim = Math.abs(right[0]-aim[0]) + Math.abs(right[1]-aim[1]);
                if (laim < raim || (laim == raim && hand.equals("left"))) {
                    sb.append("L"); left = aim;
                } else {
                    sb.append("R"); right = aim;
                }
            }
        }
        return sb.toString();    
    }
}