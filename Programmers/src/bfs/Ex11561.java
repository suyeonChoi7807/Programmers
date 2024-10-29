package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11561 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int caseCnt = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<caseCnt;i++) {
			long num = Long.parseLong(br.readLine());
			long result = 0;
			
			if(num==1||num==2) {
				result=1;
			}else {
				result = getMaxCount(num);
			}
			
			//sb.append("num:"+num+", result: "+result+"\n");
			sb.append(result+"\n");
		}
		
		System.out.println(sb);

	}

	private static long getMaxCount(long n) {
		long left = 1;  // 시작값을 1로
	    long right = (long) Math.sqrt(2 * n);  // 적정 범위로 줄임
		long result = 0;
		
		while(left<=right) {
			long mid = (left+right)/2;
			long num = (long)mid*(mid+1)/2;
			
			if(num==n) {
				return mid;
			}else if(num<n){
				result = mid;
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return result;
	}

}
