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
			JFrame jFrame = new JFrame("이번엔 GridLayout이다!!");
			JButton [] btn = new JButton [6]; //6개 생성
			
			public GridLayoutExam()
		    {
				//GridLayout 적용
				jFrame.setLayout(new GridLayout(3,2));
				
				//컨테이너 가져오기
				Container container = jFrame.getContentPane();
				
				//컴포넌트 생성 및 추가하기
				for(int i=0; i < btn.length; i++)
				{
					btn[i] = new JButton(i+"버튼");
					container.add(btn[i]);
				}
				
				//프레임 크기 지정하기
				jFrame.setSize(300,300);
				
				//프레임 보이기
				jFrame.setVisible(true);
				
				//종료버튼에 대한 설정
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
		    }

			public static void main(String[] args)
			{
				new GridLayoutExam();
			}

		}
