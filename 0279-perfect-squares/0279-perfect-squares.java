class Solution {
    public int numSquares(int n) {
        int count=(int)Math.sqrt(n);
        int[] squares=new int[count];

        for(int i=1;i<=count;i++){
            squares[i-1]=i*i;
        }

        int dp[][]=new int[squares.length+1][n+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }

        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=Integer.MAX_VALUE;
        }

        for(int i=1;i<squares.length+1;i++){
            for(int j=1;j<n+1;j++){

                if(squares[i-1]<=j){
                    dp[i][j]=Math.min(1+ dp[i][j-squares[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[squares.length][n];
    }
}