package inflearn_java;

import java.util.Scanner;

public class Ex1_8_answer {
	
	public String solution(String s) {
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]","");
		String tmp= new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_8_answer T = new Ex1_8_answer();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.println(T.solution(str));
	}

}
