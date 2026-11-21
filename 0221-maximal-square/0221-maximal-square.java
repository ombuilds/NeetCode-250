class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        if(m==0)return 0;
        if(n==0)return 0;
        int best=0;
        int[][]dp= new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    if(i==0|| j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=1+Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                        
                    }
                    best=Math.max(best, dp[i][j]);
                }
            }
        }
        return best*best;
    }
}