package myPage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class MsgeBox {
   public void messageBox(Object obj, String message) {
      JOptionPane.showMessageDialog(null, message);
   }
}
class Info_delete{
MsgeBox msgbox = new MsgeBox();
Statement stmt = null;
ResultSet rs = null;
String url ="jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1";
String sql = null;
String sql2 = null;
Properties info = null;
Connection cnn = null;
String m_id="admin123";//지금은 테스트용이라 아이디명을 입력했지만 로그인한 아이디로 대입해야합니다

int Info_Del(String m_id) {
   int result=0;
   this.m_id=m_id;
   try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      cnn = DriverManager.getConnection(url, "admin", "soldesk01TEAM)!");
      stmt = cnn.createStatement();
      
      sql = "delete from copy_member_signup where m_id='" + m_id + "'";
      rs = stmt.executeQuery(sql);
      
      sql="select *from copy_member_signup where m_id='"+m_id+"'";
      rs=stmt.executeQuery(sql);
      if (rs.next()==true) {
         result=0;
      }else {
         result=1;
      }
      
   } catch (Exception e) {
      System.out.println("문제발생");
      e.printStackTrace();
   }
   return result;
}
}

class Info_Change implements MouseListener {
   String m_id = "admin123";//지금은 테스트용이라 적어놨지만 null로 두고 로그인창에서 입력한 id를 받아와야합니다
   String m_pw, m_name, m_gender, m_email, m_phone;
   Date m_birth;

   JFrame frame;
   JPanel logpanel1;
   JPanel logpanel2;
   JPanel logpanel3;
   JPanel logpanel4;
   JTextField m_idTf, m_pwTf, m_nameTf, m_birthTf, m_genderTf, m_emailTf, m_phoneTf = null;
   JButton okBtn;
   MsgeBox msgbox = new MsgeBox();
   String a = null;
   Connection cnn = null;
   Statement stmt = null;
   ResultSet rs = null;
   Properties info = null;

   String url = "jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1";
   String sql = null;

   void myInfo(String m_id) {
      this.m_id = m_id;
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         cnn = DriverManager.getConnection(url, "admin", "soldesk01TEAM)!");
         stmt = cnn.createStatement();
         sql = "select * from copy_member_signup where m_id='" + m_id + "'";
         rs = stmt.executeQuery(sql);
         while (rs.next() == true) {
            m_pw = rs.getString(2);
            m_name = rs.getString(3);
            m_birth = rs.getDate(4);
            m_gender = rs.getString(5);
            m_email = rs.getString(6);
            m_phone = rs.getString(7);
            
         }
      } catch (Exception e) {
         System.out.println("문제발생");
         e.printStackTrace();
      }
      String birth=""+m_birth+"";
      frame = new JFrame("회원 수정");
      logpanel1 = new JPanel();
      logpanel2 = new JPanel(new GridLayout(7, 1));
      logpanel3 = new JPanel(new GridLayout(7, 1));
      logpanel4 = new JPanel();
      JLabel idLabel = new JLabel("아이디", JLabel.CENTER);
      JLabel pwLabel = new JLabel("비밀번호", JLabel.CENTER);
      JLabel nameLabel = new JLabel("이름", JLabel.CENTER);
      JLabel birthLabel = new JLabel("생일", JLabel.CENTER);
      JLabel genderLabel = new JLabel("성별", JLabel.CENTER);
      JLabel emailLabel = new JLabel("이메일", JLabel.CENTER);
      JLabel phoneLabel = new JLabel("연락처", JLabel.CENTER);
      logpanel2.add(idLabel);
      logpanel2.add(pwLabel);
      logpanel2.add(nameLabel);
      logpanel2.add(birthLabel);
      logpanel2.add(genderLabel);
      logpanel2.add(emailLabel);
      logpanel2.add(phoneLabel);

      m_idTf = new JTextField(20);
      m_idTf.setText(m_id);
      m_idTf.setEditable(false);
      m_pwTf = new JTextField(20);
      m_pwTf.setText(m_pw);
      m_nameTf = new JTextField(20);
      m_nameTf.setText(m_name);
      m_birthTf = new JTextField(20);
      m_birthTf.setText(birth);
      m_genderTf = new JTextField(20);
      m_genderTf.setText(m_gender);
      m_emailTf = new JTextField(20);
      m_emailTf.setText(m_email);
      m_phoneTf = new JTextField(20);
      m_phoneTf.setText(m_phone);
      logpanel3.add(m_idTf);
      logpanel3.add(m_pwTf);
      logpanel3.add(m_nameTf);
      logpanel3.add(m_birthTf);
      logpanel3.add(m_genderTf);
      logpanel3.add(m_emailTf);
      logpanel3.add(m_phoneTf);

