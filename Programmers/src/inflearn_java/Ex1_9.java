package inflearn_java;

import java.util.Scanner;

public class Ex1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		String nStr="";
		for(char c:str.toCharArray()) {
			if(Character.isDigit(c)) {
				nStr+=c;
			}
		}
		
		System.out.println(Integer.parseInt(nStr));
	}

}
