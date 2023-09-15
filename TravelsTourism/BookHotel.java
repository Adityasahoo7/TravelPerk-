package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookHotel extends JFrame implements ActionListener {

    JButton checkpri,bookpkg,back;
    Choice selecthotel,cac,cfood;
    String hotelname[]={"Belmond Hotel Caruso","Beyond Mnemba Island","Six Senses Zighy Bay","Royal Malewane","Aman Sveti Stefan","Soneva Fushi","Time + Tide Miavana","Soneva Kiri ","North Island","Soneva Jani"};

    JTextField totalpsntf,nodaytf,actf,foodtf;
    JLabel buser,bid,bnumber,bphone ,btprice;
    String username;

    public BookHotel(String username){
        this.username=username;
        setBounds(200,120,950,530);
        setLayout(null);
        //setBackground(new Color(255,255,102));
        // setBackground(Color.blue);
        JLabel book = new JLabel("BOOK HOTEL");
        book.setBounds(111,30,200,30);
        book.setFont(new Font("Raleway",Font.PLAIN,27));
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


        JLabel pack = new JLabel("Select Hotel");
        pack.setBounds(30,105,200,30);
        pack.setFont(new Font("Raleway",Font.PLAIN,16));
        pack.setForeground(Color.black);
        add(pack);

        selecthotel = new Choice();
        selecthotel.setBounds(230,113,175,20);
        selecthotel.setBackground(new Color(255,255,102));
        add(selecthotel);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from hoteldetails");
            while (rs.next()){
                selecthotel.add(rs.getString("hotelname"));

            }


        }catch (Exception ee){
            System.out.println(ee);

        }

        JLabel person = new JLabel("Total Person ");
        person.setBounds(30,140,200,30);
        person.setFont(new Font("Raleway",Font.PLAIN,16));
        person.setForeground(Color.black);
        add(person);
        totalpsntf=new JTextField();
        totalpsntf.setBounds(230,145,160,25);
        add(totalpsntf);

        JLabel days = new JLabel("No.Of Days ");
        days.setBounds(30,175,200,30);
        days.setFont(new Font("Raleway",Font.PLAIN,16));
        days.setForeground(Color.black);
        add(days);
        nodaytf=new JTextField();
        nodaytf.setBounds(230,175,160,25);
        add(nodaytf);

        JLabel ac = new JLabel("AC/Non-AC");
        ac.setBounds(30,210,200,30);
        ac.setFont(new Font("Raleway",Font.PLAIN,16));
        ac.setForeground(Color.black);
        add(ac);
        cac=new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(230,210,160,25);
        cac.setBackground(new Color(255,255,102));
        add(cac);

        JLabel food = new JLabel("Food Included");
        food.setBounds(30,245,200,30);
        food.setFont(new Font("Raleway",Font.PLAIN,16));
        food.setForeground(Color.black);
        add(food);
        cfood=new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(230,245,160,25);
        cfood.setBackground(new Color(255,255,102));
        add(cfood);

        JLabel id = new JLabel("ID");
        id.setBounds(30,280,200,30);
        id.setFont(new Font("Raleway",Font.PLAIN,16));
        id.setForeground(Color.black);
        add(id);

        bid=new JLabel();
        bid.setBounds(230,280,200,30);
        bid.setForeground(Color.black);
        bid.setFont(new Font("Raleway",Font.BOLD,17));
        add(bid);
        JLabel num = new JLabel("Number");
        num.setBounds(30,315,200,30);
        num.setFont(new Font("Raleway",Font.PLAIN,16));
        num.setForeground(Color.black);
        add(num);

        bnumber=new JLabel();
        bnumber.setBounds(230,315,200,30);
        bnumber.setForeground(Color.black);
        bnumber.setFont(new Font("Raleway",Font.BOLD,17));
        add(bnumber);

        JLabel phone = new JLabel("Phone ");
        phone.setBounds(30,350,200,30);
        phone.setFont(new Font("Raleway",Font.PLAIN,16));
        phone.setForeground(Color.black);
        add(phone);

        bphone=new JLabel();
        bphone.setBounds(230,350,200,30);
        bphone.setForeground(Color.black);
        bphone.setFont(new Font("Raleway",Font.BOLD,17));
        add(bphone);

        JLabel price = new JLabel("Total Price");
        price.setBounds(30,385,200,30);
        price.setFont(new Font("Raleway",Font.PLAIN,16));
        price.setForeground(Color.black);
        add(price);

        btprice=new JLabel();
        btprice.setBounds(230,385,200,30);
        btprice.setForeground(Color.black);
        btprice.setFont(new Font("Raleway",Font.BOLD,17));
        add(btprice);

        checkpri = new JButton("Check price");
        checkpri.setBounds(50,440,110,30);
        checkpri.setFont(new Font("Raleway",Font.PLAIN,15));
        checkpri.setBackground(Color.BLACK);
        checkpri.setForeground(Color.WHITE);
        checkpri.setBorder(new LineBorder(Color.WHITE));
        checkpri.addActionListener(this);
        add(checkpri);

        bookpkg = new JButton("Book Package");
        bookpkg.setBounds(180,440,110,30);
        bookpkg.setFont(new Font("Raleway",Font.PLAIN,15));
        bookpkg.setBackground(Color.BLACK);
        bookpkg.setForeground(Color.WHITE);
        bookpkg.setBorder(new LineBorder(Color.WHITE));
        bookpkg.addActionListener(this);
        add(bookpkg);

        back = new JButton("Back");
        back.setBounds(310,440,90,30);
        back.setFont(new Font("Raleway",Font.PLAIN,15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(Color.WHITE));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(516,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(420,0,516,500);
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
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hoteldetails where hotelname ='"+selecthotel.getSelectedItem()+"'");
                while (rs.next()){
                    int cost=Integer.parseInt(rs.getString("costperson")) ;
                    int food=Integer.parseInt(rs.getString("foodinclude")) ;
                    int ac=Integer.parseInt(rs.getString("acroom")) ;
                    int person=Integer.parseInt(totalpsntf.getText());
                    int days = Integer.parseInt(nodaytf.getText());
                    String acselect = cac.getSelectedItem();
                    String foodselect = cfood.getSelectedItem();
                    if (person*days>0){
                        int total =0;
                        total +=acselect.equals("AC")?ac:0;
                        total+=foodselect.equals("Yes")?food:0;
                        total+=cost;
                        total=total*person*days;
                        btprice.setText("Rs "+total);

                    }else {
                        JOptionPane.showMessageDialog(null,"Please Enter valid Number");
                    }
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }else  if (ae.getSource()==bookpkg){

            try {
                Conn c=new Conn();
                String query = "insert into hotel values('"+buser.getText()+"','"+selecthotel.getSelectedItem()+"','"+totalpsntf.getText()+"','"+nodaytf.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+bid.getText()+"','"+bnumber.getText()+"','"+bphone.getText()+"','"+btprice.getText()+"')";

                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Booked Hotel Successfully");
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
        new BookHotel("");
    }
}
