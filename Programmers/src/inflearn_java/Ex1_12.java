package inflearn_java;

import java.util.Scanner;

public class Ex1_12 {
	
	public static char sol(String s) {
		char c = ' ';
		String str="";
		
		for(char charS:s.toCharArray()) {
			if(charS=='#') str+='1';
			else str+='0';
		}
		
		c= (char)Integer.parseInt(str, 2); //2진수->10진수
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String str=sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			String s= str.substring(i*7,(i*7)+7);
			sb.append(sol(s));
		}
		
		System.out.println(sb.toString());
	}

}
