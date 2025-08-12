import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {}; // 의미 없지만 구조 유지
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) { // answer[i] → arr[i]로 수정
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()) { // 메서드 호출로 수정
            list.add(-1);
        }

        // List<Integer> → int[] 변환
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        Arrays.sort(result);

        return result;
    }
}
