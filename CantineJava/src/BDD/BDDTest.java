package BDD;

//Query1.java:  Query an mSQL database using JDBC. 

import java.sql.*;

/**
* A JDBC SELECT (JDBC query) example program.
*/
class Query1 {

public static void main (String[] args) {
    try {
        String url = "jdbc:mysql://localhost/projet_cinema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user="root";
		String password ="";
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement stmt = conn.createStatement();
        ResultSet rs;

        rs = stmt.executeQuery("SELECT * FROM user WHERE 1");
        while ( rs.next() ) {
            String lastName = rs.getString("Lname");
            System.out.println(lastName);
        }
        conn.close();
    } catch (Exception e) {
        System.err.println("Got an exception! ");
        System.err.println(e.getMessage());
    }
}
}
