package: practice;


import javax.swing.JFrame;
import java.awt.event.InputEvent;
import java.awt.Container;
import javax.swing.KeyStroke;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class public MenuExam {
{
	// 프레임 선언
	JFrame jFrame = new JFrame("Menu예제");

	// Swing에서의 텍스트 영역.. 스크롤바가 존재하지 않는다.
	JTextArea textArea = new JTextArea("내용 입력하세요.", 5, 10);// 스크롤바 없음

	// Swing에서 스크롤바를 넣기 위해 아래와 같이 사용한다.
	JScrollPane jp = new JScrollPane(textArea);// 스클롤바 만들기

	// 메뉴 선언
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("파일");
	JMenu helpMenu = new JMenu("Help");

	public void MenuExam()
	{
		
		Container fileMenu;
		// 파일 메뉴 생성
		fileMenu.add(new JMenuItem("새 파일"));
		((JMenu)fileMenu).getItem(0).setAccelerator
		(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK)); //단축키설정
		fileMenu.add(new JMenuItem("열기"));
		fileMenu.add(new JMenuItem("저장"));
		((JMenu)fileMenu).addSeparator(); //구분선 추가
		fileMenu.add(new JMenuItem("종료"));

		Container helpMenu;
		// 도움 메뉴 생성
		helpMenu.add(new JMenuItem("버전"));
		helpMenu.add(new JMenuItem("정보"));

		Container menuBar;
		// 메뉴를 메뉴바에 등록
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);

		JFrame jFrame;
		// 메뉴바 추가
		jFrame.setJMenuBar((JMenuBar)(menuBar));

		Component jp;
		// 텍스트 영역 추가
		jFrame.add(jp, "Center");

		// 프레임 크기 지정
		jFrame.setSize(300, 300);

		// 프레임 보이기
		jFrame.setVisible(true);

		// swing에만 있는 X버튼 클릭시 종료
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args)
	{
		// 실행
		new MenuExam();
	}
}