package blablabla;

public class boiro2 {
		public long solution(int a, int b) {
		      long answer = 0;//answer값을 0으로 초기화
		      if (a < b) for (int i = a; i <= b; i++) answer += i;//두 수중 a<b이면 a가 b이하일때까지 등가.
		      else for (int i = b; i <= a; i++) answer += i;//위와 반대
		      return answer;
		  }
	}


