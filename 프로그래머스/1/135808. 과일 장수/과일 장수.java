import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;    
        //딱 나누어떨어지면 정렬해서 합치면 최대값일꺼고 
        //나누어 떨어지지않으면 뒤에서부터 구하면 되지않을까? 
            
        Arrays.sort(score);
        int sum = 0;
            for(int i = score.length -m; i>=0; i-=m){
                sum += score[i] *m;
             }
        return sum;
    }
}