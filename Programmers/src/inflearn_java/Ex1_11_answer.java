package inflearn_java;

import java.util.Scanner;

public class Ex1_11_answer {

	public String solution(String s) {
		String answer="";
		s+=" ";
		int cnt=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) cnt++;
			else {
				answer+=s.charAt(i);
				if(cnt>1) answer+=String.valueOf(cnt);
				cnt=1; //√ ±‚»≠
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex1_11_answer T = new Ex1_11_answer();
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(T.solution(str));
		
	}

}
