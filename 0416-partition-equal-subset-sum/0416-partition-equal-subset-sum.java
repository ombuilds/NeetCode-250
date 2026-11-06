class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }

        if(sum%2!=0){
            return false;
        }else{
            return subsetSum(nums, sum/2);
        }
    }

    public boolean subsetSum(int[] nums, int target) {
    boolean[] dp = new boolean[target + 1];

    dp[0] = true;

    for (int num : nums) {
        for (int j = target; j >= num; j--) {
            dp[j] = dp[j] || dp[j - num];
        }
    }

    return dp[target];
}
}