package example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TrainingExample {
        public static void main(String args[]) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/travel_agency", "root", "oci3hetuno");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from trip");
                while (rs.next())
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                con.close(); //vždy uzavírám spojení
            } catch (Exception e) { //try blok uzavírám definováním chybového stavu
                System.out.println(e); } } }
