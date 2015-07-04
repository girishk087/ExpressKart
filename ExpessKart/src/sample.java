import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class sample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println("dont worry everything is fine");
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore","root","ebstore");
	if (conn!=null)
		System.out.println("successful");
	else
		System.out.println("Hatrooo");
}
}
