class Solution {
    public int lengthOfLIS(int[] nums1) {
        HashSet<Integer> set=new HashSet<>();
        for(int num1:nums1){
            set.add(num1);
        }

        int[] nums2=new int[set.size()];

        int i=0;
        for(int x:set){
            nums2[i]=x;
            i++;
        }
        Arrays.sort(nums2);

        return lcs(nums1, nums2);

    }

    public int lcs(int[] nums1, int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int[][] dp=new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            dp[i][0]=0;
        }

        for(int j=0;j<n+1;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1] + 1;
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[m][n];
    }
}