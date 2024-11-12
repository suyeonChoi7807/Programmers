package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2847_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int preScore = 0;
		int answer = 0;
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=n-1;i>-1;i--) {
			int score = arr[i];
			
			if(i==n-1) {
				preScore = score;
				continue;
			}
			
			if(preScore<=score) {
				answer += score - preScore + 1;
				preScore = preScore - 1;
			} else {
				preScore = score;
			}
			
		}
		
		System.out.println(answer);
	}

}
