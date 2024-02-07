package inflearn_java;

import java.util.Scanner;

public class Ex1_6_answer {
	public String solution(String str) {
		String answer="";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i) {
				answer+=str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_6_answer T = new Ex1_6_answer();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}

}
