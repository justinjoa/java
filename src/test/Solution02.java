package test;

public class Solution02 {

	 public long solution(int a, int b) {
	      long answer = 0;
	      if (a < b) for (int i = a; i <= b; i++) answer += i;//a�� b�� ���Ͽ� a�� Ŭ��쿡�� a���� b������ ���� answer�� �����ϰ�
	      else for (int i = b; i <= a; i++) answer += i;//b�� Ŭ��쿡�� b���� a������ ���� answer�� �����մϴ�.
	      return answer;
	  }
}
