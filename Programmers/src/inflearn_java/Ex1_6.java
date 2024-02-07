package inflearn_java;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		String str= sc.nextLine();
		HashMap<Integer,Character> arr = new HashMap<>();
		
		int i=0;
		for(char c:str.toCharArray()) {
			if(!arr.containsValue(c)) {
				arr.put(i, c);
				i++;
			}
		}
		
		StringBuilder sb= new StringBuilder();
		
		for(int j:arr.keySet()) {
			sb.append(arr.get(j));
		}
		
		System.out.println(sb.toString());
	
		
		
	}

}
