import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[4]; 
        
        int size = answers.length;
        
        for (int i = 0; i < size; i++){
            if (answers[i] == a[i%a.length]){
                score[1]++;
            }
            if (answers[i] == b[i%b.length]){
                score[2]++;
            }
            if (answers[i] == c[i%c.length]){
                score[3]++;
            }
        }
        
        int max = 0;
            
        for (int i = 1; i < score.length; i++){
            max = Math.max(score[i], max);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < score.length; i++){
            if (score[i] == max){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}