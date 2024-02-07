package inflearn_java;

import java.util.Scanner;

public class Ex1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		
		int lt= 0;
		int rt= s.length()-1;
		char[] cArray= s.toCharArray();
		
		while(lt<rt) {
			char ltmp= cArray[lt];
			char rtmp= cArray[rt];
			if((ltmp>=65&&ltmp<=90)||(ltmp>=97&&ltmp<=122)) {
				if((rtmp>=65&&rtmp<=90)||(rtmp>=97&&rtmp<=122)) {
					//¾ËÆÄºª
					cArray[lt]=rtmp;
					cArray[rt]=ltmp;
					lt++;
					rt--;
				}else {
					rt--;
				}
			}else {
				lt++;
			}
		}
		
		System.out.println(String.valueOf(cArray));
	}

}
