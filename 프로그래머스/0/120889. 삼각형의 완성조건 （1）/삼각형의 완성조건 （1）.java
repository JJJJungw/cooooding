import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt(); // 가장 긴 변
        int sum = Arrays.stream(sides).sum();            // 전체 변 길이 합

        return (sum - max) > max ? 1 : 2;
    }
}
