package inflearn_java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		
		StringTokenizer st= new StringTokenizer(s);
		String answer="";
		
		while(st.hasMoreTokens()) {
			String str= st.nextToken();
			if(answer.length()<str.length()) {
				answer=str;
			}
		}
		
		System.out.println(answer);
	}

}
