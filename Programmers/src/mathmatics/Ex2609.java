package mathmatics;
import java.util.Scanner;
 
public class Ex2609 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
 
		int d = gcd(a, b);	// �ִ�����
 
		System.out.println(d);
		System.out.println(a * b / d);
 
	}
 
	// �ִ����� ��� ���
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
            
		// GCD(a, b) = GCD(b, r)�̹Ƿ� (r = a % b)
		return gcd(b, a % b);
	}
}