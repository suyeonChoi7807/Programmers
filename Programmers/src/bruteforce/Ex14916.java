package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14916 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = -1;
		
		int maxN = n/5;
		int na = n%5;
		while(maxN>=0) {
			if(na%2==0) {
				answer = maxN+(na/2);
				break;
			}
			
			maxN--;
			na+=5;
		}
		
		System.out.println(answer);

	}

}
