package sheet.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/0

public class Bfs {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList();

        boolean visited[] =  new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()){
            int node =  q.poll();
            bfs.add(node);

            for(int i : adj.get(node)){
                if(visited[i] == false){
                    visited[i] = true;

                    q.add(i);
                }
            }
        }

        return bfs;
    }
}
