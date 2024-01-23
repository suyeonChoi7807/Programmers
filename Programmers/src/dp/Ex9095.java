package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9095 {
	
	static int dp[] = new int[11]; //n<11

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int j=4;j<11;j++) {
			dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
		}
		
		int row = Integer.parseInt(br.readLine());
		
		for(int i=0; i<row; i++) {
			int num = Integer.parseInt(br.readLine());
			
			System.out.println(dp[num]);
			
		}
	}

}
