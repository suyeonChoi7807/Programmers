package inflearn_java;

import java.util.Scanner;

public class Ex1_7_answer {
	public String solution(String str) {
		String answer="YES"; //회문이면
		int len=str.length();
		str=str.toUpperCase(); //전체 대문자변경
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				answer="NO";
				break; //하나라도 다르면 바로 나오기
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_7_answer T = new Ex1_7_answer();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.println(T.solution(str));
	}

}
