package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		int max=Integer.MIN_VALUE;
		
		//row
		for(int i=0;i<n;i++) {
			int tot=0;
			
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			for(int j=0;j<n;j++) {
				int num=Integer.parseInt(st.nextToken());
				arr[i][j]=num;
				tot+=num;
			}
			
			if(max<tot) max=tot;
		}
		
		//col
		for(int i=0;i<n;i++) {
			int tot=0;
			
			for(int j=0;j<n;j++) {
				int num=arr[j][i];
				tot+=num;
			}
			if(max<tot) max=tot;
		}
		
		//대각선 1
		int tot=0;
		for(int i=0;i<n;i++) {
			tot+=arr[i][i];
		}
		if(max<tot) max=tot;
		
		
		//대각선 2
		tot=0;
		for(int i=0;i<n;i++) {
			tot+=arr[i][n-1-i];
		}
		if(max<tot) max=tot;
		
		
		System.out.println(max);
		
	}

}
