import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length])
                score[0]++;
            if (answers[i] == b[i % b.length])
                score[1]++;
            if (answers[i] == c[i % c.length])
                score[2]++;
        }
        
        int max = Integer.MIN_VALUE;
        
        for (int i : score) {
            max = Math.max(max, i);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            if (score[i] == max)
                list.add(i + 1);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);    
        }
        
        return answer;
    }
}