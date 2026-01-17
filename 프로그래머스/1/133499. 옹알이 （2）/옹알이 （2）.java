class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        // 발음할 수 있는 네 가지 기본 발음
        String[] sounds = {"aya", "ye", "woo", "ma"};

        // 단어 하나씩 검사
        for (String word : babbling) {

            int i = 0;          // 문자열에서 현재 보고 있는 위치 (포인터)
            String prev = "";   // 직전에 사용한 발음 (연속 발음 방지용)
            boolean valid = true; // 이 단어가 발음 가능한지 여부

            // 문자열의 끝까지 모두 처리할 때까지 반복
            while (i < word.length()) {

                boolean matched = false; // 이번 위치에서 발음 하나라도 맞았는지

                // 네 가지 발음 중 하나가 현재 위치에서 시작하는지 확인
                for (String s : sounds) {

                    // word의 i 위치부터 s가 정확히 시작하면
                    if (word.startsWith(s, i)) {

                        // 같은 발음을 연속으로 사용하면 안 됨
                        if (s.equals(prev)) {
                            valid = false;
                            break;
                        }

                        // 발음 하나를 사용했으므로 그 길이만큼 이동
                        i += s.length();

                        // 이번에 사용한 발음을 기억
                        prev = s;

                        matched = true; // 발음 하나는 성공적으로 매칭됨
                        break;          // 다른 발음은 볼 필요 없음
                    }
                }

                // 네 가지 발음 중 아무 것도 맞지 않았다면
                if (!matched) {
                    valid = false;
                    break;
                }
            }

            // 끝까지 문제없이 처리됐다면 정답 개수 증가
            if (valid) {
                answer++;
            }
        }

        return answer;
    }
}
