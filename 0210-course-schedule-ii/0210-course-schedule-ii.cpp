class Solution {

private:
    bool dfs(int node, int l, vector<vector<int>> graph, stack<int>& st,vector<int>& vis) {
        vis[node]=1;
        for (auto i : graph[node]) {
            if (vis[i] == 1)
                return false;
            if (vis[i] == 0) {
                if(!dfs(i, l, graph, st, vis)){
                     return false;
                }
            }
        }
        vis[node] = 2;
        st.push(node);
        return true;
    }

public:
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<vector<int>> graph(numCourses);
        for (auto i : prerequisites) {
            graph[i[1]].push_back(i[0]);
        }

        vector<int> vis(numCourses, 0);
        stack<int> st;
        for (int a = 0; a < numCourses; a++) {
            if(vis[a]==0){
                if(!dfs(a, numCourses, graph, st, vis)){
                    return {};
                }
            }
        }
        vector<int> ans;
        while (!st.empty()) {
            ans.push_back(st.top());
            st.pop();
        }

        return ans;
    }
};