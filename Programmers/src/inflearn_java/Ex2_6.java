package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_6 {
	
	static boolean isSosu(int num) {
		boolean answer=true;
		
		if(num==1) return false;
		else if(num==2) return true;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				answer=false;
				break;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		StringBuilder sb= new StringBuilder();
		StringBuilder answer= new StringBuilder();
		
		for(int i=0;i<n;i++) {
			sb.append(st.nextToken()).reverse();
			int num=Integer.parseInt(sb.toString());
			
			answer.append(isSosu(num)?num+" ":"");
			sb= new StringBuilder();
		}
		
		System.out.println(answer.toString().trim());
	}

}
