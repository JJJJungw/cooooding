import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] cnt = new int[N+2];
        double[] failedRate = new double[N+1]; 
        for(int i : stages){
            cnt[i]++;
        }
        int player = stages.length;
        
        
        for(int i =1; i<=N; i++){
            if(player ==0){
                failedRate[i]=0;
            }
            else{
             failedRate[i]= (double) cnt[i]/player;               
            }
            player -=cnt[i];
             
        }
        List<Integer> stageList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            stageList.add(i);
        }

        Collections.sort(stageList, Collections.reverseOrder((a, b) -> {
            if (failedRate[a] != failedRate[b]) {
                return Double.compare(failedRate[a], failedRate[b]);
            }
            return Integer.compare(b, a);
        }));

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i);
        }

        
        return answer;
    }
}
