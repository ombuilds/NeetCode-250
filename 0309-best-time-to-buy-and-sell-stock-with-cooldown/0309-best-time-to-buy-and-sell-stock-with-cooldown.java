class Solution {
    public int f(int ind, int buy, int[] prices,int[][] dp) {
        if(ind>= prices.length) return 0;

        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }
        if(buy==1){
            return dp[ind][buy]=Math.max(-prices[ind]+ f(ind+1,0,prices,dp), 0+ f(ind+1,1,prices,dp));
        }

        return dp[ind][buy]=Math.max(prices[ind]+ f(ind+2,1, prices,dp), 0+ f(ind+1,0,prices,dp));
    }

    public int maxProfit(int[] prices){
        int[][]dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++) Arrays.fill(dp[i], -1);
        return f(0,1,prices,dp);
    }
}