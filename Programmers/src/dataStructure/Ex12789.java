package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex12789 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine()); 
		Stack<Integer> stack= new Stack<>();
		
		String s= br.readLine(); 
		StringTokenizer st= new StringTokenizer(s);
		int cnt=1;
		
		for(int i=0;i<n;i++) {
			int num= Integer.parseInt(st.nextToken());
			if(num==cnt) {
				cnt++;
				while(!stack.isEmpty()&&cnt==stack.peek()) {
					stack.pop();
					cnt++;
				}
			}else {
				stack.add(num);
			}
		}
		
		
		if(cnt==n+1) {
			System.out.println("Nice");
		}else {
			System.out.println("Sad");
		}
	}

}
