package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1158 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer(s);
		
		int n= Integer.parseInt(st.nextToken());
		int k= Integer.parseInt(st.nextToken());
		
		List<Integer> arr= new ArrayList<Integer>();
		//리스트 생성
		for(int i=1;i<n+1;i++) {
			arr.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int idx= k-1;
		boolean on= false;
		while(!arr.isEmpty()) {
			if(on) {
				sb.append(", ");
			}
			sb.append(arr.get(idx));
			arr.remove(idx);
			
			if(!arr.isEmpty()) {
				idx= (idx+(k-1))%(arr.size());
			}
			
			on= true;
		}
		
		sb.append(">");
		
		System.out.println(sb.toString());
	}

}
