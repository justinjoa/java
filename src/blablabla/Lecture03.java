package blablabla;

public class Lecture03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {//한 근의 조건 제시.
			for(int j=0;j<=10;j++) {//다른 한 근의 조건 제시.
				if(2*i+4*j==10) {//방정식에 두 근을 대입했을때 10 이 되야함을 말함.
					System.out.print("i= " +i+ " ");
					System.out.println("j= " +j+ " ");
				}
			}
		}
	}
}
