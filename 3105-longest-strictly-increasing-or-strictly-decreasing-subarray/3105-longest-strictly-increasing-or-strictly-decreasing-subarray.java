class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }

        int incrCount=1;
        int decrCount=1;
        int left=0;
        
        int n=nums.length;

        //for increasing
        for(int right=0;right<n;right++){
            while(right+1<n && nums[right]<nums[right+1]){
                right++;
            }

            incrCount=Math.max(incrCount,right-left+1);
            left=right+1;
        }

        left=0;
        for(int right=0;right<n;right++){
            while(right+1<n && nums[right]>nums[right+1]){
                right++;
            }

            decrCount=Math.max(decrCount,right-left+1);
            left=right+1;
        }

        return Math.max(incrCount, decrCount);

    }
}