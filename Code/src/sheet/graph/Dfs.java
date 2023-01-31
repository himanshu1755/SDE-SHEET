package sheet.graph;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/0

public class Dfs {

  public void dfs (Integer node,boolean visited[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer>  dfs){
    visited[node] =true;
    dfs.add(node);

    for(int i :adj.get(node)){
        if(visited[i] == false){
            dfs(i,visited,adj,dfs);
        }
    }
  }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        ArrayList<Integer>  dfs = new ArrayList<>();
        boolean visited[] = new boolean[V+1];
        visited[0] = true;

        dfs(0,visited,adj,dfs);

        return dfs;
    }
}
