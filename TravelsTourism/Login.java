package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
        JTextField lusertf ;
        JButton login,signup,forgetpass;
            JPasswordField lpasstf;

    public Login(){
        setSize(900,400);
        setLocation(230,160);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0,0,400,400);
        // p1.setLayout(null);
        add(p1);




        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,360,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,360,400,400);
        p1.add(image);


        JPanel p2 = new JPanel();
        p2.setBounds(400,35,450,300);
        p2.setBackground(new Color(131,193,234));
        p2.setLayout(null);
        add(p2);
        JLabel lusername = new JLabel("UserName");
        lusername.setBounds(60,30,200,20);
        lusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lusername);
        lusertf = new JTextField();
        lusertf.setBounds(60,60,270,30);
        lusertf.setFont(new Font("Raleway",Font.BOLD,14));
        lusertf.setBorder(BorderFactory.createEmptyBorder());
        p2.add(lusertf);

        JLabel lpassword = new JLabel("Password");
        lpassword.setBounds(60,100,200,20);
        lpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lpassword);
        lpasstf = new JPasswordField();
        lpasstf.setBounds(60,135,270,30);
        lpasstf.setFont(new Font("Raleway",Font.BOLD,14));
        lpasstf.setBorder(BorderFactory.createEmptyBorder());
        p2.add(lpasstf);

        login = new JButton("Login");
        login.setBounds(60,190,100,30);
        login.setFont(new Font("Raleway",Font.PLAIN,15));
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(Color.WHITE));
        login.addActionListener(this);
        p2.add(login);

        signup = new JButton("SignUp");
        signup.setBounds(210,190,100,30);
        signup.setFont(new Font("Raleway",Font.PLAIN,15));
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(Color.WHITE));
        signup.addActionListener(this);
        p2.add(signup);

        forgetpass = new JButton("Forget Password");
        forgetpass.setBounds(110,235,150,30);
        forgetpass.setFont(new Font("Raleway",Font.PLAIN,15));
        forgetpass.setBackground(Color.BLACK);
        forgetpass.setForeground(Color.WHITE);
        forgetpass.setBorder(new LineBorder(Color.WHITE));
        forgetpass.addActionListener(this);
        p2.add(forgetpass);
        setVisible(true);

       // JLabel text = new JLabel("Trouble in login.....");
        //text.setFont(new Font("Raleway",Font.BOLD,15));
        //text.setForeground(Color.red);
        //text.setBounds(275,235,200,30);
       // p2.add(text);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==signup){
            setVisible(false);
            new SignUp().setVisible(true);
        }else if (e.getSource()==forgetpass){
            setVisible(false);
            new ForgetPassword().setVisible(true);
        }else  if (e.getSource()==login){

            try {
                String username = lusertf.getText();
                String password = lpasstf.getText();
                String query ="Select * from account where username ='"+username+"' AND password ='"+password+"'";
                Conn c = new Conn();
              ResultSet rs = c.s.executeQuery(query);
              if (rs.next()){ // use if because i find 1 row so i use if
                setVisible(false);
                new  Loading(username).setVisible(true);
              }
              else {
                  JOptionPane.showMessageDialog(null,"Incorrect UserName and Password");
              }

            }catch (Exception ae){
                System.out.println(ae);

            }
        }
    }

    public static void main(String[] args) {

        Login l = new Login();
    }
}
