package blablabla;

public class boiro2 {
		public long solution(int a, int b) {
		      long answer = 0;//answer���� 0���� �ʱ�ȭ
		      if (a < b) for (int i = a; i <= b; i++) answer += i;//�� ���� a<b�̸� a�� b�����϶����� �.
		      else for (int i = b; i <= a; i++) answer += i;//���� �ݴ�
		      return answer;
		  }
	}


