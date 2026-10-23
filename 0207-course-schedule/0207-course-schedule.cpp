class Solution {
private:
    bool dfs(int it, vector<vector<int>>& graph, int numCourses, vector<int>& vis,stack<int>& st) {
        vis[it] = 1;
        for(auto next:graph[it]){
            if(vis[next]==1)
                return false;
        
            if(vis[next]==0)
                if(!dfs(next,graph,numCourses,vis,st)) return false;
        }
            vis[it]=2;
            st.push(it);
            return true;
    }
public:
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
        stack<int> st;
        vector<int> vis(numCourses, 0);
        vector<vector<int>> graph(numCourses);

        for (auto p : prerequisites) {
            graph[p[1]].push_back(p[0]);
        }
        for (auto it = 0; it < numCourses; it++) {
            if (!vis[it])
              if(!dfs(it, graph, numCourses, vis, st)) return false;
        }
        return true;
    }
};