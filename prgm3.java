
    import java.sql.*;
    public class prgm3 {
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prgm1", "root", "admin");
                PreparedStatement ps= con.prepareStatement("select * from student");
                ResultSet rs=ps.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                System.out.println(" total column:" + rsmd.getColumnCount());
                System.out.println(" column name of 2nd column:" + rsmd.getColumnName(1));
                System.out.println(" column type name of 1st column:" + rsmd.getColumnTypeName(1));

                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }


        }
    }

