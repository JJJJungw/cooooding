import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        Map<String, int[]> map = new HashMap();
        map.put("1", new int[]{0, 0}); // 1 → (0,0)
        map.put("2", new int[]{0, 1});
        map.put("3", new int[]{0, 2});
        map.put("4", new int[]{1, 0});
        map.put("5", new int[]{1, 1});
        map.put("6", new int[]{1, 2});
        map.put("7", new int[]{2, 0});
        map.put("8", new int[]{2, 1});
        map.put("9", new int[]{2, 2});
        map.put("*", new int[]{3, 0});
        map.put("0", new int[]{3, 1});
        map.put("#", new int[]{3, 2});

        String left = "*";
        String right = "#";
        for (int num : numbers) {
            String target = String.valueOf(num); 
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                left = target; 
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                right = target; 
            } else {
                int[] leftloc = map.get(left);
                int[] rightloc = map.get(right);
                int[] targetloc = map.get(target);
                
                int leftdis = Math.abs
                    (leftloc[0] - targetloc[0])+ Math.abs(leftloc[1]-targetloc[1]);
                
                int rightdis = Math.abs
                    (rightloc[0] - targetloc[0]) + Math.abs(rightloc[1] - targetloc[1]);
                
                if(rightdis > leftdis){
                    answer+="L";
                    left=target;
                }
                if(leftdis>rightdis){
                    answer+="R";
                    right=target;
                }
                if(leftdis==rightdis){
                    if(hand.equals("right")){
                        answer+="R";
                        right=target;
                    }else{
                        answer+="L";
                        left=target;
                    }
                }
            }
        }return answer;
    }
}