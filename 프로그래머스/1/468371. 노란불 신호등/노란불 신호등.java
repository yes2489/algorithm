class Solution {
    public int solution(int[][] signals) {
        int len = 1;
        
        for (int[] signal : signals) {
            int g = signal[0];
            int y = signal[1];
            int r = signal[2];

            len *= g + y + r;
        }

        int[] arr = new int[len + 1];

        for (int[] signal : signals) {
            int g = signal[0];
            int y = signal[1];
            int r = signal[2];

            int offset = g + y + r;

            for (int j = 1; j <= len; j += offset) {
                for (int k = 0; k < y; k++) {
                    arr[g + j + k]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == signals.length) {
                return i;
            }
        }

        return -1;
    }
}