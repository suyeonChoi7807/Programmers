package inflearn_java;

import java.util.Scanner;

public class Ex1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		char ch=' ';
		int cnt=1;
		String nStr="";
		
		for(char c:str.toCharArray()) {
			if(c==ch) {
				cnt++;
			}else {
				if(cnt>1) nStr+=cnt;
				
				nStr+=c;
				cnt=1;
				
				ch=c;
			}
			
		}
		
		if(cnt>1) nStr+=cnt;
		
		System.out.println(nStr);
	}

}
