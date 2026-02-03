class Solution {
    public int solution(int[][] sizes) {
        int maxw = 0;
        int maxh = 0;
        for(int[] card : sizes){
            int w = Math.max(card[0],card[1]);
            int h = Math.min(card[0],card[1]);
            
            maxw = Math.max(maxw,w);
            maxh = Math.max(maxh,h);
        }
        return maxw*maxh;
    }
}
