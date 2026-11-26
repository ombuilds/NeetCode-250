class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        while(nums[n-1]>=nums[n-2]+nums[n-3]){
            if(n-3==0){
                return 0;
            }
            n--;
        }
        return nums[n-1]+nums[n-2]+nums[n-3];
    }
}