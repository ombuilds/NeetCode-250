class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)-> Integer.compare(b[1],a[1]));
        int res=0;
        for(int[] box: boxTypes){
            if(truckSize>=box[0]){
                res+=box[0]*box[1];
                truckSize-=box[0];
            }else if(truckSize < box[0] && truckSize!=0){
                res+=truckSize*box[1];
                return res;
                
            }
            
        }

        return res;

    }
}