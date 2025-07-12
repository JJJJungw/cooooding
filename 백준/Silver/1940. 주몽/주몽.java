
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        //내가 가지고 있는 재료의 개수 N
        //내가 만들고싶어야하는 갑옷의 고유번호 M
        //내 재료의 고유 숫자 가 마지막입력
        //내 마지막 배열의 인덱스 값이 9가 되는 경우의 수는 몇개이냐?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] cost = new int[N];

        for(int i = 0; i<N; i++){
            cost[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(cost);
        int count = 0;
        for(int i = 0; i < N - 1 ; i++){
            for(int j = i+1; j < N ; j++){
                if(cost[i]+cost[j] == M) count++;
            }

        }System.out.println(count);

    }
    
}
