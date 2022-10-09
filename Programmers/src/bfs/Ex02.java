package bfs;

import java.util.*;

public class Ex02 {
    static Queue<Integer> queue;
    static boolean isVisited[];
    public int solution(int n, int[][] computers) {
        int answer = 0;

        queue = new LinkedList<>(); 
        isVisited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                answer++;
                visit(i);
                bfs(computers); 
            }  
        }
          
        return answer;
    }
    
    public static void visit(int num){
        isVisited[num] = true; 
        queue.add(num);
    }
    
     public static void bfs(int[][] computers){
        if(queue.size()==0) return; 
         
         int refNum = queue.peek();
         int[] isNeighbor = computers[refNum]; //110
         
        // 이웃 탐색
        for (int i = 0; i <computers.length; i++) { //123
            // 이웃이라면
            if (isNeighbor[i]==1) {
                // 방문하지 않은 곳이며 1번과 10번 사이의 번호일 경우
                if (!isVisited[i] && i >= 0 && i < computers.length) {
                    // 방문하기
                    visit(i);
                }
            }
        }

        // 기준이 되는 번호에 대한 이웃 탐색 종료
        queue.poll();
         
        // 다음 기준에 대해 이웃 탐색 수행
        bfs(computers);
         
    }
}