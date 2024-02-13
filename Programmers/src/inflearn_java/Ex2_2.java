package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int maxHeight=Integer.MIN_VALUE;
		int cnt=0;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int height=Integer.parseInt(st.nextToken());
			if(height>maxHeight) {
				cnt++;
				maxHeight=height;
			}
		}
		
		System.out.println(sb.append(cnt).toString());

	}

}
