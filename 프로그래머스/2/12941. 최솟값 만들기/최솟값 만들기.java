import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length;

        Arrays.sort(A);
        Arrays.sort(B);
        
        // 뒤집기
        for (int i = 0; i < len/2; i++) {
            int temp = B[i];
            B[i] = B[len - 1 - i];
            B[len - 1 - i] = temp;
        }
        
        for (int i = 0; i < len; i++) {
            answer += A[i] * B[i];
        }
        
        return answer;
    }
}