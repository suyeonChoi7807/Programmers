package highKit;

import java.util.Arrays;

public class Hash2 {
	public static void main(String[] args) {
		Solution5 sol =  new Solution5();
		String[] strs = {"12","123","1235","567","88"};
		System.out.println(sol.solution(strs));
	}
}

class Solution5{
    public boolean solution(String[] phone_book) {
       // 1. phoneBook�� sorting�Ѵ�. 
        Arrays.sort(phone_book);

       // 2. 1�� Loop�� ���� �� ��ȣ�� �� ��ȣ�� ���ξ����� Ȯ���Ѵ�. 
        for (int i = 0; i < phone_book.length - 1; i++) 
            if (phone_book[i + 1].startsWith(phone_book[i])) 
                return false;
        // 3. ������� ���� ���ξ ���ٴ� ���̴�. 
        return true;
    }
}
