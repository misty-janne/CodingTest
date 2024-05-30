import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        int arr[] = {a,b,c,d};
        //idx를 주사위 1~6 눈금으로 활용
        int freq[] = new int[7];

        // 1111: freq[1]=4
        for (int n : arr) {
            freq[n]++;
        }

        //주사위 눈금별 갯수 있는것들만 담기
        List<Integer> uniqNums = new ArrayList<>();
        for (int i=1; i < freq.length; i++) {
            // 1444: freq[1]=1, freq[4]=3 --> uniqNums={1,3}
            if (freq[i] > 0) {
                uniqNums.add(i);
            }
        }

        // 2245: size=3
        int size = uniqNums.size();

        if (size == 1) {
            // case1: PPPP --> 1111*P
            answer = 1111*uniqNums.get(0);
        } else if (size == 2) {
            int p = uniqNums.get(0);
            int q = uniqNums.get(1);
            if (freq[p] == 3 || freq[q] == 3) {
                // case2: PPPQ --> (10*P+Q)^2
                answer = freq[p] > freq[q] ? (int) Math.pow(10*p+q, 2) : (int) Math.pow(10*q+p, 2);
            } else {
                // case3: PPQQ --> (p+q)*|p-q|
                answer = (p+q)*Math.abs(p-q);
            }
        } else if (size == 3) {
            // case4: PPQR --> Q*R
            int q = -1, r = -1;
            for (int val : uniqNums) {
                if (freq[val] == 1) {
                    if (q == -1) {
                        q = val;
                    } else {
                        r = val;
                    }
                }
            }
            answer = q*r;
        } else if (size == 4) {
            // case5: PQRS --> 가장작은숫자
            answer = uniqNums.get(0);
        }

        return answer;
    }
}