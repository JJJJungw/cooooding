import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            int index = query[i];

            if (i % 2 == 0) {
                // 짝수 인덱스 → 뒷부분 제거 (index 포함)
                end = start + index;
            } else {
                // 홀수 인덱스 → 앞부분 제거 (index 포함)
                start = start + index;
            }
        }

        // 최종 부분 배열 생성
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
