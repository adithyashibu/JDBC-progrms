import java.sql.*;
class Main{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc","root","admin");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}