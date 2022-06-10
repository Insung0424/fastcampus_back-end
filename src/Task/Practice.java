package Task;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Practice extends JFrame{
	JPanel disp = new JPanel();
	JPanel butp = new JPanel();
	JPanel n = new JPanel();
	
	JTextField distf=new JTextField(20);
	
	String buttonarr[] = {"0","1","2","3","4","5","6","7","8","9",
			"+","-","*","/","=","CE"};
	JButton[] bar = new JButton[16];
	
	ArrayList<String> arr = new ArrayList<>();
	String narr="";
	
	Practice(){
		Container c = getContentPane();
		setLayout(new BorderLayout());
		
		disp.setLayout(new FlowLayout());
		butp.setLayout(new GridLayout(0,4,20,20));
		
		distf.setText("");
		disp.add(distf);
		
		for(int i=0;i<bar.length;i++) {
			bar[i]=new JButton(buttonarr[i]);
			bar[i].addActionListener(new Key());
			if(i<10) {
				bar[i].setBackground(Color.gray);
			}
			else {
				bar[i].setBackground(Color.yellow);
			}
		}
		butp.add(bar[7]);
		butp.add(bar[8]);
		butp.add(bar[9]);
		butp.add(bar[13]);
		
		butp.add(bar[4]);
		butp.add(bar[5]);
		butp.add(bar[6]);
		butp.add(bar[12]);
		
		butp.add(bar[1]);
		butp.add(bar[2]);
		butp.add(bar[3]);
		butp.add(bar[11]);
		
		butp.add(bar[0]);
		butp.add(bar[15]);
		butp.add(bar[14]);
		butp.add(bar[10]);
		
		c.add(disp,BorderLayout.NORTH);
		c.add(butp,BorderLayout.CENTER);
		c.add(n,BorderLayout.SOUTH);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class Key implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if(command.equals("CE")) {
				distf.setText("");
			}
			else if(command.equals("=")) {
				arr.clear(); //이전 값이 존재하면 비우기
				for (int i = 0; i < distf.getText().length(); i++) {
					char c = distf.getText().charAt(i);
					if (c == '+' || c == '-' || c == '*' || c == '/') {
						arr.add(narr);
						narr = "";
						arr.add(c + "");
					} else {
						narr = narr + c;
					}
				}
				arr.add(narr);
				double result = 0;
				double get = 0;
				String calculate = "";
						
				for (String s : arr) {
					if (s.equals("+")) {
						calculate = "p";
					} else if (s.equals("-")) {
						calculate = "m";
					}  
					else if (s.equals("*")) {
						calculate = "t";
					}  
					else if (s.equals("/")) {
						calculate = "d";
					}  else {
						get = Double.parseDouble(s);
						if (calculate.equals("p")) {
							result += get;
						} else if (calculate.equals("m")) {
							result -= get;
						} 
						else if (calculate.equals("t")) {
							result *= get;
						} 
						else if (calculate.equals("d")) {
							result /= get;
						} else {
							result = get;
						}
					}
				}
				double d = result;
				String s = Double.toString(d);
				distf.setText("" + s);
				narr = "";
			}
			else {
				distf.setText(distf.getText() + command);
			}
			
		}
	}
	
	public static void main(String[] args) {

		new Practice();
		
	}

}
