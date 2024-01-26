package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1764 {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer(s);
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		
		HashSet<String> members= new HashSet<>();
		List<String> both= new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			s= br.readLine();
			members.add(s);
		}
		
		
		for(int i=0;i<m;i++) {
			s= br.readLine();
			if(members.contains(s)){
				both.add(s);
			}
		}
		
		Collections.sort(both);
		
		StringBuilder sb= new StringBuilder();
		sb.append(both.size()+"\n");
		for(int i=0;i<both.size();i++) {
			sb.append(both.get(i)+"\n");
		}
		System.out.println(sb.toString()); 
		
	}

}



