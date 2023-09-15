package TravelsTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paytm extends JFrame implements ActionListener {
    JButton back;
    String username;
        public Paytm(String username){
            this.username=username;
            setBounds(280,50,800,600);
           // setLayout(null);
            JEditorPane pane = new JEditorPane();
            pane.setEditable(false);
            try {
                pane.setPage("https://paytm.com/rent-payment");


            }catch (Exception e){
                System.out.println(e);
                pane.setContentType("text/html");
                pane.setText("<html>Could Not  lode , Error 404</html>");

            }
            JScrollPane sp = new JScrollPane(pane);
            getContentPane().add(sp);


            back = new JButton("Back");
            back.setBounds(610,20,100,30);
            back.setFont(new Font("Raleway",Font.PLAIN,15));
            back.setBackground(Color.BLACK);
            back.setForeground(Color.WHITE);
            back.setBorder(new LineBorder(Color.WHITE));
            back.addActionListener(this);
            pane.add(back);


            setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==back){
            setVisible(false);
            new Payment(username).setVisible(true);
        }
    }

    public static void main(String[] args) {
            new Paytm("");

    }
}
