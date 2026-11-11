class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();
        String str = sb.toString();
        
        int[] answer = new int[sb.length()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str.charAt(i) - '0';
        }
        
        return answer;
    }
}