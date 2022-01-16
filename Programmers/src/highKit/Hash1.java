package highKit;
import java.util.*;

public class Hash1 {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Solution sol = new Solution();
	    System.out.println(sol.solution(participant, completion));	
	}
}


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> participants = new HashMap<>();
        
        for(String p : participant){
           if(participants.containsKey(p)){
               //포함
               participants.put(p, participants.get(p) + 1);
           }else{
               //포함x
               participants.put(p,1);
           }
        }
        
        for(String c : completion){
            if(participants.containsKey(c)){
                if(participants.get(c)==1){
                    participants.remove(c);
                }else{
                    participants.put(c,  participants.get(c) - 1);
                }
            }
        }
        
        Set<String> keys = participants.keySet();
        for (String key : keys) {
            answer = key;
        }
        
        return answer;
    }
}
