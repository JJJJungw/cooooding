
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws Exception {
        // 차레대로 1~N번
        // 1번카드가 제일위 N이 제일아래
        // 제일위를 바닥에 버림
        //그다음 제일위를 제일 아래로 보냄
        // N=4일떄 1234 순서 1을버리고 234이면 제일위를 아래로 342
        //그다음 3버리고 4제일아래로 24
        //마지막으로 2버리면 4만 남음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int card = 1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i<=N; i++){
            queue.offer(card);
            card++;
        }
        while(!queue.isEmpty()){
            if(queue.size() ==1){
                System.out.println(queue.peek());
            }
            queue.poll();
            queue.offer(queue.peek());
            queue.poll();
            
        }
    }
    
}
