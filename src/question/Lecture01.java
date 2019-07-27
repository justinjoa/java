package question;

public class Lecture01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 0;
		int count = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.printf("  ");
			}
			for (int k = 1; k <= a; k++) {
				System.out.printf("%d ", count);
				count++;
			}
			System.out.println();
			b++;
			a--;

		}

	}
}
