package TravelsTourism;

import javax.swing.*;
import java.awt.*;

public class CheckHotel extends JFrame implements Runnable{

    JLabel i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    JLabel lebel[]=new JLabel[]{ i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
    Thread t1;
    JLabel caption;

public CheckHotel(){
    setBounds(300,100,800,530);
    setLayout(null);
    caption=new JLabel();
    caption.setBounds(50,400,800,70);
    caption.setFont(new Font("Raleway",Font.BOLD,34));
    caption.setForeground(Color.WHITE);
    add(caption);
    ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
    ImageIcon image[]={i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};

    Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
    Image jimage[]={j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};

    ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null;
    ImageIcon kimage[]={k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};

    for (int i =0;i<10;i++) {
        i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel"+(i+1)+".jpg"));
        jimage[i] = i1.getImage().getScaledInstance(800, 530, Image.SCALE_DEFAULT);
       kimage[i] = new ImageIcon(jimage[i]);
         lebel[i] = new JLabel(kimage[i]);
        lebel[i].setBounds(0, 0, 800, 530);
        add(lebel[i]);

    }


    t1=new Thread(this);
    t1.start();;

    setVisible(true);

}

    @Override
    public void run() {
    String text[]=new String[]{"Belmond Hotel Caruso","Beyond Mnemba Island"," Six Senses Zighy Bay","Royal Malewane","Aman Sveti Stefan","Soneva Fushi","Time + Tide Miavana","Soneva Kiri ","North Island","Soneva Jani"};
        try {

            for (int i=0;i<10;i++){
                lebel[i].setVisible(true);
                caption.setText(text[i]);
                Thread.sleep(2500);
                lebel[i].setVisible(false);

            }
            setVisible(false);

        }catch (Exception e){
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        new CheckHotel();
    }
}
