package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		s=br.readLine();
		st=new StringTokenizer(s);
		
		int[] nums=new int[n];
		
		for(int i=0;i<n;i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		int lIdx=0;
		int rIdx=k-1;
		
		int sum=0;
		
		//초기 sum
		for(int i=0;i<k;i++) {
			sum+=nums[i];
		}
		
		//초기 maxSum
		int maxSum=sum;
			
		while(rIdx<n-1) {
			sum-=nums[lIdx];
			sum+=nums[rIdx+1];
			
			if(sum>maxSum) maxSum=sum;
			
			lIdx++;
			rIdx++;
		}
		
		System.out.println(maxSum);
	}

}
