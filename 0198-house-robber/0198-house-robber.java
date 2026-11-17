class Solution {
    public int rob(int[] nums) {
        int[]dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return f(nums,dp,0);
    }

    public int f(int[] nums,int[]dp,int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        dp[i]=Math.max(nums[i]+f(nums,dp,i+2),f(nums,dp,i+1));
        return dp[i];

        
    }
}