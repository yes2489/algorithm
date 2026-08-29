class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n + 1];
        
        for (int i : section) {
            wall[i] = 1;
        }
        
        for (int i = 1; i <= n; i++) {
            if (wall[i] == 0)
                continue;
            
            for (int j = 0; j < m; j++) {
                if (i + j > n)
                    break;
                
                wall[i + j] = 0;
            }
            answer++;
        }
        
        return answer;
    }
}