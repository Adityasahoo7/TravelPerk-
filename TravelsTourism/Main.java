package TravelsTourism;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame implements Runnable { //multiple inheritance not allowed in java but we inherit multiple classes
    Thread thread;
    public  Main(){
   // setSize(1000,600);
  //  setLocation(200,80);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
    Image i2 = i1.getImage().getScaledInstance(1000,600,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    add(image);


    setVisible(true);
    thread= new Thread(this);
    thread.start();//run method not call because of multithreading so i call start method

}

    @Override
    public void run() {
         try {
             Thread.sleep(6000);
             setVisible(false);
             new Login().setVisible(true);

         }catch (Exception e){
             System.out.println(e);
         }
    }

    public static void main(String[] args) {
    Main frame = new Main();

    int x =1;
    for (int i =1;i<=460;x+=7,i+=6) {
        frame.setLocation(685 - (x + i) / 2, 350 - (i / 2));
        frame.setSize(x + i, i+50);
        try {
            Thread.sleep(15);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
}
