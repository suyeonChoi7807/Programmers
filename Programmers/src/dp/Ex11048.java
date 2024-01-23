package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11048 {
	
	static int[][] grp;
	static int[][] sum;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		
		grp = new int[n][m];
		sum = new int[n][m];
		
		for(int i=0;i<n;i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			
			for(int j=0;j<m;j++) {
				int num = Integer.parseInt(st.nextToken());
				grp[i][j]=num;
				
			}
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==0&&j==0) sum[i][j]=grp[i][j];
				else if(i==0) sum[i][j]=sum[i][j-1]+grp[i][j];
				else if(j==0) sum[i][j]=sum[i-1][j]+grp[i][j];
				else {
					sum[i][j] = Math.max(sum[i-1][j], sum[i][j-1]) + grp[i][j];
				}
				
			}
		}
		
		System.out.println(sum[n-1][m-1]);
		
	}

}
