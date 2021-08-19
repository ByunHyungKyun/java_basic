package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBC {

	public static void main(String[] args) {
	
		
		/*
		 * JDBC
		 * 자바와 데이터베이스를 연결해주는 라이브러리 
		 * ojdbc : 오라클JDBC
		 * 
		 *JDBC작성단계
		 *1.Connection 생성(DB연결)
		 *2.Statement 생성(쿼리생성)
		 *3.Query실행 
		 *4.ResultSet에서 결과추출 (select인  경우 )
		 *5.ResultSet,.Statement,Connection 닫기 
		 */
		
		
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc14";
		String password = "java";
		
		
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
	
		try {
			//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
			con = DriverManager.getConnection(url,user,password);
			
			String sql="select * from member";
			ps = con.prepareStatement(sql); //쿼리만들기
			
			//select일때
			rs = ps.executeQuery(); //rs에 쿼리를 조회한 값이 담겨있다
			
			//insert,update,delete일때
			//int result =ps.executeUpdate(); //몇개의 row가 영향을 받았는지 반환해준다
			
			while(rs.next()){//결과를 하나씩 꺼내는 메서드
				
				//가지고오는 자료형에따라 타입을 다르게 해줘야한다
				System.out.println(rs.getString(1)); //원하는 컬럼을 꺼내는 방법 1.컬럼의 순서조회
				System.out.println(rs.getString("mem_name"));//원하는 컬럼을 꺼내는 방법 2.컬럼의 이름조회(ALIAS를 써도 된다)
				//rs.getInt(1);   예시
				//rs.getDate(1);  예시
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
