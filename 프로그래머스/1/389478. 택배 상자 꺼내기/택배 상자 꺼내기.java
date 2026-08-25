class Solution {
    // n: 총 택배 상자
    // w: 가로
    // num: 빼야 할 택배상자
    public int solution(int n, int w, int num) {
        int answer = 0;
        int h = (n / w) + 1;
        int[][] boxes = new int[h][w];
        int idx = 1, r = 0, c = 0;
        boolean isEven = true;
        
        for (int i = 0; i < h; i++) {
            if (idx > n)
                break;
            
            if (isEven) {
                for (int j = 0; j < w; j++) {
                    if (idx == num) {
                        r = i;
                        c = j;
                    }
                    if (idx <= n) {
                        boxes[i][j] = idx++;
                    }
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    if (idx == num) {
                        r = i;
                        c = j;
                    }
                    if (idx <= n) {
                        boxes[i][j] = idx++;
                    }
                }
            }
            isEven = !isEven;
        }
        
        for (int i = r; i < h; i++) {
            if (boxes[i][c] != 0)
                answer++;
        }
        
        return answer;
    }
}