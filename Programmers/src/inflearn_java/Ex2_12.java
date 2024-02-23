package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		
		int n=Integer.parseInt(st.nextToken()); //학생 수
		int m=Integer.parseInt(st.nextToken()); //테스트 수
		int[][] game=new int[m][n];
		
		for(int i=0;i<m;i++) {
			s=br.readLine();
			st=new StringTokenizer(s);
			
			for(int j=0;j<n;j++) {
				int num=Integer.parseInt(st.nextToken());
				game[i][j]=num;
			}
		}
		
		int tot=0;
		
		for(int i=0;i<n;i++) {
			int cnt=0;
			int minScore=Integer.MIN_VALUE;
			
			for(int j=0;j<m;j++) {
				for(int k=0;k<n;k++) {
					if(game[j][k]==i+1&&minScore<k+1) {
						//본인이면
						minScore=k+1;
						cnt=n-minScore;
					}	
				}
			}
			tot+=cnt;
			//System.out.println("cnt: "+cnt);
		}
		
		System.out.println(tot);
		
	}

}
