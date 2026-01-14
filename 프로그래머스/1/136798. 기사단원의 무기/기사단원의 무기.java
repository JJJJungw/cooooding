class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;

            for (int d = 1; d * d <= i; d++) {
                if (i % d == 0) {
                    cnt += 2;
                    if (d * d == i) cnt--;
                }
            }

            if (cnt > limit) answer += power;
            else answer += cnt;
        }

        return answer;
    }
}
