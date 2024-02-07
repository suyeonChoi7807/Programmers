package inflearn_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(line);
		String str=st.nextToken();
		char c=st.nextToken().charAt(0);
		
		List<Integer> list= new ArrayList<>();
		
		int i=0;
		for(char s:str.toCharArray()) {
			if(s==c) {
				list.add(i); //¿Œµ¶Ω∫ ª¿‘
			}
			
			i++;
		}

		int idx=0;
		int left=list.get(0);
		int right=list.get(1);
		int list_idx=2;
		StringBuilder sb= new StringBuilder();
		
		while(idx<str.length()) {
			
			if(left==idx) {
				sb.append(0+" ");
			}else if(right==idx){
				sb.append(0+" ");
				
				if(list_idx<list.size()) {
					left=right;
					right=list.get(list_idx++);
				}
			}else{
				int min= Math.min(Math.abs(left-idx), Math.abs(right-idx));
				sb.append(min+" ");
			}
			
			idx++;
		}
		
		System.out.println(sb.toString());
		
		
	}

}
