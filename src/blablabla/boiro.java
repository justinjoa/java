package blablabla;

public class boiro {
	public int solution(int n) {

        return getAnswer(n);//자연수 n을 지정
    }

    public int getAnswer(int n) {

        int answer = 0; //answer값을 0으로 초기화

        while (n > 0) {//n값이 자연수일때

            answer += (n % 10);
            n /= 10;
        }

        return answer;
    }
}
