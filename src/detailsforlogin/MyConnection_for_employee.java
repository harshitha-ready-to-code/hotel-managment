package detailsforlogin;
import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection_for_employee 
 {
	public static Connection getConnection() {
		Connection con=null;
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/employee_registration", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
	return con;
	}
	}   
