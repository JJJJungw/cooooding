class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        boolean isStart = true; // 단어의 시작인지 여부

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                sb.append(c);
                isStart = true;
            } else {
                if (isStart && Character.isLetter(c)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
                isStart = false;
            }
        }
        return sb.toString();
    }
}
