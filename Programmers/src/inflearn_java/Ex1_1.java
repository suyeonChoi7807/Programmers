package inflearn_java;

import java.util.Scanner;

public class Ex1_1 {
	
	public int solution(String str, char t) {
		int answer= 0;
		
		str= str.toUpperCase(); //대문자로 변경(문자열)
		t= Character.toUpperCase(t); //대문자로 변경(문자)
		
		//System.out.println(str+" "+t);
		
		/* method1
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==t) {
				answer++;
			}
		}
		*/
		for(char x:str.toCharArray()) {
			if(x==t) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_1 t = new Ex1_1();	//static없는 인스턴스 메소드를 사용하려면 선언해야함
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		char c=kb.nextLine().charAt(0);
		
		System.out.print(t.solution(str, c));

	}

}
