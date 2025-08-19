class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){   // j++로 수정
                if(i % j == 0) count++;
            }
            if(count % 2 == 0) {
                answer += i;   // 약수 개수 짝수 → i 더함
            } else {
                answer -= i;   // 약수 개수 홀수 → i 뺌
            }
        }
        return answer;
    }
}
