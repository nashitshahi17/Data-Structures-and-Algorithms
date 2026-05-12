// Leetcode 547 
import java.util.*;
public class no_of_provinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                bfs(i,vis,isConnected);
                count++;
            }
        }
        return count;
    }
    public void bfs(int i,boolean[]vis,int[][]adj){
        int n = adj.length;
        vis[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front = q.remove();
            for(int j =0;j<n;j++){
                if(adj[front][j]==1 && !vis[j]){
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
}
