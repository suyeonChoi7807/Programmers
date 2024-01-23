package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1010 {

	static int dp[][] = new int[30][30];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1;i<30;i++) {
			for(int j=1;j<30;j++) {
				if(i==j) dp[i][j]=1;
				else if(i==1) dp[i][j]=j;
				else {
					dp[i][j]=dp[i][j-1]+dp[i-1][j-1];
				}
			}
		}
		
		int row = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int z=0;z<row;z++) {
			String ex = br.readLine();
			st = new StringTokenizer(ex);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			System.out.println(dp[n][m]);
			
		}

	}

}
