package TravelsTourism;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    String username;
    public CheckPackage(String username){
        this.username=username;

        setBounds(200,90,900,600);
            String package1[]={"GOLD PACKAGE","6 Days and 7 Nights", "Airport Assistance","Half Day City Tour","Daily Buffet","Welcome Drinks And Arrival","Full Day 3 ISland Cruise","English Speaking Guide","BOOK NOW","SUMMER SPECIAL" ,"RS 12000/-","package1.jpg"  };
        String package2[]={"SILVER PACKAGE", "5 Days and 6 Nights","Entrance Free Ticket","Great At Airport","Welcome Drinks ","Airport Arrival","Night Safari","Cruies With Dinner","BOOK NOW","MOUNTAIN SPECIAL" ,"RS 24000/-","package2.jpg" };
        String package3[]={"NORMAL PACKAGE","5 Days and 5 Nights","Return Airfare","Free Clubing","Horse Riding & Games","Hard Drinks Free","Daily Buffet","BBQ Dinner","BOOK NOW","WINTER SPECIAL","RS 32000/-","package3.jpg"};


        JTabbedPane tab = new JTabbedPane();

        JPanel p1 = createpackage(package1);
        tab.addTab("Package 1",null,p1);
        JPanel p2 = createpackage(package2);
        tab.addTab("Package 2",null,p2);
        JPanel p3 = createpackage(package3);
        tab.addTab("Package 3",null,p3);
        add(tab);

        setVisible(true);

    }
    public  JPanel createpackage(String[] pack){

        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);

        JLabel gold = new JLabel(pack[0]);
        gold.setBounds(50,10,300,37);
        gold.setForeground(Color.yellow);
        gold.setFont(new Font("Raleway",Font.BOLD,30));
        p1.add(gold);



        JLabel f1 = new JLabel(pack[1]);
        f1.setBounds(30,60,300,30);
        f1.setForeground(Color.RED);
        f1.setFont(new Font("Raleway",Font.BOLD,25));
        p1.add(f1);

        JLabel f2 = new JLabel(pack[2]);
        f2.setBounds(30,110,300,30);
        f2.setForeground(Color.BLUE);
        f2.setFont(new Font("Raleway",Font.BOLD,25));
        p1.add(f2);

        JLabel f3 = new JLabel(pack[3]);
        f3.setBounds(30,160,300,30);
        f3.setForeground(Color.RED);
        f3.setFont(new Font("Raleway",Font.BOLD,25));
        p1.add(f3);

        JLabel f4 = new JLabel(pack[4]);
        f4.setBounds(30,210,300,30);
        f4.setForeground(Color.BLUE);
        f4.setFont(new Font("Raleway",Font.BOLD,25));
        p1.add(f4);

        JLabel f5 = new JLabel(pack[5]);
        f5.setBounds(30,260,350,30);
        f5.setForeground(Color.RED);
        f5.setFont(new Font("Raleway",Font.BOLD,22));
        p1.add(f5);

        JLabel f6 = new JLabel(pack[6]);
        f6.setBounds(30,310,300,30);
        f6.setForeground(Color.BLUE);
        f6.setFont(new Font("Raleway",Font.BOLD,25));
        p1.add(f6);

        JLabel f7 = new JLabel(pack[7]);
        f7.setBounds(30,360,300,30);
        f7.setForeground(Color.RED);
        f7.setFont(new Font("Raleway",Font.BOLD,25));
        p1.add(f7);

        JLabel f8 = new JLabel(pack[8]);
        f8.setBounds(75,410,300,40);
        f8.setForeground(Color.BLACK);
        f8.setFont(new Font("Raleway",Font.BOLD,30));
        p1.add(f8);

        JLabel f9 = new JLabel(pack[9]);
        f9.setBounds(95,460,280,30);
        f9.setForeground(Color.MAGENTA);
        f9.setFont(new Font("Raleway",Font.BOLD,25));
        p1.add(f9);

        JLabel f10 = new JLabel(pack[10]);
        f10.setBounds(430,460,200,30);
        f10.setForeground(Color.CYAN);
        f10.setFont(new Font("Raleway",Font.BOLD,25));
        p1.add(f10);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(350,30,500,300);
        p1.add(image1);
        return p1;


    }

    public static void main(String[] args) {
        new CheckPackage("");
    }
}
