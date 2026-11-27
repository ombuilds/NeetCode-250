class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] skipFirst=new int[nums.length];
        int[] skipLast=new int[nums.length];

        for(int i=0;i<nums.length-1;i++){
            skipFirst[i]=nums[i];
            skipLast[i]=nums[i+1];
        }

        int ans1=houseRob(skipFirst);
        int ans2=houseRob(skipLast);
        return Math.max(ans1, ans2);
    }

    public int houseRob(int[] nums){
        int n=nums.length;
        int[] dp=new int[n];

        if(n==1){
            return nums[0];
        }

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);

        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i]+dp[i-2], dp[i-1]);
        }

        return dp[n-1];
    }
}