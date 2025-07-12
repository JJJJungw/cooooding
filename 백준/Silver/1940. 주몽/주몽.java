
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
        
        /*for(int i = 0; i < N - 1 ; i++){
            for(int j = i+1; j < N ; j++){
                if(cost[i]+cost[j] == M) count++;
            }

        }System.out.println(count); => 원래 이렇게 풀었는데 이중포문 쓰기 싫어서 투 포인터 알고리즘을 찾아봤음*/

        int left = 0;
        int right = N-1;
        while(left < right){
            int sum = cost[left] + cost[right];  /*만약 제일 작은수랑 큰수랑 합이 내가 원하는 수보다 작다? 제일 작은 수를 더 크게만들자*/
            if(cost[left] + cost[right] == M ){
                count++; // 가장 작은수랑 큰수랑 더해서 내가 원하는 값이 나왔다? 작은수를 늘리든 큰수를 늘리든 나올 수 가 없음 다음 케이스로 넘어가자
                left++;
                right--;
            }else if(sum > M){
                right--;

            }else{
                left++;
            }
        }    
        System.out.println(count);
    }
    
}
