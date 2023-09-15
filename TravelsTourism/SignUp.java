package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
    JTextField susertf,nametf,answertf ;
    JButton create ,back;
    JPasswordField passwordtf;
    Choice security;

    public SignUp(){
        setBounds(250,160,900,350);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);

        JLabel suser = new JLabel("UserName");
        suser.setBounds(50,20,100,25);
        suser.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(suser);

        susertf = new JTextField();
        susertf.setBounds(200,20,200,25);
        susertf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(susertf);

        JLabel sname = new JLabel("Name");
        sname.setBounds(50,60,100,25);
        sname.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(sname);

        nametf = new JTextField();
        nametf.setBounds(200,60,200,25);
        nametf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(nametf);

        JLabel spass = new JLabel("Password");
        spass.setBounds(50,100,100,25);
        spass.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(spass);

        passwordtf = new JPasswordField();
        passwordtf.setBounds(200,100,200,25);
        passwordtf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(passwordtf);

        JLabel ssecurity = new JLabel("Security Question");
        ssecurity.setBounds(50,140,140,25);
        ssecurity.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(ssecurity);

         security = new Choice();
        security.add("Your favorite game ");
        security.add("Your childhood friend");
        security.add("Your lucky number");
        security.add("Your favorite cricketer");
        security.setBounds(200,140,200,25);
        p1.add(security);

        JLabel secans = new JLabel("Answer");
        secans.setBounds(50,180,100,25);
        secans.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(secans);

        answertf = new JTextField();
        answertf.setBounds(200,180, 200,25);
        answertf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(answertf);

        create = new JButton("Create");
        create.setBounds(80,235,100,30);
        create.setFont(new Font("Raleway",Font.PLAIN,15));
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBorder(new LineBorder(Color.WHITE));
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBounds(220,235,100,30);
        back.setFont(new Font("Raleway",Font.PLAIN,15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(Color.WHITE));
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.jpe"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,40,250,250);
        add(image);




        getContentPane().setBackground(new Color(255,255,102));
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){


        if (ae.getSource()==create){
            String username = susertf.getText();
            String name = nametf.getText();
            String password = passwordtf.getText();
            String question = security.getSelectedItem();
            String answer = answertf.getText();
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"' ,'"+answer+"' )";
            try {
                    Conn conn = new Conn();
                    conn.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Account Created Successfully");
                    setVisible(false);
                    new Login().setVisible(true);
            }catch (Exception e){
                System.out.println(e);
            }


        }else  if (ae.getSource()==back){

            setVisible(false);
            new  Login().setVisible(true);

        }

    }

    public static void main(String[] args) {
        SignUp s= new SignUp();
    }

}
