class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        for(int num:nums){
            list.add(num);
        }

        helper(list,temp,ans);
        return ans;
    }

    public void helper(List<Integer> list, List<Integer> temp, List<List<Integer>> ans){
        if(list.size()==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<list.size();i++){
            int curr=list.remove(i);
            temp.add(curr);

            helper(list,temp,ans);
            
            temp.remove(temp.size()-1);
            list.add(i,curr);




        }
    }
}