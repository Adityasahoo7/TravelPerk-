package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewBookedHotel extends JFrame implements ActionListener {

    String username;
    JLabel vname,vusername,vpackage,vtotalperson,vid,vnumber,vaddress,vphone,vtotalprice,vtotaldays,vacinclude,vfoodinclude;
    JButton back;
    public ViewBookedHotel(String username){
        this.username=username;

        setBounds(180,100,1000,525);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setBounds(55,30,400,40);
        text.setFont(new Font("Raleway",Font.PLAIN,23));
        add(text);

        JLabel user = new JLabel("Username");
        user.setBounds(70,80,100,30);
        user.setFont(new Font("Raleway",Font.BOLD,16));
        user.setForeground(Color.black);
        add(user);

        vusername = new JLabel();
        vusername.setBounds(220,80,100,30);
        vusername.setFont(new Font("Raleway",Font.PLAIN,16));
        vusername.setForeground(Color.black);
        add(vusername);



        JLabel idprv = new JLabel("Hotel Name");
        idprv.setBounds(70,130,100,30);
        idprv.setFont(new Font("Raleway",Font.BOLD,16));
        idprv.setForeground(Color.black);
        add(idprv);

        vpackage = new JLabel();
        vpackage.setBounds(220,130,150,30);
        vpackage.setFont(new Font("Raleway",Font.PLAIN,16));
        vpackage.setForeground(Color.black);
        add(vpackage);

        JLabel num = new JLabel("Total Person");
        num.setBounds(70,180,160,30);
        num.setFont(new Font("Raleway",Font.BOLD,16));
        num.setForeground(Color.black);
        add(num);

        vtotalperson = new JLabel();
        vtotalperson.setBounds(220,180,150,30);
        vtotalperson.setFont(new Font("Raleway",Font.PLAIN,16));
        vtotalperson.setForeground(Color.black);
        add(vtotalperson);

        JLabel days = new JLabel("Total Days:");
        days.setBounds(70,225,160,30);
        days.setFont(new Font("Raleway",Font.BOLD,16));
        days.setForeground(Color.black);
        add(days);

        vtotaldays = new JLabel();
        vtotaldays.setBounds(220,225,150,30);
        vtotaldays.setFont(new Font("Raleway",Font.PLAIN,16));
        vtotaldays.setForeground(Color.black);
        add(vtotaldays);

        JLabel ac = new JLabel("AC/Non-AC:");
        ac.setBounds(70,270,160,30);
        ac.setFont(new Font("Raleway",Font.BOLD,16));
        ac.setForeground(Color.black);
        add(ac);

        vacinclude = new JLabel();
        vacinclude.setBounds(220,270,150,30);
        vacinclude.setFont(new Font("Raleway",Font.PLAIN,16));
        vacinclude.setForeground(Color.black);
        add(vacinclude);

        JLabel food = new JLabel("Food Include:");
        food.setBounds(70,310,160,30);
        food.setFont(new Font("Raleway",Font.BOLD,16));
        food.setForeground(Color.black);
        add(food);

        vfoodinclude = new JLabel();
        vfoodinclude.setBounds(220,310,150,30);
        vfoodinclude.setFont(new Font("Raleway",Font.PLAIN,16));
        vfoodinclude.setForeground(Color.black);
        add(vfoodinclude);

        JLabel gender = new JLabel("ID");
        gender.setBounds(70,355,100,30);
        gender.setFont(new Font("Raleway",Font.BOLD,16));
        gender.setForeground(Color.black);
        add(gender);

        vid = new JLabel();
        vid.setBounds(220,355,100,30);
        vid.setFont(new Font("Raleway",Font.PLAIN,16));
        vid.setForeground(Color.black);
        add(vid);

        JLabel cout = new JLabel("Number");
        cout.setBounds(70,400,100,30);
        cout.setFont(new Font("Raleway",Font.BOLD,16));
        cout.setForeground(Color.black);
        add(cout);//cout = country

        vnumber = new JLabel();
        vnumber.setBounds(220,400,160,30);
        vnumber.setFont(new Font("Raleway",Font.PLAIN,16));
        vnumber.setForeground(Color.black);
        add(vnumber);


        JLabel addr = new JLabel("Phone");
        addr.setBounds(70,445,100,30);
        addr.setFont(new Font("Raleway",Font.BOLD,16));
        addr.setForeground(Color.black);
        add(addr);

        vphone = new JLabel();
        vphone.setBounds(220,445,100,30);
        vphone.setFont(new Font("Raleway",Font.PLAIN,16));
        vphone.setForeground(Color.black);
        add(vphone);

        JLabel phon = new JLabel("Total Price");
        phon.setBounds(70  ,490,100,30);
        phon.setFont(new Font("Raleway",Font.BOLD,16));
        phon.setForeground(Color.black);
        add(phon);

        vtotalprice = new JLabel();
        vtotalprice.setBounds(220,490,100,30);
        vtotalprice.setFont(new Font("Raleway",Font.PLAIN,16));
        vtotalprice.setForeground(Color.black);
        add(vtotalprice);



        back = new JButton("Back");
        back.setBounds(315,490,100,30);
        back.setFont(new Font("Raleway",Font.PLAIN,15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(Color.WHITE));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(560,485,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(445,40,560,485);
        add(image);


        try {

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from hotel where username='"+username+"'");
            if (rs.next()){
                vusername.setText(rs.getString("username"));
                vpackage.setText(rs.getString("hotelname"));
                vtotalperson.setText(rs.getString("person"));
                vtotaldays.setText(rs.getString("days"));
                vacinclude.setText(rs.getString("ac"));
                vfoodinclude.setText(rs.getString("Food"));
                vid.setText(rs.getString("Id"));
                vnumber.setText(rs.getString("IdNumber"));
                vphone.setText(rs.getString("Phone"));
                vtotalprice.setText(rs.getString("totalprice"));
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
        if (ae.getSource()==back){
            setVisible(false);
            new DashBoard(username).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new ViewBookedHotel("");
    }
}
