package inflearn_java;

import java.util.Scanner;

public class Ex1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine().toLowerCase();
		
		StringBuilder sb= new StringBuilder(str);
		
		String revStr= sb.reverse().toString();
		
		System.out.println(str.equals(revStr)?"YES":"NO");
	}

}
