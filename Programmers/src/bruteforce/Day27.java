package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Day27 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> arrList = new ArrayList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			arrList.add(num);
		}
		
		int sum = 0;
		int bef = 0;
		
		for(int i=0;i<arrList.size();i++) {
			if(i==0) {
				bef=arrList.get(i);
			}
			else {
				if(arrList.get(i)>bef) {
					sum+=arrList.get(i);
					bef=arrList.get(i);
				}
			}
		}
	}

}
