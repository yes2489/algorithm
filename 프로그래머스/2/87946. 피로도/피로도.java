class Solution {
    int maxCnt = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        permutation(dungeons, visited, k, 0);
        return maxCnt;
    }
    
    public void permutation(int[][] dungeons, boolean[] visited, int health, int cnt) {
        maxCnt = Math.max(maxCnt, cnt);
        
        for (int i = 0; i < dungeons.length; i++) {
            // 방문하지 않았고, 현재 피로도가 최소 피로도 이상인 경우
            if (!visited[i] && health >= dungeons[i][0]) {
                visited[i] = true;
                // 다음 던전 찾기
                permutation(dungeons, visited, health - dungeons[i][1], cnt + 1);
                visited[i] = false;
            }
        }
    }
}