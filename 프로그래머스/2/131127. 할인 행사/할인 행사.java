import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int ans = 0;
        for (int i = 0; i <= discount.length-10; i++) {
            int[] idxs = new int[want.length];
            for (int j = i; j < i+10; j++) {
                for (int k = 0; k < want.length; k++) {
                    if (discount[j].equals(want[k])) {
                        idxs[k]++;
                        if (number[k] == idxs[k]) break;
                    }
                }
            }
            if (checkIdx(number, idxs)) ans++;
        }
        return ans;
    }
    public static boolean checkIdx(int[] number, int[] idxs) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] > idxs[i]) return false;
        }
        return true;
    }
}