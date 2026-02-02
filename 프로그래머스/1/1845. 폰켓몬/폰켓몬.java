import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        
        int answer;
        if (set.size() > n) {
            answer = n;
        } else {
        answer = set.size();
        }
return answer;
    }
}
// 포켓몬을 n/2 마리를 가져갈수있음
// 동일한 포켓몬은 같은 번호를 부여받음 3 1 2 3 이번 3번 포켓몬 2마리라는 소리
// 가장 많은 종류의 포켓몬을 가져갈수있는 수 (다른종류)
// n/2 마리를 뽑아야함
// n/2 마미를 뽑았을때 가장 많이 나올수있는 경우의 수는 n/2랑 동일한 경우
// 최대가 동일할꺼고 아니면 그냥 set에 저장되어있는 사이즈의 수?



