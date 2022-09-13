package exercise;

public class Day220913_01 {
	public int solution(int n) {
        int answer = 0;
        int i = 2;
    
        while(true){
            if((n-1)%i==0) return i;
            i++;
        }
        
    }
}
