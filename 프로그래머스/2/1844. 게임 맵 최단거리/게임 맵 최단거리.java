import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int answer = 0;
        
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    if (maps[nr][nc] == 1) {
                        q.offer(new int[]{nr, nc});
                        maps[nr][nc] = maps[r][c] + 1;
                    }
                }
            }
        }
        
        if (!visited[n - 1][m - 1])
            return -1;
        
        return maps[n - 1][m - 1];
    }
}