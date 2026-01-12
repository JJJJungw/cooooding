class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                answer+=c;
            }
            else if (c >= 'A' &&  c <= 'Z'){
                char change = (char) ((c-'A'+n)%26+'A');
                answer +=change;
            }
            else{
                char change = (char) ((c-'a'+n)%26+'a');
                answer +=change;
            }
        }
        return answer;
    }
}