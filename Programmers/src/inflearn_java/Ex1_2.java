package inflearn_java;

import java.util.Scanner;

public class Ex1_2 {
	
	public String solution(String str) {
		String answer="";
		
		for(char c: str.toCharArray()) {
			/*
			if(Character.isLowerCase(c)) {
				answer+= Character.toUpperCase(c);
			}else {
				answer+= Character.toLowerCase(c);
			}
			*/
			
			if(c>=97 && c<=122) {
				//소문자
				answer+=(char)(c-32);
			}else {
				//c>=65 && c<=90
				//대문자
				answer+=(char)(c+32);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_2 T= new Ex1_2();
		Scanner sc= new Scanner(System.in);
		
		String s= sc.nextLine();
		System.out.println(T.solution(s));
	}

}
