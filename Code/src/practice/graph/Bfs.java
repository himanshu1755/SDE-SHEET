package practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        // System.out.println(adj);
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue =  new LinkedList<>();
        Integer []visited =  new Integer[V];
        for(int i=0;i<V;i++){
            visited[i] = 0;
        }
        visited[0] = 1;
        queue.add(0);
        while(!queue.isEmpty()){
            Integer data =  queue.peek();
            result.add(queue.remove());
            List<Integer> neighbour = adj.get(data);
            // System.out.println(neighbour);

            for(int i=0;i<neighbour.size();i++){
                if(visited[neighbour.get(i)] == 0){
                    visited[neighbour.get(i)] = 1;
                    queue.add(neighbour.get(i));
                }
            }
        }
        return result;
    }
}
