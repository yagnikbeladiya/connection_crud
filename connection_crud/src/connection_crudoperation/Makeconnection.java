
package connection_crudoperation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Makeconnection {
	static Connection cn;	
	public static final String username="root";
	public static final  String password="12345";
	public static final  String url = "jdbc:mysql://localhost:3306/student";
	public static Connection getConnection() {
 	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		cn = DriverManager.getConnection(url,username,password);
	
		 
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		
	}	
	return(cn);
		
	
	}


}

