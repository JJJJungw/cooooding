class Solution {
    public int solution(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) { 
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // 제곱근까지만 검사하도록 수정
    public boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {  // i <= √num
            if (num % i == 0) {
                return false;
            }
        }
        return true; // 끝까지 나눠지지 않으면 소수
    }
}
