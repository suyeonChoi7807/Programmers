package search;

import java.util.Arrays;

public class Day3 {
	/*
	 * ���α׷��ӽ� - �Ա��ɻ�
	 * level3
	 * �̺�Ž��
	 */

	public static void main(String[] args)  {
		int n = 6;	//�����
		int[] times = {7,10};
	
		long answer = solution(n, times);
		System.out.println(answer);
	}

	public static long solution(int n, int[] times) {
        long answer = 0;
        int people = times.length;
        
        Arrays.sort(times);	//�������� ����
        
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
		long answer = right; //�ּҰ�

		while(left<=right){
			long mid = (left+right)/2;
			long cnt = 0;   //mid�ð��� ó���� �� �ִ� ��� ����
				   
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
