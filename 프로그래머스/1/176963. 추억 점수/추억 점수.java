import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> point = new HashMap<>();
        for(int i = 0; i<name.length; i++){
            point.put(name[i],yearning[i]);
        }
        int[] answer = new int[photo.length];
        for(int i = 0; i<photo.length; i++){
            int sum = 0;
            for(int j = 0; j<photo[i].length;j++){
                String person = photo[i][j];
                if(point.containsKey(person)){
                    sum+=point.get(person);
                }
            }answer[i] = sum;
        }
        return answer;
    }
}