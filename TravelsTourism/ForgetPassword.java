package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {
    JTextField fusertf,fnametf,fsecuritytf,fanswertf,fpasswordtf;
    JButton fsearch,fretrive,fback;

    public ForgetPassword(){


        setBounds(260,180,850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(562,50,250,250);
        add(image);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,510,280);
        p1.setBackground(new Color(133,193,233));
        add(p1);

        JLabel fuser = new JLabel("UserName");
        fuser.setBounds(40,20,100,25);
        fuser.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(fuser);
        fusertf = new JTextField();
        fusertf.setBounds(200,20,200,25);
        fusertf.setBorder(BorderFactory.createEmptyBorder());
        fusertf. setFont(new Font("SAN_SERIF",Font.BOLD,13));
        p1.add(fusertf);

        fsearch = new JButton("Search");
        fsearch.setBounds(410,20,80,25);
        fsearch.setFont(new Font("Raleway",Font.PLAIN,15));
        fsearch.setBackground(Color.BLACK);
        fsearch.setForeground(Color.WHITE);
        fsearch.setBorder(new LineBorder(Color.WHITE));
        fsearch.addActionListener(this);
        p1.add(fsearch);



        JLabel fname = new JLabel("Name");
        fname.setBounds(40,60,100,25);
        fname.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(fname);
        fnametf = new JTextField();
        fnametf.setBounds(200,60,200,25);
        fnametf.setBorder(BorderFactory.createEmptyBorder());
        fnametf. setFont(new Font("SAN_SERIF",Font.BOLD,13));
        p1.add(fnametf);

        JLabel fsecutity = new JLabel("Security Question");
        fsecutity.setBounds(40,100,150,25);
        fsecutity.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(fsecutity);
        fsecuritytf = new JTextField();
        fsecuritytf.setBounds(200,100,200,25);
        fsecuritytf.setBorder(BorderFactory.createEmptyBorder());
        fsecuritytf. setFont(new Font("SAN_SERIF",Font.BOLD,13));
        p1.add(fsecuritytf);

        JLabel fanswer = new JLabel("Answer");
        fanswer.setBounds(40,140,100,25);
        fanswer.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(fanswer);
        fanswertf = new JTextField();
        fanswertf.setBounds(200,140,200,25);
        fanswertf.setBorder(BorderFactory.createEmptyBorder());
        fanswertf. setFont(new Font("SAN_SERIF",Font.BOLD,13));
        p1.add(fanswertf);

        fretrive = new JButton("Retrive");
        fretrive.setBounds(410,140,80,25);
        fretrive.setFont(new Font("Raleway",Font.PLAIN,15));
        fretrive.setBackground(Color.BLACK);
        fretrive.setForeground(Color.WHITE);
        fretrive.setBorder(new LineBorder(Color.WHITE));
        fretrive.addActionListener(this);
        p1.add(fretrive);

        JLabel fpass = new JLabel("Password");
        fpass.setBounds(40,180,100,25);
        fpass.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        p1.add(fpass);
        fpasswordtf = new JTextField();
        fpasswordtf.setBounds(200,180,200,25);
        fpasswordtf.setBorder(BorderFactory.createEmptyBorder());
        fpasswordtf. setFont(new Font("SAN_SERIF",Font.BOLD,13));
        p1.add(fpasswordtf);

        fback = new JButton("Back");
        fback.setBounds(127,228,80,25);
        fback.setFont(new Font("Raleway",Font.PLAIN,15));
        fback.setBackground(Color.BLACK);
        fback.setForeground(Color.WHITE);
        fback.setBorder(new LineBorder(Color.WHITE));
        fback.addActionListener(this);
        p1.add(fback);






      //  getContentPane().setBackground(new Color(255,255,102));
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==fsearch){
            try {
                String query = "Select * from account where username ='"+fusertf.getText()+"'    ";
                Conn c= new Conn();
                ResultSet rs= c.s.executeQuery(query);
                while (rs.next()){
                    fnametf.setText(rs.getString("name"));
                    fsecuritytf.setText(rs.getString("security"));

                }
            }catch (Exception ae){
                System.out.println(ae);
            }


        }else if (e.getSource()==fretrive){

            try {
                String query = "Select * from account where username ='"+fusertf.getText()+"' AND answer ='"+fanswertf.getText()+"'    ";
                Conn c= new Conn();
                ResultSet rs= c.s.executeQuery(query);
                while (rs.next()){
                    fpasswordtf.setText(rs.getString("password"));

                }
            }catch (Exception ae){
                System.out.println(ae);
            }

        }else if (e.getSource()==fback){
            setVisible(false);
            new Login().setVisible(true);

        }

    }

    public static void main(String[] args) {
        new ForgetPassword();
    }

}
