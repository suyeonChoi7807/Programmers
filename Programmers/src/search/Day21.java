package search;

public class Day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int arrNum:Solution2.solution(10,2)) {
			System.out.print(arrNum+" ");
		}
		
	}

}

class Solution2 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int x=3;x<=5000;x++){
            for(int y=3;y<=5000;y++){
                if((x-2)*(y-2)==yellow&&2*(x+y)-4==brown){
                    answer[0] = x;
                    answer[1] = y;
                }
            }
        }
        
        
        
        return answer;
    }
}