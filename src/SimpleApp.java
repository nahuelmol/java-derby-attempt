import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Properties;

public class SimpleApp {


    public static void main(String[] args){

        String driver="org.apache.derby.jdbc.EmbeddedDriver";


        String protocol = "jdbc:derby";
        String DBname = ":MyExampleDB";
        String prop = ";create=true";

        String DBURL = protocol+DBname+prop;

        try{
            Class.forName(driver);
        }catch(java.lang.ClassNotFoundException e) {
            e.printStackTrace();
        }


        try{
            Connection conn = DriverManager.getConnection(DBURL);
            System.out.println("DAtabase created succesfully");
        }catch (SQLException se){
            se.printStackTrace();
        }
    }
}
