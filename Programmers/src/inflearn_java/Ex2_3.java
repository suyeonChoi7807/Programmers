package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_3 {
	
	public static String game(int a, int b) {
		
		String answer="A";
		
		if(a==b) {
			answer="D";
		}else if(a==1) {
			if(b==2) answer="B";
		}else if(a==2) {
			if(b==3) answer="B";
		}else if(a==3) {
			if(b==1) answer="B";
		}
		
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		//a
		int aNums[] = new int[n];
		for(int i=0;i<n;i++) {
			aNums[i]=Integer.parseInt(st.nextToken());
		}
		
		//b
		s=br.readLine();
		st = new StringTokenizer(s);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(game(aNums[i],Integer.parseInt(st.nextToken()))+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}

}
