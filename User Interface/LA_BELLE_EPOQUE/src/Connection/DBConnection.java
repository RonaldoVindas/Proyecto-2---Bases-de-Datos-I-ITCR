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
   
   public static ResultSet show_nationalities( ) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call show_nationalities()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
   
   public static ResultSet get_all_places( ) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_all_places()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
   public static ResultSet get_all_genders( ) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_all_genders()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
   public static ResultSet get_all_shipping_types( ) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_all_shipping_types()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
   public static ResultSet get_all_product_types( ) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_all_product_types()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
   public static ResultSet get_my_complete_wishlist(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_my_complete_wishlist(?)}");
        stmt.setInt(1,pId);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
   public static ResultSet shoppingHistoryOneYear() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call shoppingHistoryOneYear(?)}");
        stmt.setInt(1,get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
      public static ResultSet shoppingHistoryThreeMonths() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call shoppingHistoryThreeMonths(?)}");
        stmt.setInt(1,get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
         public static ResultSet shoppingHistorySixMonths() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call shoppingHistorySixMonths(?)}");
        stmt.setInt(1,get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
         
          public static ResultSet get_binnacle_MaxId() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_binnacle_MaxId()}");
 
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
          
          
   
      public static ResultSet get_product_maxID() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_product_maxID()}");
 
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
      
      
      
      public static ResultSet showWishList() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call showWishList(?)}");
       stmt.setInt(1, get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
      }
   /*--------------------------------------------------------------------------------------------*/
   //============================= PROCEDIMIENTOS DE ESQUEMA PE ==========================================
   
   // Canton
   public static void insertCanton(String pname, int pid)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_canton(?,?)}");
       stmt.setString(1,pname);
       stmt.setInt(2, pid);
       stmt.execute();
    }
    
     public static void updateCantonName(int pid, String pName)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_canton_name(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pName);
        stmt.execute();
     }
    public static void updateCantonIDProvince(int pid, int pid_province)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_canton_id_province(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pid_province);
        stmt.execute();
     }
    
   public static void removeCanton( int pid) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call remove_canton(?)}");
        stmt.setInt(1, pid);
        stmt.execute();
     }
   
   // Community 
   
   public static void insertCommunity(String pname, int pid_district)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_community(?,?)}");
       stmt.setString(1,pname);
       stmt.setInt(2, pid_district);
       stmt.execute();
    }

    public static void updateCommunityName(int pid, String pName)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_community_name(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pName);
        stmt.execute();
     }
    public static void updateCommunityIDdistrict(int pid, int pid_district)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_community_id_district(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pid_district);
        stmt.execute();
     }
    
    public static void removeCommunity( int pid) throws SQLException{
          con = (Connection) DriverManager.getConnection(urlPE,user,pass);
          CallableStatement stmt = con.prepareCall("{call remove_community(?)}");
           stmt.setInt(1, pid);
           stmt.execute();
        }
   
   //Country
    
     public static void insertCountry(String pname)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_country(?)}");
       stmt.setString(1,pname);
       stmt.execute();
    }

    public static void updateCountryName(int pid, String pName)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_country_name(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pName);
        stmt.execute();
     }
    
    public static void removeCountry( int pid) throws SQLException{
          con = (Connection) DriverManager.getConnection(urlPE,user,pass);
          CallableStatement stmt = con.prepareCall("{call remove_country(?)}");
           stmt.setInt(1, pid);
           stmt.execute();
        }
   
   
    // District
    
    public static void insertDistrict(String pname, int pid_canton)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_district(?,?)}");
       stmt.setString(1,pname);
       stmt.setInt(2, pid_canton);
       stmt.execute();
    }
    
     public static void updateDistrictName(int pid, String pName)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_district_name(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pName);
        stmt.execute();
     }
    public static void updateDistrictIDCanton(int pid, int pid_canton)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_district_id_canton(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pid_canton);
        stmt.execute();
     }
    
   public static void removeDistrict( int pid) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call remove_district(?)}");
        stmt.setInt(1, pid);
        stmt.execute();
     }
   
   //Genre
   public static void insertGenre(String pname)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_genre(?)}");
       stmt.setString(1,pname);
       stmt.execute();
    }
    
     public static void updateGenreName(int pid, String pName)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_genre_name(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pName);
        stmt.execute();
     }
   
   public static void removeGenre( int pid) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call remove_genre(?)}");
        stmt.setInt(1, pid);
        stmt.execute();
     }
   
   //Nationality
   public static void insertNationality(String pname)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_nationality(?)}");
       stmt.setString(1,pname);
       stmt.execute();
    }
    
     public static void updateNationalityName(int pid, String pName)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_nationality_name(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pName);
        stmt.execute();
     }
   
   public static void removeNationality( int pid) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call remove_nationality(?)}");
        stmt.setInt(1, pid);
        stmt.execute();
     }
   
   //Pay Method
    public static void insertPayMethod(String pmethod)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_pay_method(?)}");
       stmt.setString(1,pmethod);
       stmt.execute();
    }
    
     public static void updatePayMethod(int pid, String pmethod)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_pay_method_method(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pmethod);
        stmt.execute();
     }
   
   public static void removePayMethod( int pid) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call remove_pay_method(?)}");
        stmt.setInt(1, pid);
        stmt.execute();
     }
   
   // Person
   
    public static void insertPerson(int pid, String pFirstName, String pLastName, 
           Date pbirthday, String pemail, String pusername, String ppassword, int pidGender,
           int pidNationality,int pidtype,int pidReputation, int pidCommunity, int pidShoppingCart,
           int pidWishlist,int pidPhoto, int pidShoppingLog) throws SQLException{

        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call insert_person(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        stmt.setInt(1, pid);
        stmt.setString(2,pFirstName);
        stmt.setString(3,pLastName);
        stmt.setDate(4, new java.sql.Date(pbirthday.getTime()));
        stmt.setString(5,pemail);
        stmt.setString(6, pusername);
        stmt.setString(7, ppassword);
        stmt.setInt(8, pidGender);
        stmt.setInt(9, pidNationality);
        stmt.setInt(10, pidtype);
        stmt.setInt(11, pidReputation);
        stmt.setInt(12, pidCommunity);
        stmt.setInt(13, pidShoppingCart);
        stmt.setInt(14, pidWishlist);
        stmt.setInt(15, pidPhoto);
        stmt.setInt(16, pidShoppingLog);
        stmt.execute();
             
    }
     
    public static void removePerson( int pid) throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call remove_person(?)}");
        stmt.setInt(1, pid);
        stmt.execute();
     }
     
     public static void update_person_id(int pid, int pidentification)throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_identification(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidentification);
        stmt.execute();
     }
    
    
    public static void update_person_last_name(int pid, String plastName)throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_last_name(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,plastName);
        stmt.execute();
     }
     
    public static void update_person_birth_day(int pid, Date pdate)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_birth_day(?,?)}");
        stmt.setInt(1,pid);
        stmt.setDate(2, new java.sql.Date(pdate.getTime()));
        stmt.execute();
        }
     
    public static void update_person_email(int pid, String pemail)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_email(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pemail);
        stmt.execute();
          
      }
      
    public static void update_person_username(int pid, String pusername)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_username(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pusername);
        stmt.execute();
      }
      
    public static void update_person_password(int pid, String ppassword)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_password(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,ppassword);
        stmt.execute();
      }
      
    public static void update_person_id_genre(int pid, int pidGenre)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_genre(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidGenre);
        stmt.execute();
      
      }
       
    public static void update_person_id_nationality(int pid, int pidNationality)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_id_nationality(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidNationality);
        stmt.execute();
       
       }

    public static void update_person_type_person(int pid, int pidTypePerson)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_id_type_person(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidTypePerson);
        stmt.execute();
       
       }
   
   public static void update_person_id_reputation(int pid, int pidReputation)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_id_reputation(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidReputation);
        stmt.execute();
       
       }
   
   public static void update_person_id_community(int pid, int pidCommunity)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_id_community(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidCommunity);
        stmt.execute();
       
       }
   
      public static void update_person_id_shopping_cart(int pid, int pidShoppingCart)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_id_shopping_cart(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidShoppingCart);
        stmt.execute();
       
       }
   
    public static void update_person_id_wishlist(int pid, int pidWishlist)throws SQLException{
         con = (Connection) DriverManager.getConnection(urlPE,user,pass);
         CallableStatement stmt = con.prepareCall("{ call update_person_id_wishlist(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,pidWishlist);
         stmt.execute();

        }
   
   public static void update_person_id_photo(int pid, int pidPhoto)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_id_photo(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidPhoto);
        stmt.execute();
       
       }
   
   public static void update_person_id_shopping_log(int pid, int pidShoppingLog)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_id_shopping_log(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidShoppingLog);
        stmt.execute();
       
       }
   
   
   /*
   
   
   
   PERSON HISTORY LOG
   
   
   
   
   
   */
   
   //Person Has Phone
   
   public static void insert_person_has_phone(int pid, int pPhone)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call insert_person_has_phone(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pPhone);
        stmt.execute();
       
       }
   
    public static void update_person_has_phone_id_person(int pid, int pidPerson)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_has_phone_id_person(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidPerson);
        stmt.execute();
       
       }
    
   public static void update_person_has_phone_id_phone(int pid, int pidPhone)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_has_phone_id_phone(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidPhone);
        stmt.execute();
       
       }
   
   public static void remove_person_has_phone(int pid)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call remove_person_has_phone(?)}");
        stmt.setInt(1,pid);
        stmt.execute();
       
       }
   
   // Person Review Person
   
   public static void insert_person_review_person(int pidTransmitter, int pidReceiver, int pcalification)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call insert_person_review_person(?,?,?)}");
        stmt.setInt(1,pidTransmitter);
        stmt.setInt(2,pidReceiver);
        stmt.setInt(3,pcalification);
        stmt.execute();
       
       }
   
    public static void update_person_review_person_id_person_transmitter(int pid,int pidTransmitter)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_review_person_id_person_transmitter(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidTransmitter);
        stmt.execute();
       
       }
    
   public static void update_person_review_person_id_person_receiver(int pid,int pidReceiver)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_review_person_id_person_receiver(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidReceiver);
        stmt.execute();
       
       }
   
    public static void update_person_review_person_calification(int pid,int pidCalification)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_review_person_calification(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidCalification);
        stmt.execute();
       
       }
   
    public static void update_person_review_person_comment(int pid,String pcomment)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_review_person_comment(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pcomment);
        stmt.execute();
       
       }
   
    public static void remove_person_review_person(int pid)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call remove_person_review_person(?)}");
        stmt.setInt(1,pid);
        stmt.execute();
       
       }
   
    // Person Sell Product
    
    public static void insert_person_sell_product( int pidProduct)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call insert_person_sell_product(?,?)}");
        stmt.setInt(1, get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.setInt(2,pidProduct);
        stmt.execute();
       
       }
   
   public static void update_person_sell_product_id_person(int pid,int pidPerson)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_sell_product_id_person(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidPerson);
        stmt.execute();
       
       }
   
   public static void update_person_sell_id_product(int pid,int pidProduct)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_sell_id_product(?,?)}");
        stmt.setInt(1,pid);
        stmt.setInt(2,pidProduct);
        stmt.execute();
       
       }
   
    public static void remove_person_sell_product(int pid)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{ call remove_person_sell_product(?)}");
        stmt.setInt(1,pid);
        stmt.execute();
       
       }
   
   // Phone
    
     public static void insert_phone(String pPhone)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_phone(?)}");
       stmt.setString(1,pPhone);
       stmt.execute();
    }

    public static void update_phone_phone_number(int pid, String pPhone)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_phone_phone_number(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pPhone);
        stmt.execute();
     }
    
    public static void remove_phone( int pid) throws SQLException{
          con = (Connection) DriverManager.getConnection(urlPE,user,pass);
          CallableStatement stmt = con.prepareCall("{call remove_phone(?)}");
           stmt.setInt(1, pid);
           stmt.execute();
        }
    
    
   // Province
    
    public static void insert_province(String pname,int pidCountry)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_province(?,?)}");
       stmt.setString(1,pname);
       stmt.setInt(2,pidCountry);
       stmt.execute();
    }

    public static void update_province_name(int pid, String pname)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_province_name(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pname);
        stmt.execute();
     }
    
    public static void update_province_id_country(int pid, String pidCountry)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_province_id_country(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pidCountry);
        stmt.execute();
     }
    
    public static void remove_province( int pid) throws SQLException{
          con = (Connection) DriverManager.getConnection(urlPE,user,pass);
          CallableStatement stmt = con.prepareCall("{call remove_province(?)}");
           stmt.setInt(1, pid);
           stmt.execute();
        }
    
    
    //Reputation
   public static void insert_reputation(String pclasification,String pStars)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_reputation(?,?)}");
       stmt.setString(1,pclasification);
       stmt.setString(1,pStars);
       stmt.execute();
    }

    public static void update_reputation_clasification(int pid, String pclasification)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_reputation_clasification(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pclasification);
        stmt.execute();
     }
    
     public static void update_reputation_stars(int pid, String pstars)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_reputation_stars(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pstars);
        stmt.execute();
     }
  
    public static void remove_reputation( int pid) throws SQLException{
          con = (Connection) DriverManager.getConnection(urlPE,user,pass);
          CallableStatement stmt = con.prepareCall("{call remove_reputation(?)}");
           stmt.setInt(1, pid);
           stmt.execute();
        }
    
    //Type Person
    
    public static void insert_type_person(String pdescription)throws SQLException{
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{call insert_type_person(?)}");
       stmt.setString(1,pdescription);
       stmt.execute();
    }

     public static void update_person_description(int pid, String pdescription)throws SQLException{
  
        con = (Connection) DriverManager.getConnection(urlPE,user,pass);
        CallableStatement stmt = con.prepareCall("{call update_person_description(?,?)}");
        stmt.setInt(1,pid);
        stmt.setString(2,pdescription);
        stmt.execute();
     }
  
    public static void remove_type_person( int pid) throws SQLException{
          con = (Connection) DriverManager.getConnection(urlPE,user,pass);
          CallableStatement stmt = con.prepareCall("{call remove_type_person(?)}");
           stmt.setInt(1, pid);
           stmt.execute();
        }
    
    
    
   
   //=========================== FUNCIONES DE ESQUEMA PE =============================//
   
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
 
 
  public static Date get_person_chat_with_person_message_date(int pIdTransmitter) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = get_person_chat_with_person_message_date(?)}");
        stmt.registerOutParameter(1, Types.DATE);
        stmt.setInt(2,  pIdTransmitter);
        stmt.execute();
        Date rs = stmt.getDate(1);
        System.out.println(rs);
        return rs;     
 }
 
  public static String get_person_chat_with_person_message(int pIdTransmitter) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_person_chat_with_person_message(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pIdTransmitter);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;     
 }

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
  //==============================PROCEDIMIENTOS DE ESQUEMA PR =========================================
  
  
  // Shipping Type
  public static void insert_shipping_type(String pType) throws SQLException{
      con = null;
      con= (Connection) DriverManager.getConnection(urlPR, user, pass);
      CallableStatement stmt = con.prepareCall("{call insert_shipping_type(?)}");
          stmt.setString(1, pType);  
      
         stmt.execute();

  }
  
  public static void update_shipping_type(int pid, String pType) throws SQLException{
      con = null;
      con= (Connection) DriverManager.getConnection(urlPR, user, pass);
      CallableStatement stmt = con.prepareCall("{call update_shipping_type(?,?)}");
          stmt.setInt(1, pid);  
          stmt.setString(2,pType);
      
         stmt.execute();

  }
  
  public static void remove_shipping_type(int pid) throws SQLException{
      con = null;
      con= (Connection) DriverManager.getConnection(urlPR, user, pass);
      CallableStatement stmt = con.prepareCall("{call remove_shipping_type(?)}");
          stmt.setInt(1, pid);  

      
         stmt.execute();

  }
  
  
  //Product Type
  
  public static void insert_product_type(String pType) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call insert_product_type(?)}");
    stmt.setString(1, pType);  
      
    stmt.execute();

  }
  public static void update_product_type_type(int pid,String pType) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_type_type(?,?)}");
    stmt.setString(2, pType);  
    stmt.setInt(1, pid);
      
    stmt.execute();

  }
    
    public static void remove_product_type(int pid) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call remove_product_type(?)}");
    stmt.setInt(1, pid);
      
    stmt.execute();
    }
    
  //Product Binnacle
  
  public static void insert_product_binnacle(int price, String puser) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call insert_product_binnacle(?,?)}");
    stmt.setInt(1, price);
    stmt.setString(2,puser);
      
    stmt.execute();

  }
  
  
  
  //ASDASDASD
    public static void insert_product_has_shipping_type(int pidProduct, int pid_Shipping) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call insert_product_has_shipping_type(?,?)}");
    stmt.setInt(1, pidProduct);
    stmt.setInt(2,pid_Shipping);
      
    stmt.execute();

  }
    

  
  public static void update_product_binnacle_price(int pid, int pPrice) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_binnacle_price(?,?)}");
    stmt.setInt(1, pid);
    stmt.setInt(2,pPrice);
      
    stmt.execute();

  } 
    public static void update_product_binnacle_owner(int pid, String pOwner) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_binnacle_owner(?,?)}");
    stmt.setInt(1, pid);
    stmt.setString(2,pOwner);
      
    stmt.execute();

  }
    
    
    public static void remove_product_binnacle(int pid) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call remove_product_binnacle(?)}");
    stmt.setInt(1, pid);
    
    stmt.execute();
  
    }
    
   //Product 
    
    public static void insert_product(String pName,String pCondition,String pDescription,int pObjAge, int pPrice,int pIdBinnacle,int pIdProduct_Type) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call insert_product(?,?,?,?,?,?,?)}");
    stmt.setString(1, pName);
      stmt.setString(2, pCondition);
        stmt.setString(3, pDescription);
          stmt.setInt(4, pObjAge);
            stmt.setInt(5, pPrice);
              stmt.setInt(6, pIdBinnacle);
                stmt.setInt(7, pIdProduct_Type);

                
                
              
    
    stmt.execute();

  } 
   
   public static void update_product_name(int pid, String pName) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_name(?,?)}");
    stmt.setInt(1, pid);
    stmt.setString(2,pName);
      
    stmt.execute();

  }
    
    public static void update_product_product_condition(int pid, String pCondition) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_product_condition(?,?)}");
    stmt.setInt(1, pid);
    stmt.setString(2,pCondition);
      
    stmt.execute();

  }
     public static void update_product_description(int pid, String pDescription) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_description(?,?)}");
    stmt.setInt(1, pid);
    stmt.setString(2,pDescription);
      
    stmt.execute();

  }
    public static void update_product_object_age(int pid, int pObjAge) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_object_age(?,?)}");
    stmt.setInt(1, pid);
    stmt.setInt(2,pObjAge);
      
    stmt.execute();

  }
    
    public static void update_product_price(int pid, int pPrice) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_price(?,?)}");
    stmt.setInt(1, pid);
    stmt.setInt(2,pPrice);
      
    stmt.execute();

  }
    
    public static void update_product_id_product_type(int pid, int pIdType) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call update_product_id_product_type(?,?)}");
    stmt.setInt(1, pid);
    stmt.setInt(2,pIdType);
      
    stmt.execute();

  }
    
    public static void remove_product(int pid) throws SQLException{
    con = null;
    con= (Connection) DriverManager.getConnection(urlPR, user, pass);
    CallableStatement stmt = con.prepareCall("{call remove_product(?,?)}");
    stmt.setInt(1, pid);
 
      
    stmt.execute();

  } 
    
    
    
    

    
    //Photo
    
  //==============================FUNCIONES DE ESQUEMA PR =========================================
  
  
  
      public static int get_product_type_iD(String pType) throws SQLException{
         con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_type_iD(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setString(2, pType);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  
  
  
        public static int get_shipping_type_iD(String pType) throws SQLException{
         con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shipping_type_iD(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setString(2, pType);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  
  
  
   //Photo
    public static String get_photo_photo_information(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_photo_photo_information(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
  
    
    //Product Has Photo
  public static int get_product_has_photo_id_photo(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_has_photo_id_photo(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_product_has_photo_id_product(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_has_photo_id_product(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  //Product Has Shipping Type
  
  public static int get_product_has_shipping_type_id_product(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_has_shipping_type_id_product(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_product_has_shipping_type_id_shipping_type(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_has_shipping_type_id_shipping_type(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  // Product
  
  public static String get_product_name(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_name(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
  
  public static String get_product_product_condition(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_product_condition(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
  
  public static String get_product_description(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_description(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
  
  public static int get_product_object_age(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_object_age(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_product_price(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_price(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_product_id_product_binnacle(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_id_product_binnacle(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  

  
  
  //Product Binnacle
  
  public static int get_product_binnacle_last_price(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_binnacle_last_price(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static int get_product_binnacle_actual_price(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_binnacle_actual_price(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  public static String get_product_binnacle_last_owner(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_binnacle_last_owner(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
  
  public static String get_product_binnacle_actual_owner(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_binnacle_actual_owner(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
  
  //Product Type
  
  public static String get_product_type_type(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_type_type(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
  
  //Shipping Type
  
  public static String get_shipping_type_type(int pId) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_shipping_type_type(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, pId);
        stmt.execute();
        String rs = stmt.getString(1);
        System.out.println(rs);
        return rs;
   }
  
 
  
  
  
  
  public static int get_product_id_product_type(int pId) throws SQLException{
     con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ ? = call get_product_id_product_type(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int rs = stmt.getInt(1);
        System.out.println(rs);
        return rs; 
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  //=========================== QUERIES =============================//
       public static ResultSet RecentHistoryLogSearch() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call RecentHistoryLogSearch(?)}");
       stmt.setInt(1, get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
      }
  
      public static ResultSet personSoldItemList() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call personSoldItemList(?)}");
       stmt.setInt(1, get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
      }
  
       public static ResultSet showShoppingLog() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call showShoppingLog(?)}");
       stmt.setInt(1, get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
      }
  public static ResultSet purchaseByCategoryMoreThan1000() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call purchaseByCategoryMoreThan1000(?)}");
       stmt.setInt(1, get_person_identification(LA_BELLE_EPOQUE.LA_BELLE_EPOQUE.username));
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
  
  
  
  
//Admins
  public static ResultSet get_best_qualified_vendors(int pQuantity) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_best_qualified_vendors(?)}");
        stmt.setInt(1, pQuantity);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
  
  public static ResultSet get_less_expensive_products_by_type(int pQuantity) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_less_expensive_products_by_type(?)}");
        stmt.setInt(1, pQuantity);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
  
  public static ResultSet get_most_expensive_products_by_type(int pQuantity) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_most_expensive_products_by_type(?)}");
        stmt.setInt(1, pQuantity);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
  
    public static ResultSet get_most_expensive_products(int pQuantity) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_most_expensive_products(?)}");
        stmt.setInt(1, pQuantity);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
    
    public static ResultSet get_users_with_more_bought_products(int pQuantity) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_users_with_more_bought_products(?)}");
        stmt.setInt(1, pQuantity);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }
   
            
     public static ResultSet get_top_users_with_more_sales(int pQuantity) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_top_users_with_more_sales(?)}");
        stmt.setInt(1, pQuantity);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }       
            
                    
    public static ResultSet get_worst_qualified_vendors(int pQuantity) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call get_worst_qualified_vendors(?)}");
        stmt.setInt(1, pQuantity);
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }               
            
            
  
  ///Procedimientos de PE
    
    //Estadisticas 
    
        public static ResultSet percentPerType() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPR,user,pass);
       CallableStatement stmt = con.prepareCall("{ call percentPerType()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }               
    
        
        
        public static ResultSet sellersPerGender() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call sellersPerGender()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }         
    
       public static ResultSet sellersPerGenderAndAge(int pQuantity) throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call percentPerType()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }    
    
       public static ResultSet TotalPerGender() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call TotalPerGender()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }           
    
        public static ResultSet sellsPerGender() throws SQLException{
       con = (Connection) DriverManager.getConnection(urlPE,user,pass);
       CallableStatement stmt = con.prepareCall("{ call sellsPerGender()}");
        stmt.execute();
        ResultSet rs = stmt.getResultSet();
        System.out.println(rs);
        return rs;
   }         
       
    
    
    
  //TODO de PAR
  
}
