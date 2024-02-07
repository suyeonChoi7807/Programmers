package inflearn_java;

import java.util.Scanner;

public class Ex1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String nStr="";
		
		for(char c:str.toCharArray()) {
			if((c>=65&&c<=90)||(c>=97&&c<=122)) {
				nStr+=c;
			}
		}
		
		int lt=0;
		int rt=nStr.length()-1;
		char[] cArr=nStr.toLowerCase().toCharArray();
		boolean isOff=false;
		
		while(lt<rt) {
			if(cArr[lt]!=cArr[rt]) {
				isOff=true;
				break;
			}else {
				lt++;
				rt--;
			}
		}
		
		System.out.println(isOff?"NO":"YES");
	}

}
