import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System. in));

        int a = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int[] num = new int[input.length()];
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {
            num[i] = input.charAt(i) - '0';
        }
        for (int i = 0; i < a; i++) {
            answer += num[i];
        }

        System
            .out
            .println(answer);
    }

}
