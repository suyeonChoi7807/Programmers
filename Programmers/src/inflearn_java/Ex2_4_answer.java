package inflearn_java;

import java.util.*;

public class Ex2_4_answer {
	public int[] solution(int n){
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=2; i<n; i++){
			answer[i]=answer[i-2]+answer[i-1];
		}
		return answer;
	}
	public static void main(String[] args){
		Ex2_4_answer T = new Ex2_4_answer();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		for(int x :T.solution(n)) System.out.print(x+" ");
	}
}
