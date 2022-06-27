package Lotto;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class LottoGame extends JFrame {
    LottoEvent lotto  = new LottoEvent(this);
 
    JPanel row1 = new JPanel();
    ButtonGroup option = new ButtonGroup();
    JCheckBox quickpick = new JCheckBox("자동 추첨",false);
    JCheckBox personal = new JCheckBox("수동",true);
 
    JPanel row2 = new JPanel();
    JLabel numbersLabel = new JLabel("내가 선택한 번호 : ", JLabel.RIGHT);
    JTextField[] numbers = new JTextField[6];
    JLabel winnersLabel = new JLabel("당첨 번호 : " , JLabel.RIGHT);
    JTextField[] winners = new JTextField[6];
 
    JPanel row3 = new JPanel();
    JButton stop = new JButton("멈추기");
    JButton play = new JButton("게임 시작!");
    JButton reset = new JButton("처음으로");
 
    JPanel row4 = new JPanel();
    JLabel got3Label = new JLabel("5등 당첨 횟수 :",JLabel.RIGHT);
    JTextField got3 = new JTextField("0");
    JLabel got4Label = new JLabel("4등 당첨 횟수:",JLabel.RIGHT);
    JTextField got4 = new JTextField("0");
    JLabel got5Label = new JLabel("3등 당첨 횟수:",JLabel.RIGHT);
    JTextField got5 = new JTextField("0");
    JLabel got6Label = new JLabel("1등 당첨 횟수:",JLabel.RIGHT);
    JTextField got6 = new JTextField("0");
    JLabel drawingsLabel = new JLabel("구매한 횟수 :",JLabel.RIGHT);
    JTextField drawings = new JTextField("0");
    JLabel yearsLabel = new JLabel("몇년이 지났나? :",JLabel.RIGHT);
    JTextField years = new JTextField("0");
 
    public LottoGame(){
        super("1주에 1000원씩 무한대로 구매해보자!");
        setSize(550, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5,1,10,10);
        setLayout(layout);
 
        quickpick.addItemListener(lotto);
        personal.addItemListener(lotto);
        stop.addActionListener(lotto);
        play.addActionListener(lotto);
        reset.addActionListener(lotto);
 
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        option.add(quickpick);
        option.add(personal);
        row1.setLayout(layout1);
        row1.add(quickpick);
        row1.add(personal);
        add(row1);
 
        GridLayout layout2 = new GridLayout(2, 7 ,10, 10);
        row2.setLayout(layout2);
        row2.add(numbersLabel);
        for (int i =0 ;i<6; i++){
            numbers[i] = new JTextField();
            row2.add(numbers[i]);
        }
        row2.add(winnersLabel);
        for (int i=0; i<6; i++){
            winners[i]=new JTextField();
            winners[i].setEnabled(false);
            row2.add(winners[i]);
        }
        add(row2);
 
        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row3.setLayout(layout3);
        stop.setEnabled(false);
        row3.add(stop);
        row3.add(play);
        row3.add(reset);
        add(row3);
 
        GridLayout layout4 = new GridLayout(2, 3, 20, 10);
        row4.setLayout(layout4);
        row4.add(got3Label);
        got3.setEditable(false);
        row4.add(got3);
        row4.add(got4Label);
        got4.setEditable(false);
        row4.add(got4);
        row4.add(got5Label);
        got5.setEditable(false);
        row4.add(got5);
        row4.add(got6Label);
        got6.setEditable(false);
        row4.add(got6);
        row4.add(drawingsLabel);
        drawings.setEditable(false);
        row4.add(drawings);
        row4.add(yearsLabel);
        years.setEditable(false);
        row4.add(years);
        add(row4);
 
        setVisible(true);
 
    }
 
    public static void main (String[] arguments){
        LottoGame frame = new LottoGame();
    }
}
 

