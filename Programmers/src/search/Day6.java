package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Day6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);

		int n =Integer.parseInt(st.nextToken()); //나무의 수
		long m =Integer.parseInt(st.nextToken()); //상근이가 가지고싶은 나무의 길이
		
		s = br.readLine(); //다음 입력값 받기
		st = new StringTokenizer(s);
		
		List<Long> lengths = new ArrayList<>();	//나무길이들을 저장
		while(st.hasMoreTokens()) {
			lengths.add(Long.parseLong(st.nextToken()));
		}
		
		Collections.sort(lengths);	//오름차순 정렬
		
		System.out.println(searchMaxLength(n, m, lengths));
	}

	private static long searchMaxLength(int n, long m, List<Long> lengths) {
		long left = 1;
		long right = lengths.get(n-1);	//m을 나무들중 가장큰 길이로 하면 하나도 가질 수 없기 때문에 최대로 설정 
		long answer = 0;
		
		while(left<=right) {
			long mid = (left+right)/2;
			long tot = 0;
			
			for(long length:lengths) { //10 15 17 20
				if(length>=mid) {
					tot += length-mid;
				}
			}
			
			if(tot>=m) {
				answer = mid;
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		
		return answer;
	}

}
