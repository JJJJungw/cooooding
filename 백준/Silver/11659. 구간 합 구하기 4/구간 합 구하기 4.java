
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 ㅡ
        //둘째 줄에는 N개의 수
        //셋째 줄부터 M개의 줄에는 합을 구해야하는 구간 i,j가 주어진다
        //M개의 줄에 입력으로 주어진 I번째수부터 j번째 수까지 합을 출력
        String[] a = br.readLine().split(" "); // 숫자가 몇자리 수인지
        int num = Integer.parseInt(a[0]);
        int line = Integer.parseInt(a[1]);
        int[] answer = new int[line];

        String[] b = br.readLine().split(" "); // 숫자가 뭐가 있는지
        int[] numbers = new int[b.length+1];

        for(int i = 0; i<b.length; i++){
            numbers[i+1]=Integer.parseInt(b[i]); // 5 4 3 2 1
        }

        int[][] matrix = new int[line][2];

        for(int i = 0; i < line; i++){
            String[] c = br.readLine().split(" ");
            matrix[i][0] = Integer.parseInt(c[0]);
            matrix[i][1] = Integer.parseInt(c[1]);
        }

        int[] prefix = new int[num+1];
        prefix[1]=numbers[1];

        for(int i = 2; i < num+1; i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }

        for(int i = 0; i < line; i++){
            int start = matrix[i][0];
            int end = matrix[i][1];
            System.out.println(prefix[end]-prefix[start-1]);
        }


        }

    }
