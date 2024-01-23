import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        for (char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
}