package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class DeleteDetail extends JFrame implements ActionListener {

    String username;
    JLabel vname,vusername,vid,vnumber,vgender,vcountry,vaddress,vphone,vemail;
    JButton back,delete;
    public DeleteDetail(String username){
        this.username=username;

        setBounds(290,110,780,510);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel user = new JLabel("Username");
        user.setBounds(70,30,100,30);
        user.setFont(new Font("Raleway",Font.BOLD,16));
        user.setForeground(Color.black);
        add(user);

        vusername = new JLabel();
        vusername.setBounds(220,30,100,30);
        vusername.setFont(new Font("Raleway",Font.PLAIN,16));
        vusername.setForeground(Color.black);
        add(vusername);

        JLabel name = new JLabel("Name");
        name.setBounds(70,80,100,30);
        name.setFont(new Font("Raleway",Font.BOLD,16));
        name.setForeground(Color.black);
        add(name);

        vname= new JLabel();
        vname.setBounds(220,80,280,30);
        vname.setFont(new Font("Raleway",Font.PLAIN,16));
        vname.setForeground(Color.black);
        add(vname);

        JLabel idprv = new JLabel("ID");
        idprv.setBounds(70,130,100,30);
        idprv.setFont(new Font("Raleway",Font.BOLD,16));
        idprv.setForeground(Color.black);
        add(idprv);

        vid = new JLabel();
        vid.setBounds(220,130,100,30);
        vid.setFont(new Font("Raleway",Font.PLAIN,16));
        vid.setForeground(Color.black);
        add(vid);

        JLabel num = new JLabel("Number");
        num.setBounds(70,180,100,30);
        num.setFont(new Font("Raleway",Font.BOLD,16));
        num.setForeground(Color.black);
        add(num);

        vnumber = new JLabel();
        vnumber.setBounds(220,180,150,30);
        vnumber.setFont(new Font("Raleway",Font.PLAIN,16));
        vnumber.setForeground(Color.black);
        add(vnumber);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(70,230,100,30);
        gender.setFont(new Font("Raleway",Font.BOLD,16));
        gender.setForeground(Color.black);
        add(gender);

        vgender = new JLabel();
        vgender.setBounds(220,230,100,30);
        vgender.setFont(new Font("Raleway",Font.PLAIN,16));
        vgender.setForeground(Color.black);
        add(vgender);

        JLabel cout = new JLabel("Country");
        cout.setBounds(380,30,100,30);
        cout.setFont(new Font("Raleway",Font.BOLD,16));
        cout.setForeground(Color.black);
        add(cout);//cout = country

        vcountry = new JLabel();
        vcountry.setBounds(530,30,100,30);
        vcountry.setFont(new Font("Raleway",Font.PLAIN,16));
        vgender.setForeground(Color.black);
        add(vcountry);

        JLabel addr = new JLabel("Address");
        addr.setBounds(380,80,100,30);
        addr.setFont(new Font("Raleway",Font.BOLD,16));
        addr.setForeground(Color.black);
        add(addr);

        vaddress = new JLabel();
        vaddress.setBounds(530,80,100,30);
        vaddress.setFont(new Font("Raleway",Font.PLAIN,16));
        vaddress.setForeground(Color.black);
        add(vaddress);

        JLabel phon = new JLabel("Phone");
        phon.setBounds(380  ,130,100,30);
        phon.setFont(new Font("Raleway",Font.BOLD,16));
        phon.setForeground(Color.black);
        add(phon);

        vphone = new JLabel();
        vphone.setBounds(530,130,100,30);
        vphone.setFont(new Font("Raleway",Font.PLAIN,16));
        vphone.setForeground(Color.black);
        add(vphone);

        JLabel email = new JLabel("Email");
        email.setBounds(380,180,100,30);
        email.setFont(new Font("Raleway",Font.BOLD,16));
        email.setForeground(Color.black);
        add(email);

        vemail = new JLabel();
        vemail.setBounds(530,180,230,30);
        vemail.setFont(new Font("Raleway",Font.PLAIN,16));
        vemail.setForeground(Color.black);
        add(vemail);

        delete = new JButton("Delete");
        delete.setBounds(530,297,100,30);
        delete.setFont(new Font("Raleway",Font.PLAIN,15));
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.setBorder(new LineBorder(Color.WHITE));
        delete.addActionListener(this);
        add(delete);

        back = new JButton("Back");
        back.setBounds(650,297,100,30);
        back.setFont(new Font("Raleway",Font.PLAIN,15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(Color.WHITE));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(780,180,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,350,780,180);
        add(image);


        try {

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from customer where username='"+username+"'");
            if (rs.next()){
                vusername.setText(rs.getString("username"));
                vname.setText(rs.getString("Name"));
                vid.setText(rs.getString("Id"));
                vnumber.setText(rs.getString("number"));
                vgender.setText(rs.getString("Gender"));
                vcountry.setText(rs.getString("Country"));
                vaddress.setText(rs.getString("Address"));
                vphone.setText(rs.getString("phone"));
                vemail.setText(rs.getString("Email"));

            }
        }catch (Exception e){
            System.out.println(e);
        }





        setUndecorated(true);
        getContentPane().setBackground(new Color(255,255,102));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==delete){
            try {
                Conn c = new Conn();
                c.s.executeUpdate("delete from account where username ='"+username+"'");
                c.s.executeUpdate("delete from customer where username ='"+username+"'");
                c.s.executeUpdate("delete from bookpackage where username ='"+username+"'");
                c.s.executeUpdate("delete from hotel where username ='"+username+"'");

                JOptionPane.showMessageDialog(null,"Your Data Deleted Sucessfully");
              //  System.exit(0);
                    setVisible(false);
                    new Login().setVisible(true);
            }catch (Exception e){
                System.out.println(e);
            }
        } else if (ae.getSource()==back) {
            setVisible(false);
            new DashBoard(username).setVisible(true);

        }

    }

    public static void main(String[] args) {
        new DeleteDetail("");
    }
}
