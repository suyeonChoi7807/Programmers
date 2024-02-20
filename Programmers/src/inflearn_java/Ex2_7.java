package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int cnt=0;
		int tot=0;
		for(int i=0;i<n;i++) {
			int res= Integer.parseInt(st.nextToken());
			
			if(res==1) {
				//이기면
				cnt++;
				tot+=cnt;
			}else {
				//지면
				if(cnt>0) {
					cnt=0;
				}
			}
		}
		
		System.out.println(tot);
		
	}

}
