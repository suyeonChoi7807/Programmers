package exercise;

public class Day221004_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] arr = {1,2,3,4};
		
		double avg = sol.solution(arr);
		System.out.println(avg);
	}

}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for(int i: arr){
            sum += i;
        }
        
        answer = sum/arr.length;
        
        return answer;
    }
}
