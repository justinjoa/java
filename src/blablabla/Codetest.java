package blablabla;

public class Codetest {
	public static int abs(int value) {
		return value >= 0 ? value : -value; // value 가 0 보다 크면 + value 출력, 아니면 - value 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int value = 5;
			System.out.println(value + "의 절대값: " + abs(value)); // 메소드에 value의 값을 입력되고 0보다 크기 때문에 +5 출력:(5의 절댓값 : 5)
			value = -10;
			System.out.println(value + "의 절대값: " + abs(value)); // 메소드에 value의 값을 입력되고 0보다 작기 때문에 -(-10) = 10  출력:(-10의 절댓값 : 10)
		
	}

}
