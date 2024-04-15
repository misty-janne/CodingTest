import java.lang.Math.*;

class Solution {
    public int solution(int a, int b, int c) {
        double answer = squares(a,b,c,1);
        if (a == b && a == c) {
            answer *= squares(a,b,c,2)*squares(a,b,c,3);
        } else {
            if ((a == b || a == c) || (b == a || b == c)) {
                answer *= squares(a,b,c,2);
            } 
        }        
        return doubleToInt(answer);
    }
        
    double squares(int a, int b, int c, int s) {
        return Math.pow(a,s) + Math.pow(b,s) + Math.pow(c,s);
    }
    
    int doubleToInt(double d) {
        return Double.valueOf(d).intValue();
    }
}