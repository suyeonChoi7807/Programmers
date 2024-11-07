package bfs;

import java.io.*;
import java.util.*;

public class Day11_2 {
    static List<List<Integer>> graph;
    static Set<Integer> fans = new HashSet<>(); // 팬이 있는 정점
    static boolean check = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
        }
        
        int s = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < s; i++) {
            fans.add(Integer.parseInt(st.nextToken()));
        }
        
        bfs(1);
        System.out.println(check ? "yes" : "Yes");
    }
    
  static void dfs(int current){
        // 팬이 있는 곳을 지나간 경우
        if(check || fans.contains(current)) return;
        // 가져올 간선이 없다면
        if(graph.get(current).isEmpty()){
            check = true;
            return;
        }
        for(int next : graph.get(current)) dfs(next);
  }
  
  static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        boolean[] visited = new boolean[graph.size()];
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (fans.contains(current)) continue;
            if (graph.get(current).isEmpty()) {
                check = true;
                return;
            }
            
            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}