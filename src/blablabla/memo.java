package blablabla;

import java.awt.FileDialog;
import java.awt.event.*;
import java.io.*;


import javax.swing.*;

public class memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		import java.awt.Container;
		import java.awt.GridLayout;

		import javax.swing.JButton;
		import javax.swing.JFrame;

		public class GridLayoutExam
		{
			JFrame jFrame = new JFrame("�̹��� GridLayout�̴�!!");
			JButton [] btn = new JButton [6]; //6�� ����
			
			public GridLayoutExam()
		    {
				//GridLayout ����
				jFrame.setLayout(new GridLayout(3,2));
				
				//�����̳� ��������
				Container container = jFrame.getContentPane();
				
				//������Ʈ ���� �� �߰��ϱ�
				for(int i=0; i < btn.length; i++)
				{
					btn[i] = new JButton(i+"��ư");
					container.add(btn[i]);
				}
				
				//������ ũ�� �����ϱ�
				jFrame.setSize(300,300);
				
				//������ ���̱�
				jFrame.setVisible(true);
				
				//�����ư�� ���� ����
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
		    }

			public static void main(String[] args)
			{
				new GridLayoutExam();
			}

		}
