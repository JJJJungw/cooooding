class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            int cb = (n/a)*b; //6개
            int rb = n%a; //2개
            answer+=cb;
            n = cb+rb;
        }
        return answer;
    }
}

// 1회전은 가장 많은 수 18 / 3 + 2 = 8  => 6
// 2회전은 돌려받은 콜라 + 원래 가지고 있던 콜라 병수 8/3 = 2 + 2 = 4 => 2
// 3회전은 4/3 =1+1 = 2 => 1
    
// while 남은 콜라의 수가 > a

// num1 n/a (교환 받을 콜라수)
// num2 n%a 이게 나한테 남아 있는 콜라의수
// 나한테 남아있는건 num1+num2
// n = num1 + num 2 가 되는거지


    