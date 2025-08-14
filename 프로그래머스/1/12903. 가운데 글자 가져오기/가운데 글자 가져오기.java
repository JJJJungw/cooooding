class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        if(n%2 !=0){
            int mid = n/2;
            answer = s.substring(mid,mid+1);
        }else{
            int mid = n/2;
            
            answer = s.substring(mid-1,mid+1);
        }
        return answer;
    }
}