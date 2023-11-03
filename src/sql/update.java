package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
	         Connection  con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","kumudha");
	         Statement  st=con.createStatement();
	         
	         String sqlupdate="update insertt set name='bow' where id=4 ";
				System.out.println("the sql statement is"+sqlupdate+"\n");
				int countup=st.executeUpdate(sqlupdate);
				System.out.println(countup+"record updated\n");
				
	   }
		catch(SQLException e)
		{
			e.printStackTrace();
		}

}
}