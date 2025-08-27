import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        return IntStream.range(0, arr1.length) // 행 인덱스
                .mapToObj(i -> 
                    IntStream.range(0, arr1[i].length) // 열 인덱스
                             .map(j -> arr1[i][j] + arr2[i][j]) // 같은 위치 더하기
                             .toArray()
                )
                .toArray(int[][]::new); // 2차원 배열로 변환
    }
}
