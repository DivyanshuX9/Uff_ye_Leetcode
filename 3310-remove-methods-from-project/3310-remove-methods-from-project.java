class Solution {
    void dfs(int node,boolean[] suspicious,List<Integer>[] graph) {
        suspicious[node] = true;

        for (int next : graph[node]) {
            if (!suspicious[next])
                dfs(next,suspicious,graph);
        }
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] e : invocations)
            graph[e[0]].add(e[1]);

        boolean[] suspicious=new boolean[n];
        
        dfs(k,suspicious,graph);

        List<Integer> ans=new ArrayList<>();
        for(int e[]:invocations){
            int u=e[0];
            int v=e[1];

            if(!suspicious[u] && suspicious[v]){
                for(int a=0;a<n;a++)  ans.add(a);
                return ans; 
            }
        }
        for(int a=0;a<n;a++){
            if(suspicious[a]) continue;
            ans.add(a);
        }

        return ans;
    }
}