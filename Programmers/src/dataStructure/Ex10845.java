package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex10845 {
	
	static LinkedList<Integer> queue = new LinkedList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //¸í·É ¼ö
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			String order = st.nextToken();
			int num;
			
			if(order.equals("push")) {
				queue.add(Integer.parseInt(st.nextToken())); 
			}else if(order.equals("pop")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					num=queue.poll();
					System.out.println(num);
				}
			}else if(order.equals("size")) {
				System.out.println(queue.size());
			}else if(order.equals("empty")) {
				System.out.println(queue.isEmpty()?"1":"0");
			}else if(order.equals("front")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(queue.peek());
				}
			}else if(order.equals("back")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(queue.peekLast());
				}
			}else {
				return;
			}
			
			
			
		}
		

	}

}