      frame.add(logpanel1, BorderLayout.NORTH);
      frame.add(logpanel2, BorderLayout.WEST);
      frame.add(logpanel3, BorderLayout.CENTER);
      frame.add(logpanel4, BorderLayout.EAST);

      JPanel logPanel5 = new JPanel();
      JLabel askLabel = new JLabel("변경하시겠습니까?");
      okBtn = new JButton("확인");
      JButton cancleBtn = new JButton("취소");
      okBtn.addMouseListener(this);
      logPanel5.add(askLabel);
      logPanel5.add(okBtn);
      logPanel5.add(cancleBtn);
      frame.add(logPanel5, BorderLayout.SOUTH);

      cancleBtn.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
            frame.dispose();
            dbClose();
         }
      });
      frame.setBounds(450, 250, 480, 350);

      frame.setVisible(true);
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      try {
         if (e.getSource().equals(okBtn)) {
            if ((m_idTf.getText().isEmpty()) == true || (m_pwTf.getText().isEmpty()) == true
                  || (m_nameTf.getText().isEmpty()) || (m_birthTf.getText().isEmpty())
                  || (m_birthTf.getText().isEmpty()) || (m_genderTf.getText().isEmpty())
                  || (m_emailTf.getText().isEmpty()) || (m_phoneTf.getText().isEmpty())) {
               msgbox.messageBox(logpanel4, "비어있는 칸이 존재합니다.");
            } else {
               sql = "update copy_member_signup set m_pw='" + m_pwTf.getText() + "',m_name='" + m_nameTf.getText()
                     + "',m_birth='" + m_birthTf.getText() + "',m_gender='" + m_genderTf.getText()
                     + "',m_email='" + m_emailTf.getText() + "',m_phone='" + m_phoneTf.getText()
                     + "'where m_id='" + m_id + "'";
               stmt.executeUpdate(sql);
               msgbox.messageBox(logpanel4, "변경 되었습니다.");
               frame.dispose();
               dbClose();

            }

         }

      } catch (Exception ee) {
         ee.printStackTrace();
      }
   }

   @Override
   public void mousePressed(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   public void dbClose() {
      try {
         if (rs != null)
            rs.close();
         if (stmt != null)
            stmt.close();
         if (cnn != null)
            cnn.close();
      } catch (Exception e) {
         e.printStackTrace();

      }

   }
}

//class Lotto_Record extends JFrame {
//   String url = "jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1";
//   Connection conn = null;
//
//   Lotto_Record() {
//      Font fontl = new Font("D2Coding", Font.BOLD, 25);
//      Font fontb = new Font("D2Coding", Font.BOLD, 10);
//      setLayout(null);
//      setTitle("내 로또 기록");
//      JLabel jLabel = new JLabel("내 로또기록 열람하기");
//      jLabel.setBounds(295, 10, 250, 50);
//      jLabel.setFont(fontl);
//
//      JButton returnbutton = new JButton("되돌아가기");
//      returnbutton.addActionListener(new ActionListener() {
//
//         public void actionPerformed(ActionEvent e) {
//            new Team();
//            setVisible(false);
//         }
//      });
//
//      returnbutton.setFont(fontb);
//      returnbutton.setBounds(340, 250, 100, 50);
//      add(jLabel);
//
//      add(returnbutton);
//      setVisible(true);
//      setSize(800, 400);
//      try {
//         Class.forName("oracle.jdbc.driver.OracleDriver");
//         System.out.println("fine");
//         conn = DriverManager.getConnection(url, "admin", "soldesk01TEAM)!");
//         System.out.println("good");
//         String a = "select * from copy_lotto_record where m_id='admin123'";
//         PreparedStatement psmt = conn.prepareStatement(a);
//
//         ResultSet rs = psmt.executeQuery();
//
//         while (rs.next()) {
//            String m_id = rs.getString(1);
//            Date record_time = rs.getDate(2);
//            int num1 = rs.getInt(3);
//            int num2 = rs.getInt(4);
//            int num3 = rs.getInt(5);
//            int num4 = rs.getInt(6);
//            int num5 = rs.getInt(7);
//            int num6 = rs.getInt(8);
//            int bonus = rs.getInt(9);
//         }
//      } catch (Exception e1) {
//         e1.printStackTrace();
//      }
//   }
//}

class Myinfo extends JFrame {
   String url = "jdbc:oracle:thin:@dbsoldeskteam1_high?TNS_ADMIN=/ora/Wallet_DBSOLDESKTEAM1";
   Connection conn = null;

