import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++){
            int start = commands[i][0]; //2 2번째 부터 잘라라(인덱스가 아님 0번부터 시작하는게 아님 1번째 인덱스부터)
            int end = commands[i][1]; //5 (5번째 즉 4번째 인덱스)
            int idx = commands[i][2]; //3
            int len = end - start +1;
            
            int[] cut = new int[len];
            for(int j = 0; j<len; j++){
                cut[j]=array[start-1+j];
            }
            Arrays.sort(cut);
            answer[i]=cut[idx-1];
        }
        
        return answer;
    }
}