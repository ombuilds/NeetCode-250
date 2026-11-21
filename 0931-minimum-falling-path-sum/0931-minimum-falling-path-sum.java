class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        

        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int down=dp[i-1][j];
                int left=(j>0) ? dp[i-1][j-1] : Integer.MAX_VALUE;
                int right=(j<n-1)?dp[i-1][j+1] : Integer.MAX_VALUE;

                dp[i][j]=matrix[i][j] + Math.min(down,Math.min(left,right));

            }
        }

        int minSum=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            minSum=Math.min(minSum, dp[n-1][j]);
        }

        return minSum;
    }
}