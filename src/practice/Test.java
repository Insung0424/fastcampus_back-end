package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test extends JFrame{
	Test(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		JPanel jpanel1 = new JPanel();
		
		JLabel jlabel1 = new JLabel("영어");
		JTextField textfield1 = new JTextField(10);
		jpanel1.add(jlabel1); jpanel1.add(textfield1);
		
		JLabel jlabel2 = new JLabel("한글");
		JTextField textfield2 = new JTextField(10);
		jpanel1.add(jlabel2); jpanel1.add(textfield2);
		
		JButton jbutton1 = new JButton("삽입");
		JButton jbutton2 = new JButton("찾기");
		jpanel1.add(jbutton1); jpanel1.add(jbutton2);
		c.add(jpanel1);
		
		JPanel jpanel2 = new JPanel();
		JTextArea jtextarea = new JTextArea(5,25);
		Border lineBorder = 
				BorderFactory.createLineBorder(Color.black, 1);
		jtextarea.setBorder(lineBorder);
		jpanel2.setSize(100,200);
		jpanel2.add(jtextarea);
		c.add(jpanel2);
		
		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test();
		
	}

}
