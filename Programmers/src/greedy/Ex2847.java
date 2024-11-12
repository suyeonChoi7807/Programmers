package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2847 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int preScore = 0;
		int answer = 0;
		
		for(int i=0;i<n;i++) {
			int score = Integer.parseInt(br.readLine());
			
			if(i==0) {
				preScore = score;
				continue;
			}
			
			if(preScore>=score) {
				answer += preScore - score + 1;
				preScore = preScore + 1;
			} else {
				preScore = score;
			}
			
		}
		
		System.out.println(answer);
	}

}
