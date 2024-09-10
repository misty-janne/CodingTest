class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int min, max;
        int[] arr = new int[2];
        for (int[] a : sizes) {
            min = Math.min(a[0],a[1]);
            max = Math.max(a[0],a[1]);
            a[0] = min; a[1] = max;
        }
        for (int[] a : sizes) {
            arr[0] = Math.max(a[0],arr[0]);
            arr[1] = Math.max(a[1],arr[1]);
        }
        return arr[0]*arr[1];
    }
}