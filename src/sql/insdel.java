package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class insdel {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insert and delete 
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","kumudha");
			Statement st=con.createStatement();
			{
				//insert a record 
				String ins="insert into insertt values (1,'ajju')";
				System.out.println("the sql statement is: "+ins);
				 int count = st.executeUpdate(ins);
				 System.out.println(count+"records inserted into k\n");
				//delete a record
				 
				 String del="delete from insertt where id=1";
				 System.out.println("the sql statement is: "+del);
				 int c = st.executeUpdate(del);
			 System.out.println(c+"record deleted");
			
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
