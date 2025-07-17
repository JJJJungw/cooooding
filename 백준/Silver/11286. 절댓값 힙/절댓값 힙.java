import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util. *;

class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            int absa = Math.abs(a);
            int absb = Math.abs(b);
            if (absa == absb) 
                return a - b;
            return absa - absb;

        });
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input != 0) {
                queue.add(input);
            } else {
                if (queue.isEmpty()) {
                    answer.add(0);
                } else {
                    answer.add(queue.poll());
                }
            }

        }for(int i : answer){
            System.out.println(i);
        }

    }

}
