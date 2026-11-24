class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        int count=0;
        
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }

        for(int i=0;i<prefixSum.length;i++){
            for(int j=i+1;j<prefixSum.length;j++){
                if(prefixSum[j]-prefixSum[i]==k){
                    count++;
                }
            }
        }

        return count;

    }
}