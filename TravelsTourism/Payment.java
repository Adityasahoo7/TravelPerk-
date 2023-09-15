package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener {
    String username;
    JButton pay,back;
    public Payment(String username){
        this.username=username;
        setBounds(280,50,800,600);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);

        pay = new JButton("Pay");
        pay.setBounds(520,500,100,30);
        pay.setFont(new Font("Raleway",Font.PLAIN,15));
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.setBorder(new LineBorder(Color.WHITE));
        pay.addActionListener(this);
        add(pay);

        back = new JButton("Back");
        back.setBounds(650,500,100,30);
        back.setFont(new Font("Raleway",Font.PLAIN,15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(Color.WHITE));
        back.addActionListener(this);
        add(back);



        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==pay){
            setVisible(false);
            new Paytm(username).setVisible(true);
        }else if (ae.getSource()==back){
            setVisible(false);
            new DashBoard(username).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Payment("");
    }
}
