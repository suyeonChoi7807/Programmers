package oneCommit;

public class Ex03 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		int answer = sol.solution(absolutes, signs);
		System.out.println(answer);
	}
}

class Solution3 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<signs.length;i++){
            if(signs[i]){
                //true
                answer += absolutes[i];
            }else {
                //false
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}
