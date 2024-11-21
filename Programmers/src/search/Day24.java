package search;

import java.util.ArrayList;
import java.util.List;

/*
 * 프로그래머스 - 완전탐색 - 전력망을 둘로 나누기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86971
 * 
 * 작성자: 최수연
 */
public class Day24 {

	public static void main(String[] args) {
		int n = 9;
		int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
	
		System.out.println(Solution3.solution(n, wires));

	}
}

class Solution3 {
    public static int solution(int n, int[][] wires) {
  
        List<Integer>[] wireList = new ArrayList[n+1]; 
		
		for(int i=1;i<=n;i++) {
			wireList[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<wires.length;i++) {
				wireList[wires[i][0]].add(wires[i][1]);
				wireList[wires[i][1]].add(wires[i][0]);
		}
		
		for(int i=0;i<wires.length;i++) {
			divideNetwork(n, wireList, wires[i] );
		}
        
        return min;
    }
    
    private static int cnt1= 0;
	private static int cnt2= 0;
    private static int min= Integer.MAX_VALUE;
	
	private static void divideNetwork(int n, List<Integer>[] wireList, int[] edge) {
		wireList[edge[0]].remove((Object)edge[1]);
		wireList[edge[1]].remove((Object)edge[0]);
		
		dfs(n, wireList, new boolean[n+1], edge, edge[0], true);
		dfs(n, wireList, new boolean[n+1], edge, edge[1], false);
		
		int absValue = Math.abs(cnt1-cnt2);
        min = Math.min(absValue,min);
        
        cnt1 = 0;
        cnt2 = 0;
        wireList[edge[0]].add(edge[1]);
		wireList[edge[1]].add(edge[0]);
		
	}
	
	private static void dfs(int n, List<Integer>[] wireList, boolean[] visited, int[] edge, int k, boolean isCnt1) {
		visited[k] = true;
        
		if (isCnt1) {
            cnt1++;
        } else {
            cnt2++;
        }

		for(int node : wireList[k]) {
			if(visited[node]==false) {
				dfs(n,wireList,visited,edge,node,isCnt1);
			}
		}
	}
}
