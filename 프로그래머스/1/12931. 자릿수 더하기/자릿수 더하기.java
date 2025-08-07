import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strnum = String.valueOf(n);
        int length = strnum.length();
        for(int i = 0; i < length; i++){
            answer+= n%10;
            n=n/10;
        }

        return answer;
    }
}