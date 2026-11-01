class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0; i<accounts.length; i++){
            int cur=0;
            for(int j=0; j<accounts[0].length; j++){
                cur+=accounts[i][j];

            }
            sum=Math.max(cur,sum);
        }
        return sum;
        
    }
}