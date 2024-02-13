package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int bfNum=Integer.MIN_VALUE;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int num=Integer.parseInt(st.nextToken());
			if(num>bfNum) {
				sb.append(num+" ");
			}
			bfNum=num;
		}
		
		System.out.println(sb.toString().trim());
	}

}