   Myinfo() {

      Font fontl = new Font("D2Coding", Font.BOLD, 25);// 로고폰트
      Font fontb = new Font("D2Coding", Font.BOLD, 13);// info_panel에있는얘들폰트
      Font fontr = new Font("D2Coding", Font.BOLD, 10);// 맨밑에 버튼폰트들
      setLayout(null);
      setTitle("내 정보");
      JPanel top_panel = new JPanel();
      top_panel.setBounds(50, 10, 380, 45);
      JLabel jLabel = new JLabel("내 정보 열람하기");
      top_panel.add(jLabel);
      top_panel.setBorder(new TitledBorder(new LineBorder(Color.lightGray, 3)));
      // 로고붙여놓은맨위판넬 테두리코드
      JPanel info_panel = new JPanel();
      JLabel profile_img = new JLabel();
      info_panel.add(profile_img);
      info_panel.setLayout(null);
      info_panel.setBounds(45, 70, 380, 180);
      info_panel.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY, 3)));
      // 정보출력하는판넬 테두리코드
      jLabel.setFont(fontl);
      JButton info_delete = new JButton("회원탈퇴");
      JButton info_changebutton = new JButton("회원정보수정");
      JButton returnbutton = new JButton("되돌아가기");

      JTextField tf_id = new JTextField();
      tf_id.setFont(fontb);
      tf_id.setBackground(Color.white);
      JLabel jl_id = new JLabel("아이디 : ");
      jl_id.setFont(fontb);
      JTextField tf_name = new JTextField();
      JLabel jl_name = new JLabel(" 이름   : ");
      jl_name.setFont(fontb);
      tf_name.setFont(fontb);
      tf_name.setBackground(Color.white);
      JTextField tf_birth = new JTextField();
      tf_birth.setFont(fontb);
      JLabel jl_birth = new JLabel(" 생일   : ");
      jl_birth.setFont(fontb);
      tf_birth.setBackground(Color.white);
      JTextField tf_gender = new JTextField();
      tf_gender.setFont(fontb);
      JLabel jl_gender = new JLabel(" 성별   : ");
      jl_gender.setFont(fontb);
      tf_gender.setBackground(Color.white);
      JTextField tf_email = new JTextField();
      tf_email.setFont(fontb);
      JLabel jl_email = new JLabel(" 이메일 : ");
      jl_email.setFont(fontb);
      tf_email.setBackground(Color.white);
      JTextField tf_phone = new JTextField();
      tf_phone.setFont(fontb);
      tf_phone.setBackground(Color.white);
      JLabel jl_phone = new JLabel(" 연락처 : ");
      jl_phone.setFont(fontb);
      info_panel.add(jl_id);
      info_panel.add(tf_id);
      info_panel.add(jl_name);
      info_panel.add(tf_name);
      info_panel.add(jl_birth);
      info_panel.add(tf_birth);
      info_panel.add(jl_gender);
      info_panel.add(tf_gender);
      info_panel.add(jl_email);
      info_panel.add(tf_email);
      info_panel.add(jl_phone);
      info_panel.add(tf_phone);
      jl_id.setBounds(138, 15, 80, 15);
      jl_name.setBounds(130, 35, 80, 15);
      jl_birth.setBounds(130, 55, 80, 15);
      jl_gender.setBounds(130, 75, 80, 15);
      jl_email.setBounds(130, 95, 80, 15);
      jl_phone.setBounds(130, 115, 80, 15);
      tf_id.setBounds(220, 15, 130, 15);
      tf_name.setBounds(220, 35, 130, 15);
      tf_birth.setBounds(220, 55, 130, 15);
      tf_gender.setBounds(220, 75, 130, 15);
      tf_email.setBounds(220, 95, 130, 15);
      tf_phone.setBounds(220, 115, 130, 15);
      info_panel.add(info_delete);
      info_panel.add(info_changebutton);
      info_panel.add(returnbutton);
      info_delete.setFont(fontr);
      info_delete.setBounds(18, 142, 100, 25);
      returnbutton.setBounds(260, 142, 90, 25);
      info_changebutton.setFont(fontr);
      info_changebutton.setBounds(140, 142, 100, 25);
      
      info_delete.addActionListener(new ActionListener() {
   
         public void actionPerformed(ActionEvent e) {
            Info_delete info_delete=new Info_delete();
            MsgeBox msgeBox = new MsgeBox();
            int result=JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까?","회원삭제",JOptionPane.OK_CANCEL_OPTION);
            if (result==0) {
               int i=0;
               i=info_delete.Info_Del(tf_id.getText());
               if (i==0) {
                  msgeBox.messageBox(this, "취소 하셨습니다!");
               }else {
                  
                  msgeBox.messageBox(this, "탈퇴 성공!");
               }
            }
                  
               
               
               
            
            
         }
      });

      info_changebutton.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {

            Info_Change info_Change = new Info_Change();
            info_Change.myInfo(tf_id.getText());

         }
      });

      returnbutton.addActionListener(new ActionListener() {
         // 되돌아가기버튼누르면 메인화면으로 돌아감
         public void actionPerformed(ActionEvent e) {
            new MyPage();
            Info_Change info_Change = new Info_Change();
            info_Change.dbClose();
            setVisible(false);
         }
      });
      returnbutton.setFont(fontr);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(top_panel);
      add(info_panel);

      setLocationRelativeTo(null);
      setVisible(true);
      setSize(480, 350);
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("fine");
         conn = DriverManager.getConnection(url, "admin", "soldesk01TEAM)!");
         System.out.println("good");
         String a = "select m_id,null,m_name,m_birth,m_gender,m_email,m_phone "
               + "from copy_member_signup where m_id='admin123'";
         // 지금은 admin123 실험용 아이디로 검색을 했지만,
         // 회원가입한 아이디로 따로 변수를 주어야함
         // ex)where m_id='"+m_id+"'";
         PreparedStatement psmt = conn.prepareStatement(a);
         ResultSet rs = psmt.executeQuery();
         while (rs.next()) {
            String m_id = rs.getString(1);
            String m_name = rs.getString(3);
            Date m_birth = rs.getDate(4);
            String m_gender = rs.getString(5);
            String m_email = rs.getString(6);
            String m_phone = rs.getString(7);
            String birth = "" + m_birth + "";
            tf_id.setText(m_id);
            tf_name.setText(m_name);
            tf_birth.setText(birth);
            tf_gender.setText(m_gender);

            tf_email.setText(m_email);
            tf_phone.setText(m_phone);
            tf_id.setEditable(false);
            tf_name.setEditable(false);
            tf_birth.setEditable(false);
            tf_gender.setEditable(false);
            tf_email.setEditable(false);
            tf_phone.setEditable(false);
            // 만약에 성별값이 M이면 남자이미지를 프로필사진으로 띄울생각으로 넣었습니다.
            if (m_gender.equals("M")) {
               ImageIcon icon_M = new ImageIcon("C://Users//USER//Desktop/man.jpg");
               profile_img.setIcon(icon_M);
               profile_img.setBounds(20, 15, 90, 120);
               break;
            } else if (m_gender.equals("F")) {// 여자일경우 여자사진
               ImageIcon icon_F = new ImageIcon("C://Users//USER//Desktop/woman.jpeg");
               profile_img.setIcon(icon_F);
               profile_img.setBounds(20, 15, 90, 120);
               break;
            }

         }

      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}

