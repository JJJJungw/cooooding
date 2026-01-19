import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            char cur = c;
            int count = 0;

            while (count < index) {
                cur++;

                if (cur > 'z') {
                    cur = 'a';
                }

                if (!skipSet.contains(cur)) {
                    count++;
                }
            }

            answer.append(cur);
        }

        return answer.toString();
    }
}
