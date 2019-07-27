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
	// ������ ����
	JFrame jFrame = new JFrame("Menu����");

	// Swing������ �ؽ�Ʈ ����.. ��ũ�ѹٰ� �������� �ʴ´�.
	JTextArea textArea = new JTextArea("���� �Է��ϼ���.", 5, 10);// ��ũ�ѹ� ����

	// Swing���� ��ũ�ѹٸ� �ֱ� ���� �Ʒ��� ���� ����Ѵ�.
	JScrollPane jp = new JScrollPane(textArea);// ��Ŭ�ѹ� �����

	// �޴� ����
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("����");
	JMenu helpMenu = new JMenu("Help");

	public void MenuExam()
	{
		
		Container fileMenu;
		// ���� �޴� ����
		fileMenu.add(new JMenuItem("�� ����"));
		((JMenu)fileMenu).getItem(0).setAccelerator
		(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK)); //����Ű����
		fileMenu.add(new JMenuItem("����"));
		fileMenu.add(new JMenuItem("����"));
		((JMenu)fileMenu).addSeparator(); //���м� �߰�
		fileMenu.add(new JMenuItem("����"));

		Container helpMenu;
		// ���� �޴� ����
		helpMenu.add(new JMenuItem("����"));
		helpMenu.add(new JMenuItem("����"));

		Container menuBar;
		// �޴��� �޴��ٿ� ���
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);

		JFrame jFrame;
		// �޴��� �߰�
		jFrame.setJMenuBar((JMenuBar)(menuBar));

		Component jp;
		// �ؽ�Ʈ ���� �߰�
		jFrame.add(jp, "Center");

		// ������ ũ�� ����
		jFrame.setSize(300, 300);

		// ������ ���̱�
		jFrame.setVisible(true);

		// swing���� �ִ� X��ư Ŭ���� ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args)
	{
		// ����
		new MenuExam();
	}
}