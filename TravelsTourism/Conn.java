package TravelsTourism;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){

        try {
            // to add A library into a project ctrl+alt+shift+s

            Class.forName("com.mysql.cj.jdbc.Driver");

            c= DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","adi@6260");
            s = c.createStatement();


        }catch (Exception e){
            System.out.println(e);
        }

    }

}
