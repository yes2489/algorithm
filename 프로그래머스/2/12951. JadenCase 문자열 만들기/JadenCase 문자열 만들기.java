class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] str = s.split(" ");
        
        // 공백이 연속해서 나올 수 있음
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer.append(" ");
                continue;
            }
            
            char[] arr= str[idx].toCharArray();
            
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    if (!(0 <= arr[j] - '0' && arr[j] - '0' <= 9))
                        arr[j] = Character.toUpperCase(arr[j]);
                } else {
                    arr[j] = Character.toLowerCase(arr[j]);
                }
                answer.append(arr[j]);
            }
            idx++;
            i = i + arr.length - 1;
        }
        
        return answer.toString();
    }
}