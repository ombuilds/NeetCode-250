class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adjList=new ArrayList<>();
        int V=isConnected.length;

        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i).add(j);
                }
            }
        }

        int count=0;
        int[] vis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                count++;
                dfs(i,vis,adjList);
            }
        }
        return count;
    }
    private static void dfs(int node, int vis[],List<List<Integer>> adjList){
        vis[node]=1;
        for(Integer neighbour:adjList.get(node)){
            if(vis[neighbour]!=1){
                vis[neighbour]=1;
                dfs(neighbour,vis,adjList);
            }
        }
    }
}