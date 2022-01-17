package oneCommit;
import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		Solution2 sol = new Solution2();
		System.out.println(Arrays.toString( sol.solution(lottos, win_nums)));
	}

}

class Solution2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int plus = 0;
        HashMap<Integer, Integer> win_numbers = new HashMap<>();
        HashMap<Integer, Integer> rank = new HashMap<>();
        rank.put(2,5);
        rank.put(3,4);
        rank.put(4,3);
        rank.put(5,2);
        rank.put(6,1);
        
        for(int i : win_nums){
            win_numbers.put(i,0);
        }
        
        for(int lotto : lottos){
            if(lotto == 0){
                plus++;
            }else if(win_numbers.containsKey(lotto)){
                count++;
            }
        }
        
        answer[0] = rank.getOrDefault(count+plus, 6);
        answer[1] = rank.getOrDefault(count, 6);
        
        return answer;
    }
}