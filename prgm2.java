import java.sql.*;
public class prgm2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prgm1", "root", "admin");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println(" Driver name:" + dbmd.getDriverName());
            System.out.println(" Driver version:" + dbmd.getDriverVersion());
            System.out.println(" username:" + dbmd.getUserName());
            System.out.println(" Database product name:" + dbmd.getDatabaseProductName());
            System.out.println(" Database product version:" + dbmd.getDatabaseProductVersion());
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}


