package monvoyage;

import java.sql.Connection;
import java.sql.DriverManager;

	public class ConexaoMySql {

		private static final String USERNAME = "root";

		private static final String PASSWORD = "standbymeG3";

		private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Fisico1";
	

	
	public static Connection createConnectionToMySQL() throws Exception{
		
		Connection connection = DriverManager.getConnection(DATABASE_URL,
		USERNAME, PASSWORD);
		return connection;
	}
}