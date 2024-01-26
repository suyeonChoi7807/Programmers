package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1766 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		
		StringTokenizer st= new StringTokenizer(s);
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		
		List<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<n+1;i++) {
			list.add(i);
		}
		
		for(int i=0;i<m;i++) {
			s= br.readLine();
			st= new StringTokenizer(s);
			
			int num1= Integer.parseInt(st.nextToken());
			int num2= Integer.parseInt(st.nextToken());
			int num1Pos= Collections.binarySearch(list, num1); 
			int num2Pos= Collections.binarySearch(list, num2);
			
			if(num1Pos>num2Pos) {
				list.add((num1Pos==n-1)?num1Pos:num1Pos+1, num2);
				list.remove(num2Pos);
			}
			
		}
		
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i)+" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
