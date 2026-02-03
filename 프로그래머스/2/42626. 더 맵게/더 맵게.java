import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i : scoville) pq.offer((long) i);
        
        int cnt = 0;
        
        while(pq.size()>=2 && pq.peek()<K){
            long a = pq.poll();
            long b = pq.poll();
            pq.offer(a+(b*2));
            cnt ++;
        }
        if(pq.peek()<K) return -1;
        else {return cnt;
             
        }
    }
}