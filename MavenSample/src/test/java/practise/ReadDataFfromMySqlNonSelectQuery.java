package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDataFfromMySqlNonSelectQuery {

	public static void main(String[] args) throws Throwable {
		//Step 1: Register or load the MySql database
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		//Step 2: Get connect to database
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		//step 3: cretae sql statement
		Statement stat = conn.createStatement();
		
		String query = "insert into studentdata(first_name,last_name,address)values('devesh','kumar','bangalore')";
		
		//step 4: Execute query
		int result = stat.executeUpdate(query); //primitive datatype content level comparison
		                                        //non-primitive datatype address level comparison
		if(result==1)
		{
			System.out.println("user is created");
		}
		else
		{
			System.out.println("user is not created");
		}

		//step 5: close the connection
		conn.close();
	}

}
