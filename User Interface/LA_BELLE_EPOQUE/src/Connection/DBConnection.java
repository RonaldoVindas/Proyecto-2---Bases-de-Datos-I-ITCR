/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
/**
 *
 * @author rony1
 */
public class DBConnection {
     private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="2296";
    private static final String urlPR="jdbc:mysql://localhost:3306/pr";
    private static final String urlPE="jdbc:mysql://localhost:3306/pe";

  /*public static java.sql.ResultSet get_Login() throws SQLException{
      con= (Connection) DriverManager.getConnection(urlPR, user, pass);
      CallableStatement stmt = con.prepareCall("{call get_Login()}");
         stmt.execute();
         ResultSet  rs = stmt.getResultSet();
      return rs;
  }*/

    
   public static int get_Login(String pUsername, String pPassword) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE, user, pass);
      CallableStatement stmt = con.prepareCall("{ ? = call get_Login(?,?)}");
         stmt.registerOutParameter(1, Types.INTEGER);
         stmt.setString(2, pUsername);
         stmt.setString(3,pPassword);
         stmt.execute();
         
         int rs =  stmt.getInt(1);
         System.out.println(rs);
      return rs;
   }
    
    
    
    
}
