
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int n = word.length();
        boolean isPalindrome=true;
        for(int i = 0; i < n/2; i++){
            if(word.charAt(i) != word.charAt(n-1-i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? 1 : 0); 
    } 
}
