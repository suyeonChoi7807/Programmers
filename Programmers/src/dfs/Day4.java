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
	 * ���� 24479��. �˰��� ����- ���̿켱Ž��1(DFS)
	 * ��¥: 24-10-31
	 * �ۼ���: CSY
	 */
	
	private static List<Integer>[] arr;	//�������� 
	private static boolean[] visited;	//�湮���� 
	private static int[] answer;		//���湮���� 
	private static int cnt=1;			//���湮���� 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int n = Integer.parseInt(st.nextToken()); //������<=100,000
		int m = Integer.parseInt(st.nextToken()); //������ ��<=200,000
		int r = Integer.parseInt(st.nextToken()); //��������<=100,000
		
		arr = new ArrayList[n+1];
		visited = new boolean[n+1];
		answer = new int[n+1];
		
		for(int i=1;i<n+1;i++) {
			arr[i] = new ArrayList<>();
		}
		
		//�������� �޾ƿͼ� list�� ����
		for(int i=0;i<m;i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			
			int u = Integer.parseInt(st.nextToken()); //��������
			int v = Integer.parseInt(st.nextToken());   //��������
			
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
