class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (compare(arr1.length, arr2.length) != 0) {
            return compare(arr1.length, arr2.length);
        } else {
            int arr1Add = 0;
            int arr2Add = 0;            
            for (int a : arr1) arr1Add+=a;
            for (int a : arr2) arr2Add+=a;
            return compare(arr1Add, arr2Add);
        }
    }
    
    int compare(int a, int b) {
        if (a == b) {
            return 0;
        } else {
            return a > b ? 1 : -1;
        }
    }
}