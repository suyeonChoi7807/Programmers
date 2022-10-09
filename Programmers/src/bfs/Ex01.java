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
		
		//������ �湮ó��
		visit(1);
		
		bfs();
		
		System.out.println(birusCnt);
	}

	/**
     * �湮�ϱ�
     * @param num �湮�� �� ��ȣ
     */
    public static void visit(int num) {
        isVisited[num] = true;
        queue.add(num);
        if(num!=1) birusCnt++;
    }

    /**
     * BFS ������� �̿� Ž�� �� �湮�ϱ�
     * ť���� �̿��� �湮�� ���� ��ȣ�� �̴´�.
     */
    public static void bfs() {
        // ���̻� �̿� Ž���� ������ ���ٸ� ����
        if (queue.size() == 0) return;

        // ť ��⿭���� ������ �Ǵ� ��ȣ ������
        int refNum = queue.peek(); // �̿��� ã�� ������ �Ǵ� ��ȣ
        boolean[] isNeighbor = isConnected[refNum]; // �̿����� ex) num�� 1�̰� isNeighbor[2]=true��� 1�� 2�� �̿��̴�.

        // �̿� Ž��
        for (int i = 1; i < isConnected.length; i++) {
            // �̿��̶��
            if (isNeighbor[i]) {
                // �湮���� ���� ���̸� 1���� 10�� ������ ��ȣ�� ���
                if (!isVisited[i] && i >= 1 && i < isConnected.length) {
                    // �湮�ϱ�
                    visit(i);
                }
            }
        }

        // ������ �Ǵ� ��ȣ�� ���� �̿� Ž�� ����
        queue.poll();

        // ���� ���ؿ� ���� �̿� Ž�� ����
        bfs();
    }
}
