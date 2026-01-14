class Solution {
    public String solution(int a, int b) {
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int count = 0;
        for(int i = 1; i<a; i++){
            count += month[i-1];
        }
        count +=b-1;
        int target = count%7;
        return days[target];
    }
}