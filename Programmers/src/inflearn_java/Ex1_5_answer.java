package inflearn_java;

import java.util.Scanner;

public class Ex1_5_answer {
	
	public String solution(String str) {
		String answer="";
		char[] s=str.toCharArray();
		int lt=0, rt=str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		
		answer=String.valueOf(s);
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_5_answer T = new Ex1_5_answer();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}

}
