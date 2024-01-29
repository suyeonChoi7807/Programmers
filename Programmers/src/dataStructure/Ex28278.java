package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex28278 {
	static Stack<Integer> stack= new Stack<Integer>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<n;i++) {
			String s= br.readLine();
			if(s.length()>1) {
				//1
				StringTokenizer st= new StringTokenizer(s);
				int order= Integer.parseInt(st.nextToken()); //1
				int su= Integer.parseInt(st.nextToken()); //³ÖÀ» ¼ö
				if(order==1) {
					stack.add(su);
				}
			}else {
				//2
				int num= Integer.parseInt(s);
				if(num==2) {
					if(!stack.isEmpty()) {
						sb.append(stack.pop()+"\n");
					}else {
						sb.append("-1\n");
					}
				}else if(num==3) {
					sb.append(stack.size()+"\n");
				}else if(num==4) {
					if(!stack.isEmpty()) {
						sb.append("0\n");
					}else {
						sb.append("1\n");
					}
				}else if(num==5) {
					if(!stack.isEmpty()) {
						sb.append(stack.peek()+"\n");
					}else {
						sb.append("-1\n");
					}
				}
			}
		}
		
		System.out.println(sb.toString().trim());
		
	}

}
