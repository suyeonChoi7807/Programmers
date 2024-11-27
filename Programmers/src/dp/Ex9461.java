package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9461 {
	
	public static Long[] arr= new Long[100];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int T= Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			int n= Integer.parseInt(br.readLine());
			sb.append(p(n)+"\n");
		}

		System.out.println(sb);
	}

	private static Long p(int n) {
		if(n>=1&&n<=3) {
			return 1L;
		}else if(n>=4&&n<=5) {
			return 2L;
		}else if(arr[n-1]==null){
			arr[n-1]= p(n-1)+p(n-5);
		}
		
		return arr[n-1];
	}

}