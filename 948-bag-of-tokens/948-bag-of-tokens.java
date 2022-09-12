class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0;
        int j = tokens.length-1;
        int ans = 0;
        int score = 0;
        while(i<=j){
            if(ans == 0 && tokens[i]>power) break;
            if(ans == 0 || tokens[i]<=power){
                power -= tokens[i];
                ans+=1;
                i++;
            }
            else{
                power+=tokens[j];
                ans-=1;
                j--;
            }
            score = Math.max(ans, score);
            
        }
        return score;
    }
}