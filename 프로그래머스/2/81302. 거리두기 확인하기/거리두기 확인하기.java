class Solution {
    public int[] solution(String[][] places) {
        // P(1) : 응시자 O(0): 빈 테이블 X(-1): 파티션
        // 맨해튼거리 : (r1, c1). (r2, c2) -> |r1-r2| + |c1-c2| <= 2
        
        int[] answer = new int[5];
        char[][] board = new char[5][5];
        
        for (int i = 0; i < 5; i++) {
            // 1. 대기실 하나를 board에 저장
            for (int j = 0; j < 5; j++) {
                board[j] = places[i][j].toCharArray();
            }
            
            // 2. 완성된 대기실에서 응시자 탐색
            answer[i] = 1;

            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 5; c++) {
                    if (board[r][c] == 'P') {
                        if (!findPerson(board, r, c)) {
                            answer[i] = 0;
                            break;
                        }
                    }
                }
                if (answer[i] == 0) break;
            }
        }
        
        return answer;
    }
    
    public static boolean findPerson(char[][] board, int i, int j){
        int r = i, c = j;
        
        // 상하좌우 확인
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        for (int dir = 0; dir < 4; dir++) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (inRange(nr, nc)){
                if (board[nr][nc] == 'P') return false;
                
                if (board[nr][nc] == 'O') {
                    int nnr = r + dr[dir] * 2;
                    int nnc = c + dc[dir] * 2;
                    if (inRange(nnr, nnc) && board[nnr][nnc] == 'P')
                        return false;
                }
            }
        }
        
        r = i;
        c = j;
        
        // 대각선 확인
        int[] ddr = {-1, -1, 1, 1};
        int[] ddc = {-1, 1, -1, 1};
        
        for (int dir = 0; dir < 4; dir++) {
            int nr = r + ddr[dir];
            int nc = c + ddc[dir];
            if (inRange(nr, nc)) {
                // 대각선에 응시자가 있으면
                if (board[nr][nc] == 'P') {
                    // 두 응시자 사이의 칸이 모두 'X'여야 함
                    int nr1 = r;
                    int nc1 = c + ddc[dir];
                    if (inRange(nr1, nc1) && board[nr1][nc1] != 'X')
                        return false;
                    
                    int nr2 = r + ddr[dir];
                    int nc2 = c;
                    if (inRange(nr2, nc2) && board[nr2][nc2] != 'X')
                        return false;
                }
            }
        }
        return true;
    }
    
    public static boolean inRange(int r, int c) {
        return r >= 0 && r < 5 && c >= 0 && c < 5;
    }
}