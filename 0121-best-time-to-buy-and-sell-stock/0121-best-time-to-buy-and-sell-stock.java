class Solution {
    public int maxProfit(int[] nums) {
        int buyprice=nums[0];
        int profit=0;

        for(int i=1;i<nums.length;i++){
            if(buyprice>nums[i]){
                buyprice=nums[i];
            }

            profit=Math.max(profit, nums[i]-buyprice);
        }

        return profit;
    }
}