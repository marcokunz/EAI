import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankVCT {
	


public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		String url = "jdbc:mysql://sql11.freesqldatabase.com:3306/";
		String dbName = "sql11226963";

		String driver = "com.mysql.jdbc.Driver";
		String userName = "sql11226963"; 
		String password = "A6DJWbxVgN";

		Class.forName(driver).newInstance();
		    Connection conn = DriverManager.getConnection(url+dbName,userName,password);
		    Statement stmt = conn.createStatement() ;
		    ResultSet rs;
		    
		    rs = stmt.executeQuery("SELECT * FROM Account");
		    System.out.println("CustomerID\tCustomerName\tStreetName\tZIP\tTown\tCountry\tTypeOfCustomer\tAccountNumber\tTotal\tClearing");
			while (rs.next()) {
				String CustomerID = rs.getString("CustomerID");
				String CustomerName = rs.getString("CustomerName");
				String StreetName = rs.getString("StreetName");
				String ZIP = rs.getString("ZIP");
				String Town = rs.getString("Town");
				String Country = rs.getString("Country");
				String TypeOfCustomer = rs.getString("TypeOfCustomer");
				String AccountNumber = rs.getString("AccountNumber");
				String Total = rs.getString("Total");
				String Clearing = rs.getString("Clearing");
				System.out.println("\t" + CustomerID + "\t" + CustomerName + "\t" + StreetName + "\t" + ZIP + "\t" + Town + "\t" + Country + "\t" + TypeOfCustomer + "\t" + AccountNumber + "\t" + Total + "\t" + Clearing);
			}
		

	}

}
