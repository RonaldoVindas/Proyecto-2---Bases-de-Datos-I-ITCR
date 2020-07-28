/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.DriverManager;
import static java.sql.JDBCType.DATE;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import static java.sql.Types.DATE;
import static java.util.Calendar.DATE;
import static javafx.scene.AccessibleAttribute.DATE;
/**
 *
 * @author rony1
 */
public class DBConnection {
     private static Connection con;
    // Declaramos los datos de conexion a la DB
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
    
   public static ResultSet get_product_recomendations() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_product_recomendations()}");
 
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
   public static ResultSet get_product_results(String pName, int pYear, int pPrice ) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_product_results(?,?,?)}");
       stmt.setString(1, pName);
       stmt.setInt(2, pYear);
       stmt.setInt(3, pPrice);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
   //=========================== FUNCIONES =============================//
   
   //Canton
   public static String get_canton_name(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_canton_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
   
   public static int get_canton_id_province (int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_canton_id_province(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;
   }
   
   //Community
   public static String get_community_name (int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_community_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
   
   public static int get_community_id_district(int pId) throws SQLException{     
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_community_id_district(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;    
   }
   
   //Country
  public static String get_country_name(int pId) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_country_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
  }
    
  //District
  public static String get_district_name(int pId) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_district_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
  }
   
 public static int get_district_id_canton(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_district_id_canton(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;
     
 }
 
 //Genre
 public static String get_genre_name(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_genre_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
 }
 
 //Nationality
 public static String get_nationality_name(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_nationality_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;    
 }

 //Pay Method
 
 public static String get_pay_method_method(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_pay_method_method(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;     
 }
 //Person Chat With Person
 public static int get_person_chat_with_person_id_receiver(int pTransmitter) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_chat_with_person_id_receiver(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pTransmitter);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;
 }
 
 public static int get_person_chat_with_person_id_transmitter(int pTransmitter) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_chat_with_person_id_receiver(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pTransmitter);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;
 }
 
 //public static String get_person_chat_with_person_message(int p)
 /*
 
 
 
 
 
 
 
 
 
 
 */
 
 //public static String get_person_chat_with_person_message(int p)
 /*
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
 
 
 //Person Has Phone
 
 public static int get_person_has_phone_id_person(int pId)throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_has_phone_id_person(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;
 }
 
 public static int get_person_has_phone_id_phone(int pId)throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_has_phone_id_phone(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;
     
 }
 
 //Person Review Person
 
 public static int get_person_review_person_qualification(int pTransmitter) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_review_person_qualification(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pTransmitter);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;
 }
 
 public static int get_person_review_person_id_person_transmitter(int pTransmitter) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_review_person_id_person_transmitter(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pTransmitter);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;
 }
 
 public static int get_person_review_person_id_person_receiver(int pTransmitter) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_review_person_id_person_receiver(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pTransmitter);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;     
 }
 
 public static int get_person_sell_product_id_product(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_sell_product_id_product(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs;     
 }
 
 public static int get_person_sell_product_id_person(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_sell_product_id_person(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
     
 }
 
 //Person
 
 public static int get_person_identification(String pUsername) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_identification(?)}");
        
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, pUsername);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }


 public static String get_person_first_name(int pId)throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_first_name(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;   
 }
 
 
 
 
 public static String get_person_last_name(int pId)throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_last_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;   
 }
 
 public static String get_person_email(int pId)throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_email(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;   
 }
 
 
 
  
  public static Date get_person_birthday(int pId) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_birthday(?)}");
        stmt.registerOutParameter(1, Types.DATE);
        stmt.setInt(2, pId);
        stmt.execute();
        Date rs = stmt.getDate(1);
        System.out.println(rs);
        return rs;   

  }
  
  public static String get_person_user_name(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_user_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;   
 }
  
  public static String get_person_password(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_password(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;  
  
  }
  
  public static int get_person_id_genre(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_id_genre(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_person_id_nationality(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_id_nationality(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_person_id_type_person(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_type_person(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_person_id_reputation(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_id_reputation(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_person_id_community(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_id_community(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  
  public static int get_person_id_shopping_cart(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_id_shopping_cart(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  
  public static int get_person_id_wishlist(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_id_wishlist(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_person_id_photo(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_id_photo(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_person_id_shopping_log(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_id_shopping_log(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  
  //Phone
  
  public static String get_phone_number(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_get_phone_number(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs; 
  }
  
  //Province
  
  public static String get_province_name(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_province_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_province_is_country(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_province_id_country(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  // Reputation
  
  public static int get_reputation_stars(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_reputation_stars(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_reputation_clasification(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_reputation_clasification(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  // Shopping Log Has Product
  
  public static int get_shopping_log_has_product_id_product(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_log_has_product_id_product(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_shopping_log_has_product_id_shopping_log(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_log_has_product_id_product(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  

  
  //Shopping Cart Has Pay Method
  
  public static int get_shopping_cart_has_pay_method_id_pay_method(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_cart_has_pay_method_id_pay_method(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_shopping_cart_has_pay_method_id_shopping_cart(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_cart_has_pay_method_id_shopping_cart(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  // Shopping Cart Has Product
  
  public static int get_shopping_cart_has_product_id_product(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_cart_has_product_id_product(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_shopping_cart_has_product_quantity(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_cart_has_product_quantity(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_shopping_cart_has_product_id_shopping_cart(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_cart_has_product_id_shopping_cart(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  
  // Shopping Cart
  
  public static String get_shopping_cart_status(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_cart_status(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs; 
  }
  
  // Shopping Log
  
  public static String get_shopping_log_record_owner(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shopping_log_record_owner(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs; 
  }
  
  
// Type Person
  
  public static String get_type_person_description(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_type_person_description(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs; 
  }
  
 
  // Wishlist Has Product
  
  public static int get_wishlist_has_product_id_product(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_wishlist_has_product_id_product(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_wishlist_has_product_id_wishlist(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_wishlist_has_product_id_wishlist(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  
  //Wishlist
  
  public static Date get_wishlist_date_added(int pId) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_wishlist_date_added(?)}");
        stmt.registerOutParameter(1, Types.DATE);
        stmt.setInt(2, pId);
        stmt.execute();
        Date rs = stmt.getDate(1);
        System.out.println(rs);
        return rs;   

  }
  //=========================== QUERIES =============================//
  
//Admins
  public static ResultSet get_best_qualified_vendors() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_best_qualified_vendors()}");
 
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
  
  public static ResultSet get_less_expensive_products_by_type() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ get_less_expensive_products_by_type()}");
 
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
  
  public static ResultSet get_most_expensive_products_by_type() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ get_most_expensive_products_by_type()}");
 
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
  
  
  ///Procedimientos de PE
  //TODO de PAR
  //TODO de PR
}
