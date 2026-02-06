import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for (int r = 0; r < answer.length; r++){
            int i = commands[r][0];
            int j = commands[r][1];
            int k = commands[r][2];
            int[] tmp = new int[j - i + 1];
            int idx = 0;
            for (int c = i - 1; c < j; c++){ // 배열 자르기
                tmp[idx] = array[c];
                idx++;
            }
            Arrays.sort(tmp); // 정렬
            
            answer[r] = tmp[k-1]; // 결과 배열에 입력
        }
        
        return answer;
    }
}