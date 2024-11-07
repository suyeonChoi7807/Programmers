package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Day11 {
	private static List<Integer>[] graph;
	private static boolean[] visited;		//�湮���� 
	private static Queue<Integer> queue;	//bfs ť 
	private static Map<Integer, Integer> map;
	static boolean check = false;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int n = Integer.parseInt(st.nextToken()); //������ ����
		int m = Integer.parseInt(st.nextToken()); //������ ����
		
		graph = new ArrayList[n+1];
		visited = new boolean[n+1];
		queue = new LinkedList<>();
		
		for(int i=1;i<n+1;i++) {
			graph[i] = new ArrayList<>();
		}
		
		//�������� ����
		for(int i=1;i<m+1;i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			
			int p1 = Integer.parseInt(st.nextToken()); //����1
			int p2 = Integer.parseInt(st.nextToken()); //����2
			
			graph[p1].add(p2);
			//graph[p2].add(p1);
		}
		
		for(int i=1;i<n+1;i++) {
			Collections.sort(graph[i]);
		}
		
		int s = Integer.parseInt(br.readLine());	//�����̰� �����ϴ� ��������
		str = br.readLine();
		st = new StringTokenizer(str);
		
		map = new HashMap<>();
		
		for(int i=1;i<s+1;i++) {
			int p= Integer.parseInt(st.nextToken());
			map.put(p, 1);
		}
		
		if(map.containsKey(1)) {
			check = false;
		}else {
			bfs(1);
		}
		System.out.println(check ? "yes" : "Yes");
	}

	private static void bfs(int start) {
		visited[start] = true;	//�湮
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int newp = queue.poll();
			
			if(map.containsKey(newp)) continue;
			if(graph[newp].isEmpty()) {
				check = true ;
				return;
			}
			
			for(int p : graph[newp]) {
				if(visited[p]!=true) { 
					visited[p] = true;	//�湮
					queue.add(p);
				}
			}
			
		}
		
	}

}
