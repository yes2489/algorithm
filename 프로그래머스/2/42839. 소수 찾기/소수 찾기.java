import java.util.*;

class Solution {
    public Set<Integer> set = new HashSet<>();
    public boolean[] visited = new boolean[7];
    
    public int solution(String numbers) {
        int answer = 0;
        
        for (int i = 0; i < numbers.length(); i++) 
            dfs(numbers, "", i+1);
        
        for (int i : set) 
            if (isPrime(i))
                answer++;
        
        
        return answer;
    }
    
    public void dfs (String str, String temp, int len) {
        
        // 원하는 길이만큼 숫자를 만들었다면 완성된 문자열을 숫자로 변환
        if (temp.length() == len) {
            int num = Integer.parseInt(temp);
            set.add(num);
            return;
        }
        
        // 아직 사용하지 않은 숫자를 하나씩 선택
        for (int i = 0; i < str.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp += str.charAt(i);
                
                // 다음 숫자를 선택
                dfs(str, temp, len);
                
                visited[i] = false;
                // 방금 붙인 숫자를 제거해서
                // 재귀 호출 전의 문자열로 되돌림
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }
    
    public boolean isPrime(int n) {
        if (n < 2) 
            return false;
        
        int i = 2;
        
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        
        return true;
    }
}