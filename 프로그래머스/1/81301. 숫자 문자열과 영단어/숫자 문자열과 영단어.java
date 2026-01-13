import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        Map<String, Integer> word = new HashMap<>();
        word.put("zero", 0);
        word.put("one", 1);
        word.put("two", 2);
        word.put("three", 3);
        word.put("four", 4);
        word.put("five", 5);
        word.put("six", 6);
        word.put("seven", 7);
        word.put("eight", 8);
        word.put("nine", 9);
        
        StringBuffer result = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                result.append(ch);
            }
            else{
                temp.append(ch);
                
                String t = temp.toString();
                if(word.containsKey(t)){
                    result.append(word.get(t));
                    temp.setLength(0);
                }
                
            }
        }
        return Integer.parseInt(result.toString());
    }
}