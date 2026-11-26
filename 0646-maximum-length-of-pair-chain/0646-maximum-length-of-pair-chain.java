class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;

        Arrays.sort(pairs, (a,b)-> Integer.compare(a[1], b[1]));

        int[] prev=pairs[0];
        int len=1;

        for(int i=1;i<n;i++){
            int currStart=pairs[i][0];
            int currEnd=pairs[i][1];

            if(currStart>prev[1]){
                len++;
                prev=pairs[i];
            }
        }

        return len;


    }
}