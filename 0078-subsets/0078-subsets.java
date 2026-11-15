class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        findSubsets(nums,0,temp,ans);
        return ans;
    }

    public void findSubsets(int[] nums, int i,List<Integer> temp, List<List<Integer>> ans){
        //base
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //yes
        temp.add(nums[i]);
        findSubsets(nums,i+1,temp,ans);

        temp.remove(temp.size()-1);
        //no
        findSubsets(nums,i+1,temp,ans);
    }
}