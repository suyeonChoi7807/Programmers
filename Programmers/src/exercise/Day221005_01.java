package exercise;

class Day221005_01 {
    public int sumDivisor(int num) {
        int answer = 0;
            for(int i = 1; i <= num/2; i++){
        if(num%i == 0) answer += i;
      }
        return answer+num;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
    	Day221005_01 c = new Day221005_01();
        System.out.println(c.sumDivisor(12));
    }
}