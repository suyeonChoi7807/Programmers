package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex1625 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Integer, String> poketmons= new HashMap<Integer,String>();
		Map<String, Integer> poketmons2= new HashMap<String,Integer>();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		
		StringTokenizer st= new StringTokenizer(s);
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		
		for(int i=1;i<n+1;i++) {
			String name= br.readLine();
			
			poketmons.put(i, name);
			poketmons2.put(name, i);
		}
		
		
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<m;i++) {
			s= br.readLine();
			
			try {
	            int num= Integer.parseInt(s);
	            
	            sb.append(poketmons.get(num)+"\n");
	        } catch (NumberFormatException e) {
	        	
	        	sb.append(poketmons2.get(s)+"\n");
	        }
		}
		
		System.out.println(sb.toString().trim());
		
	}

}
