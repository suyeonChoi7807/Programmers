package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int[][] arr=new int[n+2][n+2];
		StringTokenizer st;
		
		for(int i=0;i<n;i++) {
			String s=br.readLine();
			st=new StringTokenizer(s);
			
			for(int j=0;j<n;j++) {
				int num=Integer.parseInt(st.nextToken());
			
				arr[i+1][j+1]=num;
				
			}
		}
		
		int cnt=0;
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
				if((arr[i][j]>arr[i][j-1])&&(arr[i][j]>arr[i][j+1])&&(arr[i][j]>arr[i-1][j])&&(arr[i][j]>arr[i+1][j])) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
