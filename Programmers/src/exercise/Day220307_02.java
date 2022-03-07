package exercise;

public class Day220307_02 {
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long num = x;

		for(int i=0; i<n; i++){
			answer[i] = num;
			num+=x;
		}

		return answer;
	}	

}
