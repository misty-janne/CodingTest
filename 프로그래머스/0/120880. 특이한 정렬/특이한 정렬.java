import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] answer = new int[len];
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                if (Math.abs(numlist[j]-n) == Math.abs(numlist[j+1]-n)) {
                    if (numlist[j]-n < numlist[j+1]-n) {
                        swap(numlist, j, j+1);
                    }
                } else {
                    if (Math.abs(numlist[j]-n) > Math.abs(numlist[j+1]-n)) {
                        swap(numlist, j, j+1);
                    }
                }
            }
        }
        return numlist;
    }
    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}