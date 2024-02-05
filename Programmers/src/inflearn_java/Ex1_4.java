package inflearn_java;

import java.util.Scanner;

public class Ex1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int n= Integer.parseInt(sc.nextLine());
		
		StringBuilder answer= new StringBuilder();
		
		for(int i=0;i<n;i++) {
			StringBuilder sb= new StringBuilder();
			sb.append(sc.nextLine());
			sb.reverse();
			answer.append(sb.toString()+"\n");
		}
		
		System.out.println(answer.toString().trim());
	}

}