public class MyPage extends JFrame {

   public MyPage() {// 여기가 마이페이지 메인화면입니다
      Font fontl = new Font("D2Coding", Font.BOLD, 25);// 로고폰트지정입니다
      Font fontb = new Font("D2Coding", Font.BOLD, 15);// 버튼폰트지정입니다
      setTitle("팀프로젝트");
      setLayout(null);
      JLabel jl_pagelogo = new JLabel("마이페이지");
      jl_pagelogo.setOpaque(true);
      jl_pagelogo.setFont(fontl);
      jl_pagelogo.setBounds(130, 8, 130, 50);
      jl_pagelogo.setForeground(Color.black);

      JButton jb_adminpage = new JButton("관리자페이지");
      jb_adminpage.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
//            if (로그인한아이디관리자가 아닌경우) {
//               JOptionPane.showMessageDialog(null, "관리자가 아닙니다!", "관리자전용페이지", JOptionPane.ERROR_MESSAGE);
               
//            new adminpage();
//            setVisible(false);
            
            
         }
      });
      jb_adminpage.setOpaque(true);
      jb_adminpage.setFont(fontb);
      jb_adminpage.setBounds(100, 130, 180, 50);
      jb_adminpage.setForeground(Color.black);
      JButton jb_myinfo = new JButton("내 정보 보기");

      jb_myinfo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new Myinfo();
            setVisible(false);
         }
      });

      jb_myinfo.setOpaque(true);
      jb_myinfo.setFont(fontb);
      jb_myinfo.setBounds(100, 190, 180, 50);
      jb_myinfo.setForeground(Color.black);

      add(jl_pagelogo);
      add(jb_adminpage);
      add(jb_myinfo);
      setLocationRelativeTo(null);
      setVisible(true);
      setSize(400, 400);
   }
   
   
}