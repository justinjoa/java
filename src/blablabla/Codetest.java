package blablabla;

public class Codetest {
	public static int abs(int value) {
		return value >= 0 ? value : -value; // value �� 0 ���� ũ�� + value ���, �ƴϸ� - value ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int value = 5;
			System.out.println(value + "�� ���밪: " + abs(value)); // �޼ҵ忡 value�� ���� �Էµǰ� 0���� ũ�� ������ +5 ���:(5�� ���� : 5)
			value = -10;
			System.out.println(value + "�� ���밪: " + abs(value)); // �޼ҵ忡 value�� ���� �Էµǰ� 0���� �۱� ������ -(-10) = 10  ���:(-10�� ���� : 10)
		
	}

}
