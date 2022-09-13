package exercise;
import java.util.*;

public class Day220913_04 {
	 public String solution(String s) {
	        String answer = "";
	        int[] arr = stringToArray(s);
	        
	        Arrays.sort(arr);
	        
	        answer += arr[0]+" "+arr[arr.length-1];
	        
	        return answer;
	    }
	    
	    int[] stringToArray(String s){
	        StringTokenizer st = new StringTokenizer(s);
	        int[] attr = new int[st.countTokens()];
	        int i = 0;
	        
	        while(st.hasMoreTokens()){
	            attr[i] = Integer.parseInt(st.nextToken());
	            i++;
	        }
	        
	        return attr;
	    }
}
