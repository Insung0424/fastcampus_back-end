package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import lottomaxrecord.NoneNum;
import myPage.MyPage;


public class MainP {
	

	private JFrame frame;
	private JTextArea tarea;
	private ArrayList<Integer> nlist = new ArrayList<>();
	private String count;
	private String select = "";
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainP window = new MainP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(79, 84, 630, 229);
		JTextArea tarea = new JTextArea();
		tarea.setBounds(80, 85, 600, 200);
		panel.add(tarea);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImagePanel ip = new ImagePanel(new ImageIcon("./image/user.png").getImage());
		
		JPanel MyPagepn = new JPanel();
		MyPagepn.setBackground(Color.BLACK);
		MyPagepn.setBounds(12, 10, 66, 65);
		MyPagepn.add(ip);
		MyPagepn.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				MyPage t = new MyPage();
				t.setVisible(true);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			
		});
	
		frame.getContentPane().add(MyPagepn);
		
		JLabel Titlelb = new JLabel("Title");
		Titlelb.setFont(new Font("Arial", Font.PLAIN, 40));
		Titlelb.setHorizontalAlignment(SwingConstants.CENTER);
		Titlelb.setForeground(Color.WHITE);
		Titlelb.setBounds(186, 10, 411, 65);
		frame.getContentPane().add(Titlelb);
		
		JPanel Numpanel1 = new JPanel();
		Numpanel1.setBounds(79, 337, 100, 100);
		frame.getContentPane().add(Numpanel1);
		Numpanel1.setLayout(null);
		
		JLabel Num1 = new JLabel("1");
		Num1.setHorizontalAlignment(SwingConstants.CENTER);
		Num1.setFont(new Font("Arial", Font.BOLD, 30));
		Num1.setBounds(21, 35, 57, 30);
		Numpanel1.add(Num1);
		
		JPanel Numpanel2 = new JPanel();
		Numpanel2.setBounds(185, 337, 100, 100);
		frame.getContentPane().add(Numpanel2);
		Numpanel2.setLayout(null);
		
		JLabel Num2 = new JLabel("2");
		Num2.setHorizontalAlignment(SwingConstants.CENTER);
		Num2.setFont(new Font("Arial", Font.BOLD, 30));
		Num2.setBounds(21, 35, 57, 30);
		Numpanel2.add(Num2);
		
		JPanel Numpanel3 = new JPanel();
		Numpanel3.setBounds(291, 337, 100, 100);
		frame.getContentPane().add(Numpanel3);
		Numpanel3.setLayout(null);
		
		JLabel Num3 = new JLabel("3");
		Num3.setHorizontalAlignment(SwingConstants.CENTER);
		Num3.setFont(new Font("Arial", Font.BOLD, 30));
		Num3.setBounds(21, 35, 57, 30);
		Numpanel3.add(Num3);
		
		JPanel Numpanel4 = new JPanel();
		Numpanel4.setBounds(397, 337, 100, 100);
		frame.getContentPane().add(Numpanel4);
		Numpanel4.setLayout(null);
		
		JLabel Num4 = new JLabel("4");
		Num4.setFont(new Font("Arial", Font.BOLD, 30));
		Num4.setHorizontalAlignment(SwingConstants.CENTER);
		Num4.setBounds(21, 35, 57, 30);
		Numpanel4.add(Num4);
		
		JPanel Numpanel5 = new JPanel();
		Numpanel5.setBounds(503, 337, 100, 100);
		frame.getContentPane().add(Numpanel5);
		Numpanel5.setLayout(null);
		
		JLabel Num5 = new JLabel("5");
		Num5.setFont(new Font("Arial", Font.BOLD, 30));
		Num5.setHorizontalAlignment(SwingConstants.CENTER);
		Num5.setBounds(21, 35, 57, 30);
		Numpanel5.add(Num5);
		
		JPanel Numpanel6 = new JPanel();
		Numpanel6.setBounds(609, 337, 100, 100);
		frame.getContentPane().add(Numpanel6);
		Numpanel6.setLayout(null);
		
		JLabel Num6 = new JLabel("6");
		Num6.setHorizontalAlignment(SwingConstants.CENTER);
		Num6.setFont(new Font("Arial", Font.BOLD, 30));
		Num6.setBounds(21, 35, 57, 30);
		Numpanel6.add(Num6);
		
		JButton Functionbtn = new JButton("기능");
		Functionbtn.setBounds(82, 469, 97, 65);
		Functionbtn.setBackground(Color.white);
		frame.getContentPane().add(Functionbtn);
		Functionbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tarea.append("확인용");
			}
		});
//		Functionbtn.addActionListener(new func1());
		// 기능 버튼을 눌렀을 때 다른 버튼 3개를 보여주는 방식 
//			혹은 버튼 크기를 조절해서 3개를 다 나열함
		JComboBox<String> CountRecord = new JComboBox<String>();
		CountRecord.setModel(new DefaultComboBoxModel<String>(
	            new String[] {"기간 설정","전체기간","최근 한달","최근 3개월","최근 6개월","최근 1년"}));
		CountRecord.setBounds(180, 469, 97, 65);
		CountRecord.setBackground(Color.white);
		frame.getContentPane().add(CountRecord);
		CountRecord.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tarea.setText("");
				JComboBox JC = (JComboBox) e.getSource();
	            String count = JC.getSelectedItem().toString();
	            
	            try {
	    			Connection conn = LottoLogin.getUserConnection();
	    			Statement stmt = conn.createStatement();
	    			
	    			select = SelectQuery(count);
	    			ResultSet rset = stmt.executeQuery(select);
	            
	            
	            while(rset.next()) {
		            int i=rset.getInt(1);
		            nlist.add(i);
		            int j=rset.getInt(2);
		            tarea.append("숫자 "+ i+"의 "+count+"동안 나온 횟수 "+ j+"\n");
		         }
		         
		         NoneNum Nn = new NoneNum(nlist);
		         
		         if(Nn.getNoneNum().length() > 1) {
		        	 tarea.append("목록에 없는 숫자" +
			                  Nn.getNoneNum() + "은(는) "+ count +"동안 나오지 않았습니다");
		         }
	            
	            }catch(Exception er) {
	    			er.printStackTrace();
	    		}
			}
		});
		
		
		
		JButton Mainbtn = new JButton("번호 추출!");
		Mainbtn.setBackground(Color.WHITE);
		Mainbtn.setBounds(329, 469, 125, 65);
		frame.getContentPane().add(Mainbtn);
		
		JButton Resetbtn = new JButton("초기화");
		Resetbtn.setBackground(Color.WHITE);
		Resetbtn.setBounds(612, 469, 97, 65);
		frame.getContentPane().add(Resetbtn);
		
		JButton Extrabtn = new JButton("실험실");
		Extrabtn.setBackground(Color.WHITE);
		Extrabtn.setBounds(684, 10, 88, 49);
		frame.getContentPane().add(Extrabtn);
		frame.setBounds(100, 100, 800, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
	
	
	
	public String SelectQuery(String count) {
		switch (count) {
		case "전체기간" :
			select = "select * from admin.copy_lotto_table_count_number_ASC";
			break;
		case "최근 한달" :
			select = "select * from admin.copy_lotto_table_count_number_ASC_MONTH1";
			break;
		case "최근 3개월" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH3";
			break;
		case "최근 6개월" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH6";
			break;
		case "최근 1년" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_YEAR1";
			break;
		}
		return select;
	}
	
}
