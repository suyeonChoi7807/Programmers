package search;

import java.util.*;

public class Day23 {
    public int solution(String numbers) {
        int answer = 0;
        char[] numArr = numbers.toCharArray();
        boolean[] visited = new boolean[numbers.length()];
        
        Set<Integer> ansSet = new HashSet<>();
        searchSosu(numArr, visited, ansSet, "");
        answer = ansSet.size();
        return answer;
    }
    
    private void searchSosu(char[] numArr, boolean[] visited, Set<Integer> count, String str) {
        if (!str.isEmpty()) {
            int num = Integer.parseInt(str);
            if (isSosu(num)) {
                count.add(num);
            }
        }
        
        for (int i = 0; i < numArr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                searchSosu(numArr, visited, count, str + numArr[i]);
                visited[i] = false; // 원상 복구
            }
        }
    }
    
    public boolean isSosu(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) { // √num 까지만 확인
            if (num % i == 0) return false;
        }
        return true;
    }
}
