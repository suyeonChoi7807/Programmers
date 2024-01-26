package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1924 {

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
					//System.out.println("0\n");
				}else {
					//Collections.sort(list);
					sb.append(list.get(0)+"\n");
					//System.out.println(list.get(0));
					list.remove(0);
					
					
				}
			}else {
				int idx= 0;
				if(!list.isEmpty()) {
					idx= Math.abs(Collections.binarySearch(list, num)+1);
				}
				//System.out.println("num:"+num+", idx: "+idx);
				list.add(idx, num);
				
			}
		}
		
		System.out.println(sb.toString());
	}


}
