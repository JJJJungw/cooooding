class Solution {
    public int solution(int[] numbers) {
        boolean[] seen = new boolean[10]; // 0~9

        // 1) 들어온 숫자들 표시
        for (int n : numbers) {
            seen[n] = true;
        }

        // 2) 표시되지 않은(=없는) 숫자들만 합산
        int sum = 0;
        for (int d = 0; d <= 9; d++) {
            if (!seen[d]) sum += d;
        }
        return sum;
    }
}
