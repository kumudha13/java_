package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class select {
	
	
	

		private static int r;

		public static void main(String[] args)throws SQLException 
		{
			// TODO Auto-generated method stub
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","kumudha");
			Statement st=con.createStatement();
			//query excecution
			String s = "select * from insertt";
			System.out.println("sql statement is "+s);
			ResultSet res = st.executeQuery(s);
			System.out.println("records are ");
			setR(0);
			while(res.next())
			{
				int id =res.getInt("id");
				String name =res.getString("name");
				System.out.println(id+" name  is"+ name );
				setR(getR() + 1);
				
				
			}
			
		
	  }

		public static int getR() {
			return r;
		}

		public static void setR(int r) {
			select.r = r;
		}
	}


