class Solution {
    int answer = 0;
    public int solution(int[] nums) {
        dfs(nums,0,0,0);
        return answer;
    }
    
    void dfs(int[] nums, int start, int depth, int sum){
        if(depth ==3){
            if(isPrime(sum)){
                answer++;
            }
            return;
        }
        for(int i = start; i<nums.length;i++){
            dfs(nums,i+1,depth+1,sum+nums[i]);
        }
    }
    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
