import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length-1;
        int boat = 0;
        while(l<=r){
            boat++;
            if(people[l]+people[r] <=limit){
                l++;
            }
            r--;
        }
                
        return boat;
    }
}