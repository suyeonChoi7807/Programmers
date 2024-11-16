package search;
import java.util.*;

/*
 * 완전탐색 - 모의고사
 */
public class Day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		for(int arrNum:Solution.solution(arr)) {
			System.out.println(arrNum+" ");
		}
	}
	
}

class Solution {
    public static int[] solution(int[] answers) {
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int[] score = new int[3];
        int[] sa1 = {1,2,3,4,5};
        int[] sa2 = {2,1,2,3,2,4,2,5};
        int[] sa3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int ans : answers){
            if(ans==sa1[cnt1++]) score[0]++;
            if(ans==sa2[cnt2++]) score[1]++;
            if(ans==sa3[cnt3++]) score[2]++;
            
            if(cnt1>=sa1.length) cnt1=0;
            if(cnt2>=sa2.length) cnt2=0;
            if(cnt3>=sa3.length) cnt3=0;
        }
        
         // 최고 점수를 받은 사람 찾기
        List<Integer> list = new ArrayList<>();
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                list.add(i + 1);
            }
        }

        // List<Integer>를 int[]로 변환
        return list.stream().mapToInt(i -> i).toArray();
    }
}