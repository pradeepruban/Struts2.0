/**
 * 
 */

/**
 * @author PT28001
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserModel {

 private static Connection con;
 static {
  try{
  Class.forName("com.mysql.jdbc.Driver");
  con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/mkyong", "root", "syntel123$");
  }catch(Exception e){
   e.printStackTrace();
  }
 }
 
 public static boolean isUserNameAndPasswordExist (
   String userName,String password){
  
  boolean result = false;
  try{
   String sql = "select * from user where password = ? and login_name = ?";
   PreparedStatement ps = con.prepareStatement(sql);
   ps.setString(2, userName);
   ps.setString(1, password);
   ResultSet rs = ps.executeQuery();
   if(rs.next()){
    result = true;
   }
  }catch(SQLException e){
   e.printStackTrace();
  }
  return result;
 }
 
 
}
