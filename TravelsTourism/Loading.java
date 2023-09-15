package TravelsTourism;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    JProgressBar bar;
    Thread t;
    String username;
    public Loading(String username){
        this.username=username;
        t = new Thread(this);
        setBounds(400,170,650,400);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text = new JLabel("Travel And Tourism Application");
        text.setBounds(50,20,600,40);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        text.setForeground(Color.BLUE);
        add(text);
         bar = new JProgressBar();
         bar.setBounds(150,100,300,30);
         bar.setStringPainted(true);
         add(bar);

        JLabel loading = new JLabel("Loading Please Wait.....");
        loading.setBounds(200,140,200,30);
        loading.setFont(new Font("Raleway",Font.BOLD,17));
        loading.setForeground(Color.RED);
        add(loading);

        JLabel welcome = new JLabel("Welcome  "+username);
        welcome.setBounds(20,310,500,40);
        welcome.setFont(new Font("Raleway",Font.BOLD,30));
        welcome.setForeground(Color.RED);
        add(welcome);

        t.start();
        getContentPane().setBackground(new Color(255,255,102));
        setVisible(true);

    }

    @Override
    public void run() {
        try {
            for (int i =1;i<=101;i++){
                int max = bar.getMaximum();
                int value = bar.getValue();
                if (value <max){

                    bar.setValue(bar.getValue()+1);
                }else {
                    setVisible(false);
                    new DashBoard(username).setVisible(true);

                }
                Thread.sleep(50);

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Loading("");
    }
}
