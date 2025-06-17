import java.util.*;
class Bfs {
    static ArrayList<Integer> bfsOfGraph(
        ArrayList<ArrayList<Integer>> adj, int s) {
        int V = adj.size();
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);
            for (int x : adj.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }        
        return res;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));       
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));       
        adj.add(new ArrayList<>(Arrays.asList(0)));          
        adj.add(new ArrayList<>(Arrays.asList(2)));          
        int src = 0;
        ArrayList<Integer> ans = bfsOfGraph(adj, src);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
