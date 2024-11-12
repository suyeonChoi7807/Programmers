package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Ex13417 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int caseSu = Integer.parseInt(br.readLine());	//case
		
		for(int i=0;i<caseSu;i++) {
			int n = Integer.parseInt(br.readLine());
			
			String s = br.readLine();
			StringTokenizer st= new StringTokenizer(s);
			
			Deque<Character> queue = new ArrayDeque<Character>();
			
			for(int j=0;j<n;j++) {
				char c = st.nextToken().charAt(0); 
				if(queue.isEmpty()) {
					queue.add(c);
				} else {
					int first = queue.getFirst();
					if(first<c) 
						queue.addLast(c);
					else 
						queue.addFirst(c);
				}
			}
			
			queue.forEach(t -> sb.append(t));
			sb.append("\n");
			queue = new ArrayDeque<Character>();
		}
		
		System.out.println(sb);
	}

}
