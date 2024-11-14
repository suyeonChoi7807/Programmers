package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13926 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 8;
		int su = 1;
		
		for(int i=2;i<n+2;i++) {
			if(su<i) {
				su = 2*su; 
				cnt++; 
			}
		}
		
		System.out.println(cnt+1);

	}

}
