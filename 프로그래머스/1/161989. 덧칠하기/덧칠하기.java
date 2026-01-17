class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int end = 0; // 마지막으로 칠해진 위치

        for (int s : section) {
            // 아직 이 구역이 칠해지지 않았다면
            if (s > end) {
                count++;
                end = s + m - 1; // 롤러로 덮는 끝 지점
            }
        }
        return count;
    }
}
