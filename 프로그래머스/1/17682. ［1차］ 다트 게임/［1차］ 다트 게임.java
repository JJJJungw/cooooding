class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int round = 0; // 아직 시작 전

        char[] arr = dartResult.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            if (Character.isDigit(c)) {
                int num;
                if (c == '1' && i + 1 < arr.length && arr[i+1] == '0') {
                    num = 10;
                    i++; 
                } else {
                    num = c - '0';
                }           
                scores[round] = num;
            }
            else if (c == 'S') {
                scores[round] = (int)Math.pow(scores[round], 1);
                round++;
            } else if (c == 'D') {
                scores[round] = (int)Math.pow(scores[round], 2);
                round++;
            } else if (c == 'T') {
                scores[round] = (int)Math.pow(scores[round], 3);
                round++;
            }
            else if (c == '*') {
                scores[round - 1] *= 2;
                if (round - 2 >= 0) scores[round - 2] *= 2;
            } else if (c == '#') {
                scores[round - 1] *= -1;
            }
        }

        int answer = 0;
        for (int s : scores) {
            answer += s;
        }
        return answer;
    }
}
