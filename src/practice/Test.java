package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test extends JFrame{
	HashMap<String,String> hashmap = new HashMap<>();
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
		
		jbutton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1=textfield1.getText();
				String s2=textfield2.getText();
				// 텍스트필드에 입력된 값 가져오기
				
				hashmap.put(s1, s2); // 검색 기능을 위해 hashmap에 추가
				
				jtextarea.append(s1); // 사전역할을 하는
				jtextarea.append(" : "); // jtextarea에
				jtextarea.append(s2+"\n"); // 추가 및 줄바꿈
				
				textfield1.setText(""); //텍스트 필드 비우기
				textfield2.setText("");
			}
		});
		
		Set<Map.Entry<String, String>> set = hashmap.entrySet();
		jbutton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String find = JOptionPane.showInputDialog("찾고싶은 단어 입력");
				if(find != null) {
					for(Map.Entry<String, String> map : set) {
						String eng = map.getKey();
						String kor = map.getValue();
						
//						//팝업 창으로 띄울 경우
						if(find.equals(eng))
							JOptionPane.showMessageDialog(null, "뜻 : "+kor, "검색한 단어 "+eng, JOptionPane.INFORMATION_MESSAGE);
						else if(find.equals(kor))
							JOptionPane.showMessageDialog(null, "뜻 : "+eng, "검색한 단어 "+kor, JOptionPane.INFORMATION_MESSAGE);

//						//텍스트 필드에 찾는 단어를 띄어야 할경우
//						if(eng.equals(find)) {
//							textfield1.setText(eng);
//							textfield2.setText(kor);
//						}
//						else if(kor.equals(find)) {
//							textfield1.setText(eng);
//							textfield2.setText(kor);
//						}
						
					}
				}
			}
		});
		
		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test();
		
	}

}
