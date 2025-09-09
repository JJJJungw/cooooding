class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int targetcount = 0;
        int elsecount = 0;
        for(int i = 0 ; i <s.length(); i++){
            if(s.charAt(i)==first){
                targetcount++;
            }else{
                elsecount++;
            }
            if(targetcount == elsecount){
                answer++;
                targetcount = 0;
                elsecount = 0;
                if(i+1 < s.length()){
                   first = s.charAt(i+1);
                }
            }
        }
        if(targetcount !=0 || elsecount !=0){
            answer++;
        }
        return answer;
    }
}