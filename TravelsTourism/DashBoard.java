package TravelsTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard extends JFrame implements ActionListener {
    JButton adddetail,updatedetail,viewdtl,deletedtl,checkpkg,bookpkg,viewpkg,viewhtl,bookhtl,viewbookedhtl,destination,pay,notepad,about;
    String username;
    public DashBoard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(1,1,103));
        p1.setBounds(0,0,1380,70);
        add(p1); //HEADER PANNEL

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(0,0,70,70);
        p1.add(icon);

        JLabel heading = new JLabel("DashBoard");
        heading.setBounds(90,10,200,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Raleway",Font.BOLD,30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(1,1,103));
        p2.setBounds(0,70,300,870);
        add(p2);

        adddetail= new JButton("Add Personal Details");
        adddetail.setBounds(0,0,300,50);
        adddetail.setBackground(new Color(1,1,103));
        adddetail.setForeground(Color.WHITE);
        adddetail.setFont(new Font("Raleway",Font.PLAIN,20));
        adddetail.setMargin(new Insets(0,0,0,60));
        adddetail.addActionListener(this);
        p2.add(adddetail);

        updatedetail= new JButton("Update Personal Details");
        updatedetail.setBounds(0,50,300,50);
        updatedetail.setBackground(new Color(1,1,103));
        updatedetail.setForeground(Color.WHITE);
        updatedetail.setFont(new Font("Raleway",Font.PLAIN,20));
        updatedetail.setMargin(new Insets(0,0,0,34));
        updatedetail.addActionListener(this);
        p2.add(updatedetail);

        viewdtl= new JButton("View Details");
        viewdtl.setBounds(0,100,300,50);
        viewdtl.setBackground(new Color(1,1,103));
        viewdtl.setForeground(Color.WHITE);
        viewdtl.setFont(new Font("Raleway",Font.PLAIN,20));
        viewdtl.setMargin(new Insets(0,0,0,136));
        viewdtl.addActionListener(this);
        p2.add(viewdtl);

        deletedtl= new JButton("Delete Personal Details");
        deletedtl.setBounds(0,150,300,50);
        deletedtl.setBackground(new Color(1,1,103));
        deletedtl.setForeground(Color.WHITE);
        deletedtl.setFont(new Font("Raleway",Font.PLAIN,20));
        deletedtl.setMargin(new Insets(0,0,0,37));
        deletedtl.addActionListener(this);
        p2.add(deletedtl);

        checkpkg= new JButton("Check Package");
        checkpkg.setBounds(0,200,300,50);
        checkpkg.setBackground(new Color(1,1,103));
        checkpkg.setForeground(Color.WHITE);
        checkpkg.addActionListener(this);
        checkpkg.setFont(new Font("Raleway",Font.PLAIN,20));
        checkpkg.setMargin(new Insets(0,0,0,107));
        p2.add(checkpkg);

        bookpkg= new JButton("Book Package");
        bookpkg.setBounds(0,250,300,50);
        bookpkg.setBackground(new Color(1,1,103));
        bookpkg.setForeground(Color.WHITE);
        bookpkg.addActionListener(this);
        bookpkg.setFont(new Font("Raleway",Font.PLAIN,20));
        bookpkg.setMargin(new Insets(0,0,0,113));
        p2.add(bookpkg);

        viewpkg= new JButton("View Package");
        viewpkg.setBounds(0,300,300,50);
        viewpkg.setBackground(new Color(1,1,103));
        viewpkg.setForeground(Color.WHITE);
        viewpkg.addActionListener(this);
        viewpkg.setFont(new Font("Raleway",Font.PLAIN,20));
        viewpkg.setMargin(new Insets(0,0,0,114));
        p2.add(viewpkg);

        viewhtl= new JButton("View Hotels");
        viewhtl.setBounds(0,350,300,50);
        viewhtl.setBackground(new Color(1,1,103));
        viewhtl.setForeground(Color.WHITE);
        viewhtl.addActionListener(this);
        viewhtl.setFont(new Font("Raleway",Font.PLAIN,20));
        viewhtl.setMargin(new Insets(0,0,0,133));
        p2.add(viewhtl);

        bookhtl= new JButton("Book Hotel");
        bookhtl.setBounds(0,400,300,50);
        bookhtl.setBackground(new Color(1,1,103));
        bookhtl.setForeground(Color.WHITE);
        bookhtl.addActionListener(this);
        bookhtl.setFont(new Font("Raleway",Font.PLAIN,20));
        bookhtl.setMargin(new Insets(0,0,0,137));
        p2.add(bookhtl);

        viewbookedhtl= new JButton("View Booked Hotel");
        viewbookedhtl.setBounds(0,450,300,50);
        viewbookedhtl.setBackground(new Color(1,1,103));
        viewbookedhtl.setForeground(Color.WHITE);
        viewbookedhtl.addActionListener(this);
        viewbookedhtl.setFont(new Font("Raleway",Font.PLAIN,20));
        viewbookedhtl.setMargin(new Insets(0,0,0,70));
        p2.add(viewbookedhtl);

        destination= new JButton("Destination");
        destination.setBounds(0,500,300,50);
        destination.setBackground(new Color(1,1,103));
        destination.setForeground(Color.WHITE);
        destination.addActionListener(this);
        destination.setFont(new Font("Raleway",Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,140));
        p2.add(destination);

        pay= new JButton("Payment");
        pay.setBounds(0,550,300,50);
        pay.setBackground(new Color(1,1,103));
        pay.setForeground(Color.WHITE);
        pay.addActionListener(this);
        pay.setFont(new Font("Raleway",Font.PLAIN,20));
        pay.setMargin(new Insets(0,0,0,155));
        p2.add(pay);

        about= new JButton("About");
        about.setBounds(0,600,300,50);
        about.setBackground(new Color(1,1,103));
        about.setForeground(Color.WHITE);
        about.addActionListener(this);
        about.setFont(new Font("Raleway",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,180));
        p2.add(about);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard2.jpg"));
        Image i6 = i5.getImage().getScaledInstance(1100,630,Image.SCALE_DEFAULT);
        ImageIcon i7 = new ImageIcon(i6);
        JLabel image = new JLabel(i7);
        image.setBounds(300,70,1100,630);
        add(image);

        JLabel text = new JLabel("Welcome To TravelPerk ");
        text.setBounds(250,70,700,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,50));
        image.add(text);




        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==adddetail){
            setVisible(false);
            new AddCustomer(username).setVisible(true);

        }else  if(ae.getSource()==viewdtl){
            setVisible(false);
            new ViewCustomer(username).setVisible(true);
        }else if (ae.getSource()==updatedetail){
            setVisible(false);
            new UpdateCustomer(username).setVisible(true);
        }else  if (ae.getSource()==checkpkg){
           // setVisible(false);
            new CheckPackage(username).setVisible(true);
        }else if (ae.getSource()==bookpkg){

            setVisible(false);
            new BookPackage(username).setVisible(true);

        }else if (ae.getSource()==viewpkg){
            setVisible(false);
            new ViewPackage(username).setVisible(true);
        }else if (ae.getSource()==viewhtl){
            //setVisible(false);
            new CheckHotel().setVisible(true);
        }else if (ae.getSource()==destination){
            new Destinations().setVisible(true);
        }else if (ae.getSource()==bookhtl){
            setVisible(false);
            new BookHotel(username).setVisible(true);
        }else if (ae.getSource()==viewbookedhtl){
            setVisible(false);
            new ViewBookedHotel(username).setVisible(true);

        }else if (ae.getSource()==about){
            new  About(username).setVisible(true);
        }else if (ae.getSource()==deletedtl){
            setVisible(false);
            new DeleteDetail(username).setVisible(true);
        }

    }

    public static void main(String[] args) {

        new DashBoard("");
    }
}
