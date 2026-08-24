class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        
        int time = 0;
        int charge = 0;
        int currHealth = health;
        int answer = -1;
        
        for (int i = 0; i < attacks.length; i++) {
            if (time != attacks[i][0]) {
                while (time != attacks[i][0]) {
                    currHealth = Math.min(currHealth + x, health);
                    charge++;
                    
                    if (charge == t) {
                        currHealth = Math.min(currHealth + y, health);
                        charge = 0;
                    }
                    
                    time++;
                }
                
            }
            charge = 0;
            currHealth -= attacks[i][1];
            time++;
            
            if (currHealth <= 0) {
                break;
            }
        }
        
        if (currHealth > 0) {
            answer = currHealth;
        }
        
        return answer;
    }
}