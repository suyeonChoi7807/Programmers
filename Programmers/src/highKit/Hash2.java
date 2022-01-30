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
       // 1. phoneBook을 sorting한다. 
        Arrays.sort(phone_book);

       // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다. 
        for (int i = 0; i < phone_book.length - 1; i++) 
            if (phone_book[i + 1].startsWith(phone_book[i])) 
                return false;
        // 3. 여기까지 오면 접두어가 없다는 것이다. 
        return true;
    }
}
