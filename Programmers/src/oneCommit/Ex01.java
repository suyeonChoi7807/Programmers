package oneCommit;

public class Ex01 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		
		Solution sol = new Solution();
		System.out.println(sol.solution(numbers));
	}

}

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int num : numbers){
            answer -= num;
        }
        
        return answer;
    }
}
