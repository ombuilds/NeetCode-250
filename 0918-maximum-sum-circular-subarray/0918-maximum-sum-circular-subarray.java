class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int current1=nums[0];
        int max=nums[0];
        int current2=nums[0];
        int min=nums[0];

        sum+=nums[0];
        

        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            current1=Math.max(nums[i], nums[i]+current1);
            max=Math.max(max,current1);

            current2=Math.min(nums[i], nums[i]+current2);
            min=Math.min(min,current2);
        }
        if(max<0){
            return max;
        }

        

        return Math.max(max, sum-min);
    }
}