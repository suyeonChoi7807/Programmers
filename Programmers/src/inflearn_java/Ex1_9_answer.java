package inflearn_java;

import java.util.Scanner;

public class Ex1_9_answer {
	
	public int solution(String s) {
		int answer=0;
		
		for(char x:s.toCharArray()) {
			if(x>=48&&x<=57) answer=answer*10+(x-48); //x-48 : 0
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_9_answer T = new Ex1_9_answer();
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(T.solution(str));
	}

}
