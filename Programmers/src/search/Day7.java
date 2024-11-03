package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day7 {
	static List<String> words = new ArrayList<>();  // ������ ��� �ܾ ������ ����Ʈ
	static char[] arr = {'A', 'E', 'I', 'O', 'U'}; // ����� ���� �迭
	    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int answer = solution(s);
		
		System.out.println(answer);
	}
	
	public static int solution(String word) {
		 generateWords("", 0); // �� ���ڿ����� �ܾ� ���� ����
	     int answer = words.indexOf(word) + 1; 
	        
	     return answer;
    }
	
	// �ܾ� ���� �޼���
	public static void generateWords(String current, int depth) {
        if (depth > 5) return; // �ִ� 5�ڸ������� ����
        if (!current.isEmpty()) words.add(current); // �� ���ڿ��� �ƴ� ��� ����Ʈ�� �߰�

        for (char c : arr) {
            generateWords(current + c, depth + 1); // ��������� �ܾ ����
        }
    }

}
