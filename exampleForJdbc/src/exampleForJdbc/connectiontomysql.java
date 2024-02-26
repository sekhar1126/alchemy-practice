package exampleForJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectiontomysql {

	public static void main(String[] args) throws Exception{
		String url ="jdbc:mysql://localhost:3306/csk";
		String uname ="root";
		String pass="sekhar1126";
		String query = "select  name from students_list where roll_no=1";
//Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection(url,uname,pass);
     if (con==null) {
      System.out.println("not connected");
 
     }else {
	System.out.println(" connected");	

     }

     Statement st = con.createStatement();

     ResultSet rs = st.executeQuery(query);

     rs.next();

     String name = rs.getString("name");

     System.out.println(name);

     st.close();

     
 
	
	}
}
