package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex2_11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());	//ÇÐ»ý¼ö
		int[][] cla=new int[n][n];
		StringTokenizer st;
		
		for(int i=0;i<n;i++) {
			String s=br.readLine();
			st=new StringTokenizer(s);
			
			for(int j=0;j<5;j++) {
				int num=Integer.parseInt(st.nextToken());
				
				cla[i][j]=num;
			}
		}
		
		int[] ans=new int[n];
		Set<Integer> tot=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				for(int z=0;z<n;z++) {
					int ban=cla[i][j];
					
					if(ban==cla[z][j]) {
						if(i!=z) tot.add(z+1);
					}
				}
			}
			ans[i]=tot.size();
			tot=new HashSet<>();
		}
		
		int max=Integer.MIN_VALUE;
		int maxIdx=0;
		
		for(int i=0;i<n;i++) {
			if(max<ans[i]) {
				max=ans[i];
				maxIdx=i;
			}
		}
		
		System.out.println(maxIdx+1);
	}

}
