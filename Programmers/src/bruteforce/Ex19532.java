package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex19532 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer(s);
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		int c= Integer.parseInt(st.nextToken());
		int d= Integer.parseInt(st.nextToken());
		int e= Integer.parseInt(st.nextToken());
		int f= Integer.parseInt(st.nextToken());
		
		
		int x=-999;
		int y=-999;
		boolean isFinish= false;
		
		for(int i=-999;i<1000;i++) {
			for(int j=-999;j<1000;j++) {
				if((a*i+b*j==c)&&(d*i+e*j==f)) {
					x=i;
					y=j;
					isFinish= true;
					break;
				}
			}
			if(isFinish) break;
		}
		
		System.out.println(x+" "+y);
	}

}
