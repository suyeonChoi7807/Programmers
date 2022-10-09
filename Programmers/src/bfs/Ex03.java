package bfs;

import java.util.*;

public class Ex03 {
    static int[] dR = {-1, 1, 0, 0};
    static int[] dC = {0, 0, -1, 1};
    static int[][] g_maps;
    static boolean[][] isVisited;
    static Queue<int[]> queue = new LinkedList<>();
    static int answer = 0;
    static int[][] valueMap;

    public int solution(int[][] maps) {
        g_maps = maps;
        valueMap = new int[g_maps.length][g_maps[0].length];
        isVisited = new boolean[g_maps.length][g_maps[0].length];
        visit(new int[] {0, 0}, 1);
        bfs();
        answer = valueMap[g_maps.length - 1][g_maps[0].length - 1];
        if (answer == 0) answer = -1;
        return answer;
    }
    
    public void visit(int[] node, int value) {
        queue.add(node);
        isVisited[node[0]][node[1]] = true;
        valueMap[node[0]][node[1]] = value;
        return;
    }
    
    public void bfs() {
        if (queue.size() == 0) return;
        int[] refNode = queue.peek();
        int value = valueMap[refNode[0]][refNode[1]];
        
        for (int i = 0; i < dR.length; i++) {
            int x = refNode[0] + dR[i];
            int y = refNode[1] + dC[i];
            if (x >=0 && y >= 0 && x < g_maps.length && y < g_maps[0].length) {
                if (!isVisited[x][y] && g_maps[x][y] == 1) {
                    visit(new int[]{x, y}, value + 1);
                }
            }
        }
        queue.poll();
        bfs();
    }
}