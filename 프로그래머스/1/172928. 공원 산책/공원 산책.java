class Solution {

    public int[] solution(String[] park, String[] routes) {
        int[][] board = new int[park.length][park[0].length()];
        int r = 0, c = 0;
        
        for (int i = 0; i < park.length; i++) {
            char[] tmp = park[i].toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j] == 'S') {
                    r = i;
                    c = j;
                    board[i][j] = 0;
                } else if (tmp[j] == 'O') {
                    board[i][j] = 0;
                } else {
                    board[i][j] = 1; // 장애물
                }
            }
        }
        // 북 남 서 동
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        for (String route : routes) {
            String[] arr = route.split(" ");
            int n = Integer.parseInt(arr[1]);
            int d = switch (arr[0]) {
                    case "N" -> 0;
                    case "S" -> 1;
                    case "W" -> 2;
                    default -> 3;
            };
            
            boolean isSuccess = true;
            
            int tr = r;
            int tc = c;
            
            for (int i = 0; i < n; i++) {
                int nr = tr + dr[d];
                int nc = tc + dc[d];
                if (!inRange(board, nr, nc)) {
                    isSuccess = false;
                    break;
                }
                tr = nr;
                tc = nc;
            }
            
            if (isSuccess) {
                r = r + dr[d] * n;
                c = c + dc[d] * n;
            }
        }
        
        return new int[]{r, c};
    }

    public static boolean inRange(int[][] board, int r, int c) {
        return (0 <= r && r < board.length) && (0 <= c && c < board[0].length) && board[r][c] != 1;
    }
}