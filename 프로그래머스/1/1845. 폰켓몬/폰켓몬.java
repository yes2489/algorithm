import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums){
            set.add(i);
        }

        int maxCnt = nums.length/2;

        return Math.min(set.size(), maxCnt);
    }
}