import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] base = new String[strings.length];
        for(int i = 0; i<strings.length; i++){
            base[i] = "" + strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(base);
        
        for(int i = 0; i<strings.length; i++){
            answer[i] = base[i].substring(1);
        }
        
        return answer;
    }
}