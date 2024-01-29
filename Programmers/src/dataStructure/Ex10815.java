package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ex10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> nSet= new HashSet<Integer>();
		
		int n= Integer.parseInt(br.readLine());
		
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer(s);
		for(int i=0;i<n;i++) {
			nSet.add(Integer.parseInt(st.nextToken()));
		}
		
		int m= Integer.parseInt(br.readLine());
		
		s= br.readLine();
		st= new StringTokenizer(s);
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<m;i++) {
			if(nSet.contains(Integer.parseInt(st.nextToken()))) {
				sb.append("1 ");
			}else {
				sb.append("0 ");
			}
		}
		
		System.out.println(sb.toString().trim());
	}

}
