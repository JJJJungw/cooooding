class Solution {
    public int solution(int n, int m, int[] section) {
        int[] wall = new int[n];

        for (int i = 0; i < section.length; i++) {
            wall[section[i] - 1] = 1;
        }

        int cnt = 0;
         for (int i = 0; i < n; i++) {
            if (wall[i] == 1) {
            cnt++;
            for (int j = 0; j < m && i + j < n; j++) {
                wall[i + j] = 0;
                }
            i = i + m - 1;
            }
         }
        
        return cnt;
    }
}
