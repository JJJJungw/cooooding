import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] digits = String.valueOf(n).toCharArray();

        Arrays.sort(digits);

        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse();

        // 4. long 변환
        return Long.parseLong(sb.toString());
    }
}