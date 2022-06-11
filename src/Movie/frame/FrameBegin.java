package Movie.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameBegin extends JPanel{
	public FrameBegin() {
		
		setBackground(new Color(255,241,54));
		setLayout(null);
		setSize(600,800);
		
		ImageIcon cinema = new ImageIcon("cinema.PNG");
		JLabel lblCinema = new JLabel(cinema);
		lblCinema.setSize(600,620);
		lblCinema.setLocation(-15,0);
		add(lblCinema);
		
		JButton info = new JButton("¿¹¸Å");
		JButton review = new JButton("Æò°¡");
		
		info.setBackground(new Color(183,240,117));
		review.setBackground(new Color(183,240,117));
		
		info.setSize(300,150);
		info.setLocation(
				((int) getSize().getWidth() / 2) - 310,
				(int) getLocation().getY() / 2 + 610);
		info.setFont(new Font("±¼¸²",Font.BOLD,26));
		info.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMovieSelect());
			}
		});
		
		review.setSize(300,150);
		review.setLocation(
				(int) getLocation().getX() + 300,
				(int) getLocation().getY() / 2 + 610);
		review.setFont(new Font("±¼¸²",Font.BOLD,26));
		review.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMovieReview());
			}
		});
		
		
		add(info);
		add(review);
	}
}
