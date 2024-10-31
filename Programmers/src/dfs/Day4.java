package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Day4 {
	/*
	 * 백준 24479번. 알고리즘 수업- 깊이우선탐색1(DFS)
	 * 날짜: 24-10-31
	 * 작성자: CSY
	 */
	
	private static List<Integer>[] arr;	//간선정보 
	private static boolean[] visited;	//방문여부 
	private static int[] answer;		//노드방문순서 
	private static int cnt=1;			//노드방문순서 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int n = Integer.parseInt(st.nextToken()); //정점수<=100,000
		int m = Integer.parseInt(st.nextToken()); //간선의 수<=200,000
		int r = Integer.parseInt(st.nextToken()); //시작지점<=100,000
		
		arr = new ArrayList[n+1];
		visited = new boolean[n+1];
		answer = new int[n+1];
		
		for(int i=1;i<n+1;i++) {
			arr[i] = new ArrayList<>();
		}
		
		//간선정보 받아와서 list에 저장
		for(int i=0;i<m;i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			
			int u = Integer.parseInt(st.nextToken()); //시작지점
			int v = Integer.parseInt(st.nextToken());   //도착지점
			
			arr[u].add(v);
			arr[v].add(u);
		}
		
		StringBuilder sb = new StringBuilder();
		
		dfs(r);
		
		for(int i=1;i<answer.length;i++) {
			sb.append(answer[i]+"\n");
		}
		
		System.out.println(sb);

	}
	
	static void dfs(int R) {  
	    visited[R]=true;
	    answer[R]=cnt;
	    cnt++;
	    
	    Object[] newArr = arr[R].toArray();
	    Arrays.sort(newArr);
	    for(Object i: newArr) {
	    	if(visited[(int)i]==false) {
	    		dfs((int)i);
	    	}
	    }
	}

}
