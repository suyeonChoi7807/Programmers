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
         
        // �̿� Ž��
        for (int i = 0; i <computers.length; i++) { //123
            // �̿��̶��
            if (isNeighbor[i]==1) {
                // �湮���� ���� ���̸� 1���� 10�� ������ ��ȣ�� ���
                if (!isVisited[i] && i >= 0 && i < computers.length) {
                    // �湮�ϱ�
                    visit(i);
                }
            }
        }

        // ������ �Ǵ� ��ȣ�� ���� �̿� Ž�� ����
        queue.poll();
         
        // ���� ���ؿ� ���� �̿� Ž�� ����
        bfs(computers);
         
    }
}