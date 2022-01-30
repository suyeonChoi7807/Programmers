package Kakao;
import java.util.*;


import java.lang.Math;

public class Intern2020_1 {

	public static void main(String[] args) {
		Solution6 sol =  new Solution6();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(sol.solution(numbers,hand));
	}

}


class Solution6 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        HashMap<Integer,Character> keypad = new HashMap<>();
        HashMap<Integer,int[]> keyindex = new HashMap<>();
        int left = '*';
        int right = '#';
        keypad.put(1,'L');
        keypad.put(4,'L');
        keypad.put(7,'L');
        keypad.put(3,'R');
        keypad.put(6,'R');
        keypad.put(9,'R');
        keyindex.put(1,new int[]{0,0});
        keyindex.put(2,new int[]{0,1});
        keyindex.put(3,new int[]{0,2});
        keyindex.put(4,new int[]{1,0});
        keyindex.put(5,new int[]{1,1});
        keyindex.put(6,new int[]{1,2});
        keyindex.put(7,new int[]{2,0});
        keyindex.put(8,new int[]{2,1});
        keyindex.put(9,new int[]{2,2});
        keyindex.put(new Integer('*'),new int[]{3,0});
        keyindex.put(0,new int[]{3,1});
        keyindex.put(new Integer('#'),new int[]{3,2});
        for(int n : numbers){
            if(keypad.containsKey(n)){
                //1,4,7,3,6,9
                answer+=keypad.get(n);
                if(keypad.get(n)=='L') 
                    left = n;
                else 
                    right = n;
            }else{
                //2,5,8,0
                int[] nindex = keyindex.get(n);
                int[] left_index = keyindex.get(left);
                int[] right_index = keyindex.get(right);
                
                int left_dist = Math.abs(nindex[0]-left_index[0]) + Math.abs(nindex[1]-left_index[1]);
                int right_dist = Math.abs(nindex[0]-right_index[0]) + Math.abs(nindex[1]-right_index[1]);
                
                if(left_dist<right_dist){
                    left = n;
                    answer+='L';
                }else if(left_dist>right_dist){
                    right = n;
                    answer+='R';
                }else{
                    if(hand.equals("left")){
                        left = n;
                        answer+='L';
                    }else{
                        right = n;
                        answer+='R';
                    }
                }
            }
        }
        
        
        return answer;
    }
}
