package blablabla;

import java.util.Scanner;

public class Score {

	private static ArrayList<Student> studentList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��߰� | 2.�л����� | 3.�л���ȸ | 4.�����Է� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����>> ");
			
			int selectNum = Integer.parseInt(scanner.next());
			
			switch (selectNum) {
			case 1 :
			    createStudent();
			    break;
			case 2 :
		        deleteStudent();
		        break;
			case 3 : 
		        searchStudent();
		        break;
			case 4 :
		        score();
		        break;
		    default:
		    	run = false;
		    	
		    	System.out.println("���α׷��� �����մϴ�.");
		    	break;
		    }
		}
	}
	private static void createStudent() {
		System.out.print("�л��̸�: ");
		String name = scanner.next();
		System.out.print("�л�����: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		Student s = new Student();
		
		s.setName(name);
		s.setAge(age);
		
		studentList.add(s);
	}
	private static void deleteStudent() {
		System.out.println("�л��̸�: ");
		String name = scanner.next();
		
		for(int i=0; i<studentList.size();i++) {
			student s = studentList.get(i);
			
			if(s.getName().equals(name)) {
				studentList.remove(i);
				System.out.println("�����Ǿ����ϴ�");
				break;
			}
		}
	}
	private static void searchStudent() {
		System.out.println("�л��̸�: ");
		String name = scanner.next();
		
		boolean notExist = false;
		
		for(int i=0; i<studentList.size();i++) {
			student s = studentList.get(i);
			
			if(s.getName().equals(name)) {
				System.out.println(s.getName()+" | "+s.getAge()+" | "+s.getKor()+" | "+s.getMath()+" | "+s.getEng());
				notExist = true;
				break;
			}
		}
	}
	
	

}
