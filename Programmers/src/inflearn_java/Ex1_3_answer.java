package inflearn_java;

import java.util.Scanner;

public class Ex1_3_answer {
	
	public String solution(String str) {
		String answer="";
		int m=Integer.MIN_VALUE;	//가장작은수로 초기화
		String[] s= str.split(" ");  //띄어쓰기 기준으로 문자 나눔 
		
		for(String x:s) {
			int len= x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex1_3_answer T = new Ex1_3_answer();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.println(T.solution(str));
	}

}
