class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            int row = arr1[i] | arr2[i];
            String bi = Integer.toBinaryString(row);
            bi = "0".repeat(n - bi.length()) + bi;
            bi = bi.replace('1', '#').replace('0', ' ');
            answer[i]=bi;
        }
        return answer;
    }
}