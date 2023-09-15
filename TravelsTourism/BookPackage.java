package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {

    JButton checkpri,bookpkg,back;
    JComboBox selectpackage;
    String spkgname[]={"Gold Package","Silver Package","Normal Package"};
    JTextField totalpsntf;
    JLabel buser,bid,bnumber,bphone ,btprice;
    String username;

    public BookPackage(String username){
        this.username=username;
        setBounds(250,150,900,420);
        setLayout(null);
        //setBackground(new Color(255,255,102));
       // setBackground(Color.blue);
        JLabel book = new JLabel("BOOK PACKAGE");
        book.setBounds(70,30,200,30);
        book.setFont(new Font("Raleway",Font.PLAIN,22));
        book.setForeground(Color.black);
        add(book);

        JLabel select = new JLabel("UserName");
        select.setBounds(30,70,200,30);
        select.setFont(new Font("Raleway",Font.PLAIN,16));
        select.setForeground(Color.black);
        add(select);
        buser=new JLabel();
        buser.setBounds(230,70,200,30);
        buser.setForeground(Color.black);
        buser.setFont(new Font("Raleway",Font.BOLD,17));
        add(buser);


        JLabel pack = new JLabel("Select Package");
        pack.setBounds(30,105,200,30);
        pack.setFont(new Font("Raleway",Font.PLAIN,16));
        pack.setForeground(Color.black);
        add(pack);

        selectpackage = new JComboBox<>(spkgname);
        selectpackage.setBounds(230,113,140,20);
        selectpackage.setBackground(new Color(255,255,102));
        add(selectpackage);

        JLabel person = new JLabel("Total Person ");
        person.setBounds(30,140,200,30);
        person.setFont(new Font("Raleway",Font.PLAIN,16));
        person.setForeground(Color.black);
        add(person);
        totalpsntf=new JTextField();
        totalpsntf.setBounds(230,145,140,25);
        add(totalpsntf);

        JLabel id = new JLabel("ID");
        id.setBounds(30,175,200,30);
        id.setFont(new Font("Raleway",Font.PLAIN,16));
        id.setForeground(Color.black);
        add(id);

        bid=new JLabel();
        bid.setBounds(230,175,200,30);
        bid.setForeground(Color.black);
        bid.setFont(new Font("Raleway",Font.BOLD,17));
        add(bid);
        JLabel num = new JLabel("Number");
        num.setBounds(30,210,200,30);
        num.setFont(new Font("Raleway",Font.PLAIN,16));
        num.setForeground(Color.black);
        add(num);

        bnumber=new JLabel();
        bnumber.setBounds(230,210,200,30);
        bnumber.setForeground(Color.black);
        bnumber.setFont(new Font("Raleway",Font.BOLD,17));
        add(bnumber);

        JLabel phone = new JLabel("Phone ");
        phone.setBounds(30,245,200,30);
        phone.setFont(new Font("Raleway",Font.PLAIN,16));
        phone.setForeground(Color.black);
        add(phone);

        bphone=new JLabel();
        bphone.setBounds(230,245,200,30);
        bphone.setForeground(Color.black);
        bphone.setFont(new Font("Raleway",Font.BOLD,17));
        add(bphone);

        JLabel price = new JLabel("Total Price");
        price.setBounds(30,280,200,30);
        price.setFont(new Font("Raleway",Font.PLAIN,16));
        price.setForeground(Color.black);
        add(price);

        btprice=new JLabel();
        btprice.setBounds(230,280,200,30);
        btprice.setForeground(Color.black);
        btprice.setFont(new Font("Raleway",Font.BOLD,17));
        add(btprice);

        checkpri = new JButton("Check price");
        checkpri.setBounds(50,330,110,30);
        checkpri.setFont(new Font("Raleway",Font.PLAIN,15));
        checkpri.setBackground(Color.BLACK);
        checkpri.setForeground(Color.WHITE);
        checkpri.setBorder(new LineBorder(Color.WHITE));
        checkpri.addActionListener(this);
        add(checkpri);

        bookpkg = new JButton("Book Package");
        bookpkg.setBounds(180,330,110,30);
        bookpkg.setFont(new Font("Raleway",Font.PLAIN,15));
        bookpkg.setBackground(Color.BLACK);
        bookpkg.setForeground(Color.WHITE);
        bookpkg.setBorder(new LineBorder(Color.WHITE));
        bookpkg.addActionListener(this);
        add(bookpkg);

        back = new JButton("Back");
        back.setBounds(310,330,90,30);
        back.setFont(new Font("Raleway",Font.PLAIN,15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(Color.WHITE));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(420,40,450,300);
        add(image);
        try {

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from customer where username = '"+username+"'");
            if (rs.next()){

                buser.setText(rs.getString("username"));
                bid.setText(rs.getString("Id"));
                bnumber.setText(rs.getString("number"));
                bphone.setText(rs.getString("phone"));


            }

        }catch (Exception e){
            System.out.println(e);
        }



        getContentPane().setBackground(new Color(255,255,102));
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==checkpri){


            String tpackage = (String) selectpackage.getSelectedItem();
            int cost = 0;
            if (tpackage.equals("Gold Package")){
                    cost+=12000;

            }else if (tpackage.equals("Silver Package")){
                    cost+=24000;

            }else if (tpackage.equals("Normal Package")){
                    cost+=32000;
            }
            int person = Integer.parseInt(totalpsntf.getText());
            cost*=person;
            btprice.setText("RS "+cost);
        }else  if (ae.getSource()==bookpkg){

        try {
            Conn c=new Conn();
            String query = "insert into bookpackage values('"+buser.getText()+"','"+selectpackage.getSelectedItem()+"','"+totalpsntf.getText()+"','"+bid.getText()+"','"+bnumber.getText()+"','"+bphone.getText()+"','"+btprice.getText()+"')";

            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Booked Package Successfully");
            setVisible(false);
            new DashBoard(username).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }
        }else if (ae.getSource()==back){
            setVisible(false);
            new DashBoard(username).setVisible(true);

        }



    }

    public static void main(String[] args) {
        new BookPackage("");
    }
}
