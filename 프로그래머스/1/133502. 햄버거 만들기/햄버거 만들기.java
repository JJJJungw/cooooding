import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> buger = new Stack<>();
        for(int i = 0; i<ingredient.length;i++){
            buger.push(ingredient[i]);
            if(buger.size()>=4 && buger.peek()==1){
                int size = buger.size();
                if (
                    buger.get(size - 4) == 1 &&
                    buger.get(size - 3) == 2 &&
                    buger.get(size - 2) == 3 &&
                    buger.get(size - 1) == 1
                ){
                    buger.pop();
                    buger.pop();
                    buger.pop();
                    buger.pop();
                    answer++;
                }
            }
            
        }
        return answer;
    }
}