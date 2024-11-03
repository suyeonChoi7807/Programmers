package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day7 {
	static List<String> words = new ArrayList<>();  // 가능한 모든 단어를 저장할 리스트
	static char[] arr = {'A', 'E', 'I', 'O', 'U'}; // 사용할 모음 배열
	    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int answer = solution(s);
		
		System.out.println(answer);
	}
	
	public static int solution(String word) {
		 generateWords("", 0); // 빈 문자열부터 단어 생성 시작
	     int answer = words.indexOf(word) + 1; 
	        
	     return answer;
    }
	
	// 단어 생성 메서드
	public static void generateWords(String current, int depth) {
        if (depth > 5) return; // 최대 5자리까지만 생성
        if (!current.isEmpty()) words.add(current); // 빈 문자열이 아닌 경우 리스트에 추가

        for (char c : arr) {
            generateWords(current + c, depth + 1); // 재귀적으로 단어를 생성
        }
    }

}
