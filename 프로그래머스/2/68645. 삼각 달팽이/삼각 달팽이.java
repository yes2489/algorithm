class Solution {
    public int[] solution(int n) {
        int[][] board = new int[n][n];
        
        int[] dr = {1, 0, -1};
        int[] dc = {-1, 1, 0};
        
        int dir = 0;
        int r = 0;
        int c = n - 1;
        int max = n * (n + 1) / 2;
        
        for (int num = 1; num <= max; num++) {
            board[r][c] = num;
            
            if (num == max) break;
            
            for (int i = 0; i < 3; i++) {
                int nr = r + dr[dir];
                int nc = c + dc[dir];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && board[nr][nc] == 0){
                    r = nr;
                    c = nc;
                    break;
                }
                
                dir = (dir + 1) % 3;
            }
        }
        
        int[] answer = new int[max]; 
        int idx = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if (board[i][j] != 0)
                    answer[idx++] = board[i][j];
            }
        }
        
        return answer;
    }
}