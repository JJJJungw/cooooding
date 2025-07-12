import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util. *;
class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
        String[] input = br
            .readLine()
            .split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        int s = nums[0];
        int p = nums[1];
        String word = br.readLine();

        String[] input2 = br
            .readLine()
            .split(" ");
        Map<Character, Integer> count = new HashMap<>();
        count.put('A', Integer.parseInt(input2[0]));
        count.put('C', Integer.parseInt(input2[1]));
        count.put('G', Integer.parseInt(input2[2]));
        count.put('T', Integer.parseInt(input2[3]));
        int Acount = 0;
        int Ccount = 0;
        int Gcount = 0;
        int Tcount = 0;

        for (int i = 0; i < p; i++) {
            char ch = word.charAt(i);
            if (ch == 'A') {
                Acount++;
            } else if (ch == 'C') {
                Ccount++;
            } else if (ch == 'G') {
                Gcount++;
            } else {
                Tcount++;
            }
        }
        int result = 0;
        if (Acount >= count.get('A') && Ccount >= count.get('C') && Gcount >= count.get('G') && Tcount >= count.get('T')) {
            result++;
        }
        for (int i = p; i < s; i++) {
            char add = word.charAt(i);
            char remove = word.charAt(i - p);

            
            if (add == 'A') 
                Acount++;
            else if (add == 'C') 
                Ccount++;
            else if (add == 'G') 
                Gcount++;
            else if (add == 'T') 
                Tcount++;
            
            
            if (remove == 'A') 
                Acount--;
            else if (remove == 'C') 
                Ccount--;
            else if (remove == 'G') 
                Gcount--;
            else if (remove == 'T') 
                Tcount--;
            
            // 조건 검사
            if (Acount >= count.get('A') && Ccount >= count.get('C') && Gcount >= count.get('G') && Tcount >= count.get('T')) {
                result++;
            }
        }

        System.out.println(result);

    }

}
