package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2212 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		List<Integer> arrList = new ArrayList<Integer>();
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		for(int i=0;i<n;i++) {
			arrList.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arrList);//오름차순 정렬
		
		

	}

}
