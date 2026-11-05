class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res=0;
        for(int i=0;i<arr1.length;i++){
            
            int diff=0;
            for(int j=0;j<arr2.length;j++){
                diff=Math.abs(arr1[i]-arr2[j]);
                if(diff<=d){
                    break;
                }
                
            }
            if(diff>d){
                res++;
            }
        }
        return res;
    }
}