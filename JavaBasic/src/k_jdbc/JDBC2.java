package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc14";
		String password = "java";
		
		
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con= DriverManager.getConnection(url,user,password);
			
			
			String sql = "select * from cart where cart_member = ?";
			//String sql = "select * from cart where cart_member like '%' || ? || '%'"; //like쓰는 문
			ps=con.prepareStatement(sql); 
			ps.setString(1, "a001"); //cart_member = ?에 관한 값을 여기서 정한다, 숫자1은 select문에 조건 첫번째 물음표를 나타내는 것이다
			//ps.setInt(parameterIndex, x);
			//ps.setDate(parameterIndex, x);
			//ps.setObject(parameterIndex, x); 모든값을 받아올수있다
			
			rs=ps.executeQuery();
			
			ResultSetMetaData md=rs.getMetaData();//메타데이터 : 데이터에 대한 데이터 
			int columnCount =md.getColumnCount(); //컬럼수알수있는 메서드
			
			while(rs.next()){ //값 출력방법
			 for (int j = 1; j <=columnCount; j++) {
				 System.out.print(md.getColumnName(j)+" : ");//컬럼이름을 나타내는 매서드
					Object value=rs.getObject(j);
					System.out.print(value +"\t");
			}
				System.out.println();
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
