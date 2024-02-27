package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex3_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine()); //1<=n<=100
		String s=br.readLine();
		
		StringTokenizer st=new StringTokenizer(s);
		List<Integer> nList=new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			nList.add(Integer.parseInt(st.nextToken()));
		}

		int m=Integer.parseInt(br.readLine()); //1<=m<=100
		s=br.readLine();
		st=new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			nList.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(nList);
		
		StringBuilder sb=new StringBuilder();
		for(int num:nList) {
			sb.append(num+" ");
		}
		
		System.out.println(sb.toString().trim());
		
	}

}
