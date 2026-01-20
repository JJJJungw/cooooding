import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int press = i + 1;

                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), press));
            }
        }

        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            boolean possible = true;

            for (char c : targets[i].toCharArray()) {
                if (!map.containsKey(c)) {
                    possible = false;
                    break;
                }
                sum += map.get(c);
            }

            answer[i] = possible ? sum : -1;
        }

        return answer;
    }
}
