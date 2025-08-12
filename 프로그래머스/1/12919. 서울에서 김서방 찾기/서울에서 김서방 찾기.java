class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int n = 0; 
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                n = i;
                break; // 찾았으니 반복 종료
            }
        }
        answer = String.format("김서방은 %d에 있다", n);
        return answer;
    }
}
