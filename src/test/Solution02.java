package test;

public class Solution02 {

	 public long solution(int a, int b) {
	      long answer = 0;
	      if (a < b) for (int i = a; i <= b; i++) answer += i;//a와 b를 비교하여 a가 클경우에는 a부터 b까지의 합을 answer에 저장하고
	      else for (int i = b; i <= a; i++) answer += i;//b가 클경우에는 b부터 a까지의 합을 answer에 저장합니다.
	      return answer;
	  }
}
