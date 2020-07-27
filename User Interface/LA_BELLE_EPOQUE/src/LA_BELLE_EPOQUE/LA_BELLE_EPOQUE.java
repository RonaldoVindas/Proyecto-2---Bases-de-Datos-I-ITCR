
package LA_BELLE_EPOQUE;

import UIFrames.Login_Menu;
import com.mysql.jdbc.Connection;

/**
 *
 * @author Ronaldo Vindas
 */
public class LA_BELLE_EPOQUE {

    public static String username = null;
            
            
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="2296";
    private static final String url="jdbc:mysql://localhost:3306/pr";        
            
    public static void main(String[] args) {
       Login_Menu menu = new Login_Menu();
       menu.setVisible(true);
    }
    
}
