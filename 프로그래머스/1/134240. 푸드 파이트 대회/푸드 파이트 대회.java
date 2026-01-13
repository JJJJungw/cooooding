class Solution {
    public String solution(int[] food) {
        StringBuffer left = new StringBuffer();
        for(int i = 1; i<food.length; i++){
            int cnt = food[i]/2;
            for(int j = 0; j<cnt; j++){
                left.append(i);
            }
        }
        StringBuffer answer = new StringBuffer();
        answer.append(left);
        answer.append(0);
        answer.append(left.reverse());
        return answer.toString();

    }
}