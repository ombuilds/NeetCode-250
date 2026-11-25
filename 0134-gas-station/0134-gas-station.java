class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,totalcost=0;

        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }

        if(totalgas<totalcost){
            return -1;
        }

        int currGas=0, start=0;

        for(int i=0;i<gas.length;i++){
            currGas+=gas[i]-cost[i];

            if(currGas<0){
                start=i+1;
                currGas=0;
            }
        }

        return start;
    }
}