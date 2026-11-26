class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int i0=0,i1=1;
        
        int n=costs.length;
        int countA=0, countB=0;
        int total=0;

        Arrays.sort(costs, (a, b) -> Integer.compare(
            Math.abs(b[i0] - b[i1]),
            Math.abs(a[i0] - a[i1])
        ));

        for(int i=0;i<n;i++){
            if(countA<n/2 && countB<n/2){
                if(costs[i][0]>costs[i][1]){
                    countB++;
                    total+=costs[i][1];
                }else{
                    countA++;
                    total+=costs[i][0];
                }
            }else if(countA==n/2 && countB<n/2){
                total+=costs[i][1];
                countB++;
            }else{
                total+=costs[i][0];
                countA++;
            }
        }

        return total;

        

    }
}