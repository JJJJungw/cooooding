class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" "); // "X [연산자] Y = Z" → ["X", "+", "Y", "=", "Z"]

            int x = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int y = Integer.parseInt(parts[2]);
            int z = Integer.parseInt(parts[4]);

            int result = operator.equals("+") ? x + y : x - y;

            answer[i] = (result == z) ? "O" : "X";
        }

        return answer;
    }
}
