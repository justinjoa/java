package blablabla;

import java.util.Scanner;

public class Lecture01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		outer: while(true) {
			System.out.println("(1)square");
			System.out.println("(2)square root");
			System.out.println("(3)log");
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ˽��ϴ�.(����� 0");
				continue;
			}
			for(;;) {
				System.out.print("����� ���� �Է��ϼ���.(��� ���� : 0, ��ü ���� : 99)>");
				tmp = scanner.nextLine();
				
				if(menu==0)
					break;
				if(num==99)
					break outer;
				switch(menu) {
				case 1:
					System.out.println("resuults" + num * num);
					break;
				case 2:
					System.out.println("results" + Math.sqrt(num));
					break;
				case 3:
					System.out.println("results" + Math.log(num));
					break;
				}
			}
		}
	}

}
