package search;

import java.util.Arrays;

public class Day3 {
	/*
	 * 프로그래머스 - 입국심사
	 * level3
	 * 이분탐색
	 */

	public static void main(String[] args)  {
		int n = 6;	//사람수
		int[] times = {7,10};
	
		long answer = solution(n, times);
		System.out.println(answer);
	}

	public static long solution(int n, int[] times) {
        long answer = 0;
        int people = times.length;
        
        Arrays.sort(times);	//오름차순 정렬
        
        if(n<=people) {
        	answer= times[n-1];
        } else {
        	answer= getMinMinutes(n, times);
        }
        
        return answer;
    }

	private static long getMinMinutes(int n, int[] times) {
		long left = 1L;
		long right = (long)n*times[0];
		long answer = right; //최소값

		while(left<=right){
			long mid = (left+right)/2;
			long cnt = 0;   //mid시간내 처리할 수 있는 명수 총합
				   
			for(int i=0;i<times.length;i++){
				cnt += mid/times[i];
			}
					
			if(n<=cnt){
				answer = mid;
				right = mid-1;
			} else{
				left = mid+1;
			}
		}
		return answer;
	}
}
