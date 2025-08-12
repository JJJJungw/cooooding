class Solution {
    public int solution(int num) {
        long n = num;   // 오버플로 방지
        int count = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
            if (count >= 500) return -1;
        }
        return count;
    }
}
