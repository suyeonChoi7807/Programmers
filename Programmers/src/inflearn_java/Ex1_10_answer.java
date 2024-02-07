package inflearn_java;

import java.util.Scanner;

public class Ex1_10_answer {
	
	public int[] solution(String s, char t) {
		int[] answer=new int[s.length()];
		
		//왼쪽 t부터의 거리
		int p=1000;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		
		//오른쪽 t부터의 거리
		p=1000;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==t) {
				p=0;
			}else {
				p++;
				
				answer[i]=Math.min(answer[i], p);
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex1_10_answer T = new Ex1_10_answer();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		char c=sc.next().charAt(0);
		for(int x:T.solution(str,c)) {
			System.out.print(x+" ");
		}
	}
}
