package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class princeb {

	public static void main(String[] args) {
		
		

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc14";
		String password = "java";
		
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		try {
			con= DriverManager.getConnection(url,user,password);
			
			String sql = "select * from prod where prod_id like  'P3%' ";
			ps=con.prepareStatement(sql); 
			rs = ps.executeQuery();
		
			while(rs.next()){
				System.out.println(rs.getObject("prod_id"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			if(rs !=null)try{rs.close();}catch(Exception e ){}
			if(ps !=null)try{ps.close();}catch(Exception e ){}
			if(con !=null)try{con.close();}catch(Exception e ){}
		}
		
		
		
		
		

	}

}
