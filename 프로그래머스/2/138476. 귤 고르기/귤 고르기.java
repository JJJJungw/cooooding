import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i : tangerine){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        
        list.sort(Collections.reverseOrder());
        int sum = 0;
        int i = 0;
        while(sum<k){
            sum += list.get(i);
            i++;
            count++;
        }

        return count;
    }
}
