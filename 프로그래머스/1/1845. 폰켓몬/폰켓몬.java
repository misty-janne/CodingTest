import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int sel = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return sel < set.size() ? sel : set.size();
    }
}