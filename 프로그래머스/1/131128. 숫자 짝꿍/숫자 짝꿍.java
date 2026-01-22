class Solution {
    public String solution(String X, String Y) {
        int[] cntx = new int[10];
        int[] cnty = new int[10];
        
        for(char c : X.toCharArray()){
            cntx[c-'0']++;
        }
        for(char c : Y.toCharArray()){
            cnty[c-'0']++;
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = 9; i>=0; i--){
            int common = Math.min(cntx[i],cnty[i]);
            for(int j = 0; j<common; j++){
                sb.append(i);
            }
            
        }
        
        if(sb.length()==0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}