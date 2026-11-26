class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int l=nums.length;

        if(n==0) return true;

        for(int i=0;i<l;i++){
            if(nums[i]==0){
                boolean left= i==0 || (nums[i-1]==0);
                boolean right= i==l-1 || (nums[i+1]==0);

                if(left && right){
                    nums[i]=1;
                    n--;

                    if(n==0) return true;
                }
            }
        }
        return false;

    }
}