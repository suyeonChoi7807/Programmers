package inflearn_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_4_answer {
	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x: str) {
			/*
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
			*/
			
			char[] s=x.toCharArray(); 		//문자열-> 문자배열
			int lt=0, rt=x.length()-1;
			while(lt<rt) {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			
			String tmp= String.valueOf(s); //문자배열-> 문자열
			answer.add(tmp);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_4_answer T = new Ex1_4_answer();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=kb.next();
		}
		for(String x:T.solution(n,str)) {
			System.out.println(x);
		}
	}

}
