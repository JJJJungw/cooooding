

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Integer[] numbers = new Integer[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = input.charAt(i) - '0';
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int num : numbers) {
            System.out.print(num);
        }
    }
}
