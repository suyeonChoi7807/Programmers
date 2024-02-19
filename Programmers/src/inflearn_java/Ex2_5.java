package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2_5 {
	
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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt=0;
		for(int i=1;i<n+1;i++) {
			if(isSosu(i)) cnt++;
		}
		
		System.out.println(cnt);
	}

}
