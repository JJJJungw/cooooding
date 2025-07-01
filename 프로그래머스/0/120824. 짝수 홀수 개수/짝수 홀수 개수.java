class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int count1 = 0; // 짝수
        int count2 = 0; // 홀수
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) count1++;
            else count2++;
        }
        answer[0] = count1; // 짝수 개수
        answer[1] = count2; // 홀수 개수
        return answer;
    }
}
