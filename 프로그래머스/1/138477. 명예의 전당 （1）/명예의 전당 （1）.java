import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        int idx = 0;
        for(int point : score){
            q.offer(point);
            if(q.size()>k){
                q.poll();
            }
            answer[idx++] =  q.peek();
        }
        return answer;
    }
}
// 점수가 커트라인인 k 보다 높으면 명예의 전당 등록
// 프로그램 초기에 k일까지는 모든 출연 가의가 명예의 전당
// k가 3이면 하루에 한명씩 무대를 하니까 3명은 자동으로 명예의 전당이 등록된다는 소리
// 그 다음에 명예의 전당에 등록되어있는 사람들중의 최하점은 따로 저장해서 return을 해줘야함
// 작은거를 게속해서 내보내야함 최소힙 ㄱ ㄱ