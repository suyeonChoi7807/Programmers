package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		List<Integer> list= new ArrayList<>();
		List<Integer> rankList= new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int num= Integer.parseInt(st.nextToken());
			list.add(num);
			rankList.add(num);
		}
		
		Collections.sort(rankList, Comparator.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(int score:list) {
			 sb.append((rankList.indexOf(score)+1)+" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
