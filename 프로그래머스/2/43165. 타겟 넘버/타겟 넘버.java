class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    public static int dfs(int[] numbers, int target, int index, int current_sum) {
        // 모든 숫자를 다 사용했을 때
        if (index == numbers.length) {
            // 현재까지의 합이 타겟과 같다면 1 아니면 0 리턴
            if (current_sum == target)
                return 1;
            
            return 0;
        }
            
        // 재귀 호출: 현재 숫자를 더하는 경우 + 현재 숫자를 빼는 경우
        int plus = dfs(numbers, target, index + 1, current_sum + numbers[index]);
        int minus = dfs(numbers, target, index + 1, current_sum - numbers[index]);
        
        return plus + minus;
    }
}