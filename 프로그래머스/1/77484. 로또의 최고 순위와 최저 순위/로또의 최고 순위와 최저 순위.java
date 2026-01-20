import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int count = 0;      
        int undefined = 0; 

        Set<Integer> set = new HashSet<>();
        for (int i : win_nums) {
            set.add(i);
        }

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                undefined++;
            } else if (set.contains(lottos[i])) {
                count++;
            }
        }

        int high = count + undefined;
        int low = count;

        answer[0] = rank(high);
        answer[1] = rank(low);

        return answer;
    }
    
    private int rank(int match) {
        switch (match) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
