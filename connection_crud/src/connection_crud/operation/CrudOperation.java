package connection_crud.operation;
	import java.sql.*;
	import javax.sql.*;
    import connection_crudoperation.Makeconnection;
	public class CrudOperation {
		
	   static	Statement st;
	   static	Connection cn;
		
		public 	CrudOperation(){
		cn = Makeconnection.getConnection();	
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}  
		
		}
		
		public static void insertData(String id,String name,String age,String email,String  enrollment_date) {
		
	String squery = "insert into students values('"+ id + "','" + name +"','" + age +"','" + email + "','" +  enrollment_date +"')";
	System.out.println(squery);
			try {
				int r = st.executeUpdate(squery);
				System.out.println(r);
				if(r>0) {
					System.out.println("record inserted .....");
				}
				
			} 
			catch(SQLIntegrityConstraintViolationException sq) {
				System.out.println("can not duplicate email id value");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}  
		   
			
			
		}
		public static void updateData() {
			
		}
		public static void deleteData(String id) {
		
			String sq = "delete from students  where id='"+id+ "'";
			try {
				int k = st.executeUpdate(sq);
				if(k>0) {
					System.out.println("Record Deleted");
				}
			} catch (SQLException e) {
				 
				e.printStackTrace();
			}
	}
		
		
		public static void getData() {
			String sq = "select * from students";
			try {
			 ResultSet r =	st.executeQuery(sq);
			 
			 while(r.next()) {
				 
			System.out.println(r.getString(1)+ "  "+ r.getString(2) + "  " + r.getString(3) + "  " + r.getString(4)+ "  " + r.getString(5));	 
				 
			 }
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		

	}


