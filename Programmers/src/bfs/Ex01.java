package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {
	
	static boolean[][] isConnected; 
	static Queue<Integer> queue = new LinkedList<>();
	static boolean[] isVisited;
	public static int birusCnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int node = sc.nextInt();
		int connCount = sc.nextInt();
		isConnected = new boolean[node + 1][node + 1];
		isVisited = new boolean [node + 1];
		
		for(int i=0; i<connCount; i++) {
			int num1= sc.nextInt();
			int num2= sc.nextInt();
			
			isConnected[num1][num2] = true;
			isConnected[num2][num1] = true;
		}
		
		//시작점 방문처리
		visit(1);
		
		bfs();
		
		System.out.println(birusCnt);
	}

	/**
     * 방문하기
     * @param num 방문할 곳 번호
     */
    public static void visit(int num) {
        isVisited[num] = true;
        queue.add(num);
        if(num!=1) birusCnt++;
    }

    /**
     * BFS 방식으로 이웃 탐색 후 방문하기
     * 큐에서 이웃을 방문할 기준 번호를 뽑는다.
     */
    public static void bfs() {
        // 더이상 이웃 탐색할 기준이 없다면 종료
        if (queue.size() == 0) return;

        // 큐 대기열에서 기준이 되는 번호 꺼내기
        int refNum = queue.peek(); // 이웃을 찾을 기준이 되는 번호
        boolean[] isNeighbor = isConnected[refNum]; // 이웃인지 ex) num이 1이고 isNeighbor[2]=true라면 1과 2는 이웃이다.

        // 이웃 탐색
        for (int i = 1; i < isConnected.length; i++) {
            // 이웃이라면
            if (isNeighbor[i]) {
                // 방문하지 않은 곳이며 1번과 10번 사이의 번호일 경우
                if (!isVisited[i] && i >= 1 && i < isConnected.length) {
                    // 방문하기
                    visit(i);
                }
            }
        }

        // 기준이 되는 번호에 대한 이웃 탐색 종료
        queue.poll();

        // 다음 기준에 대해 이웃 탐색 수행
        bfs();
    }
}
