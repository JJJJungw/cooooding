class Solution {
    public int solution(int[] citations) {
        int max = 0;
        int n = citations.length;

        for (int check = 0; check <= n; check++) { // <-- 여기만 핵심 변경
            int cnt = 0;

            for (int c : citations) {
                if (c >= check) cnt++;
            }

            if (cnt >= check) {
                max = Math.max(max, check);
            }
        }
        return max;
    }
}