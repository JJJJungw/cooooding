import java.util.*;

class Solution {
    public String solution(String s) {
        Character[] chars = new Character[s.length()];

        // 문자열 → Character 배열 변환
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        // 내림차순 정렬
        Arrays.sort(chars, Collections.reverseOrder());

        // 다시 문자열로 합치기
        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }
}
