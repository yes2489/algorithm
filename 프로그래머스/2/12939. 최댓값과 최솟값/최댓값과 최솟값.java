class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String str : arr) {
            int temp = Integer.parseInt(str);
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }
        
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        return sb.toString();
    }
}