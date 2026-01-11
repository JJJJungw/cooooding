class Solution {
    public int solution(int n) {
        int answer = 0;
        int base = 1;
        while(n>0){
            answer = answer*3 + (n%3);
            n/=3;
        }
        return answer;
    }
}
