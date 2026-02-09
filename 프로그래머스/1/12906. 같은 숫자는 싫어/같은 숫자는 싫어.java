import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // Stack 선언
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++){
            // 우선 배열 첫 번째 숫자 stack에 삽입
            if (i == 0){
                stack.push(arr[i]);
            } // 이후 index부터는 stack의 최상단의 값이 arr[i]와 일치하지 않을때만 push
            else if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        // stack은 LIFO이기 때문에 배열에 있던 순서를 유지하기위해 역순으로 answer에 넣어줌
        for (int i = answer.length - 1; i >= 0; i--){
            answer[i] = stack.pop();
        }
        
        return answer;
        
    }
}