package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcConnection {

	public static void main(String[] args) throws Throwable {
		
		//step 1: register or load mysql database
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step 2: get connect to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		//step 3: create sql statement
		Statement stat = conn.createStatement();
		
		String selectquery = "select * from studentdata";
		
		//step 4: Execute statement/query
		ResultSet result = stat.executeQuery(selectquery);
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
			
		}
		
		//step 5: close the database connection
		conn.close();
	}

}
