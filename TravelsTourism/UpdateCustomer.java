package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener {

    JLabel levelusername ,labelname;

    JTextField anumtf,countrytf,addresstf,emailtf,phonetf,gendertf,cidtf;

    JButton add,back;
    String username;
    String idname[]={"Passport","Aadhar card","VoterId ","Pan Card","Other"};
    public UpdateCustomer(String username){
        this.username=username;
        setBounds(230,100,900,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text = new JLabel("Update Customer Details");
        text.setBounds(50,0,400,30);
        text.setFont(new Font("Raleway",Font.BOLD,20));
        text.setForeground(Color.black);
        add(text);

        JLabel ausername = new JLabel("UserName");
        ausername.setBounds(40,50,100,30);
        ausername.setFont(new Font("Raleway",Font.BOLD,16));
        ausername.setForeground(Color.BLACK);
        add(ausername);

        levelusername = new JLabel();
        levelusername.setBounds(200,50,100,30);
        levelusername.setFont(new Font("Raleway",Font.BOLD,16));
        levelusername.setForeground(Color.BLACK);
        add(levelusername);

        JLabel aid = new JLabel("ID");
        aid.setBounds(40,90,100,30);
        aid.setFont(new Font("Raleway",Font.BOLD,16));
        aid.setForeground(Color.BLACK);
        add(aid);
        cidtf = new JTextField();
        cidtf.setBounds(200,90,150,25);
        add(cidtf);





        JLabel anumber = new JLabel("ID Number");
        anumber.setBounds(40,130,100,30);
        anumber.setFont(new Font("Raleway",Font.BOLD,16));
        anumber.setForeground(Color.BLACK);
        add(anumber);

        anumtf = new JTextField();
        anumtf.setBounds(200,130,150,25);
        add(anumtf);

        JLabel aname = new JLabel("Name");
        aname.setBounds(40,170,100,30);
        aname.setFont(new Font("Raleway",Font.BOLD,16));
        aname.setForeground(Color.BLACK);
        add(aname);

        labelname = new JLabel();
        labelname.setBounds(200,170,200,30);
        labelname.setFont(new Font("Raleway",Font.BOLD,13));
        add(labelname);

        JLabel agender = new JLabel("Gender");
        agender.setBounds(40,210,100,30);
        agender.setFont(new Font("Raleway",Font.BOLD,16));
        agender.setForeground(Color.BLACK);
        add(agender);

        gendertf = new JTextField();
        gendertf.setBounds(200,210,150,25);
        add(gendertf);

        JLabel country = new JLabel("Country");
        country.setBounds(40,250,100,30);
        country.setFont(new Font("Raleway",Font.BOLD,16));
        country.setForeground(Color.BLACK);
        add(country);

        countrytf = new JTextField();
        countrytf.setBounds(200,250,150,25);
        add(countrytf);

        JLabel address = new JLabel("Address");
        address.setBounds(40,290,100,30);
        address.setFont(new Font("Raleway",Font.BOLD,16));
        address.setForeground(Color.BLACK);
        add(address);

        addresstf = new JTextField();
        addresstf.setBounds(200,290,150,25);
        add(addresstf);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(40,330,100,30);
        phone.setFont(new Font("Raleway",Font.BOLD,16));
        phone.setForeground(Color.BLACK);
        add(phone);

        phonetf = new JTextField();
        phonetf.setBounds(200,330,150,25);
        add(phonetf);

        JLabel email = new JLabel("Email");
        email.setBounds(40,370,100,30);
        email.setFont(new Font("Raleway",Font.BOLD,16));
        email.setForeground(Color.BLACK);
        add(email);

        emailtf = new JTextField();
        emailtf.setBounds(200,370,150,25);
        add(emailtf);

        add = new JButton(" Update");
        add.setBounds(110,430,90,30);
        add.setFont(new Font("Raleway",Font.PLAIN,15));
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBorder(new LineBorder(Color.WHITE));
        add.addActionListener(this);
        add(add);

        back = new JButton(" Back");
        back.setBounds(240,430,90,30);
        back.setFont(new Font("Raleway",Font.PLAIN,15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(Color.WHITE));
        back.addActionListener(this);
        add(back);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(470,70,300,400);

        add(image);

        try {

            Conn c= new Conn();
            ResultSet rs = c.s.executeQuery("Select * from customer where username ='"+username+"'");
            if (rs.next()){

                levelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                cidtf.setText(rs.getString("id"));
                anumtf.setText(rs.getString("number"));
                gendertf.setText(rs.getString("Gender"));
                countrytf.setText(rs.getString("Country"));
                addresstf.setText(rs.getString("Address"));
                phonetf.setText(rs.getString("phone"));
                emailtf.setText(rs.getString("Email"));

            }

        }catch (Exception e){

            System.out.println(e);
        }

        getContentPane().setBackground(new Color(255,255,102));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource()==add){
            String username = levelusername.getText();
            String id = cidtf.getText();
            String number = anumtf.getText();
            String name = labelname.getText();
            String gender = gendertf.getText();
            String country = countrytf.getText();
            String address = addresstf.getText();
            String phone = phonetf.getText();
            String email = emailtf.getText();


            try {
                Conn c = new Conn();
                String query ="update customer set username ='"+username+"',id ='"+id+"',number='"+number+"',name ='"+name+"',gender ='"+gender+"',country ='"+country+"',address='"+address+"',phone ='"+phone+"',email='"+email+"'  where username='"+username+"' ";
                c.s.executeUpdate(query);


                JOptionPane.showMessageDialog(null,"Customer Details update Successfully");
                setVisible(false);
                new DashBoard(username).setVisible(true);

            }catch (Exception e){

                System.out.println(e);
            }


        }else {
            setVisible(false);
            new DashBoard(username).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new UpdateCustomer("");
    }
}
