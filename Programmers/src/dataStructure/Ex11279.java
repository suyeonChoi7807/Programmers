package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11279 {
	static List<Integer> list= new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int cnt= Integer.parseInt(br.readLine());
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<cnt;i++) {
			int num= Integer.parseInt(br.readLine());
			
			if(num==0) {
				if(list.isEmpty()) {
					sb.append("0\n");
				}else {
					sb.append(list.get(list.size()-1)+"\n");
					list.remove(list.size()-1);
					
				}
			}else {
				int idx= 0;
				if(!list.isEmpty()) {
					idx= Math.abs(Collections.binarySearch(list, num)+1);
				}
				list.add(idx, num);
				
			}
		}
		
		System.out.println(sb.toString());
	}
}
