package blablabla;

public class boiro {
	public int solution(int n) {

        return getAnswer(n);//�ڿ��� n�� ����
    }

    public int getAnswer(int n) {

        int answer = 0; //answer���� 0���� �ʱ�ȭ

        while (n > 0) {//n���� �ڿ����϶�

            answer += (n % 10);
            n /= 10;
        }

        return answer;
    }
}
