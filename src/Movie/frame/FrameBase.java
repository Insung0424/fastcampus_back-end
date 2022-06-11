package Movie.frame;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase extends JFrame{
	private static FrameBase instance;
	
	private FrameBase(JPanel jPanel) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		시스템 정보(화면 크기를 얻기 위한 Toolkit)
		
		setTitle("movie ticket reservation");
		setLayout(null);
		setBounds(((int) toolkit.getScreenSize().getWidth()) / 2 - 300,
				((int) toolkit.getScreenSize().getHeight()) / 2 - 400,
				600,800);
		
		add(jPanel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void getInstance(JPanel jPanel) {
		instance = new FrameBase(jPanel);
		//생성자를 통해 기본 프레임 정의
		
		instance.getContentPane().removeAll();
		instance.getContentPane().add(jPanel);
		
		instance.revalidate();
//		레이아웃 관리자에게 레이아웃정보를 다시 계산하도록 지시
		instance.repaint();
//		레이아웃을 새로 그린다
	}
}
