class Solution {
    public int[] solution(int brown, int yellow) {        
        int[] answer = new int[2];
        int total = brown + yellow;
        
        // 테두리 + 중앙 -> 최소 높이 3
        for (int h = 3; h <= total; h++) {
            if (total % h == 0){
                int w = total / h;
                
                if (w >= h) {
                    if ((w - 2) * (h - 2) == yellow) {
                        answer[0] = w;
                        answer[1] = h;
                    }
                }
            }
            
        }
        
        return answer;
    }
}