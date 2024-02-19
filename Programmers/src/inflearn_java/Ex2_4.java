package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2_4 {
	
	static int[] fibo;
	
	static int fibonacci(int num) {
		
		if(num==0||num==1) 
			fibo[num]=1;
		else
			fibo[num]=fibo[num-2]+fibo[num-1];
		
		return fibo[num];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		fibo = new int[n];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			sb.append(fibonacci(i)+" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
