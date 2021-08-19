package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {
	
	
	//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
	
	private JDBCUtil(){ //다른곳에서는 이객체를 만들수없다->이클래스내부에서만 만들수있다	
		
	}	
	//인스턴스를 보관할 변수 
	private static JDBCUtil instance;;
	
	//인스턴스를 빌려주는 메서드 
	public static JDBCUtil getInstance(){
		if(instance == null){ //아직 객체를 만들지 않아서 값이 null이다
			instance=new JDBCUtil();
		}
		
		return instance;
	}
	
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "pc14";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	/*
	 * 한줄조회
	 * Map<String,Object>selectOne(String sql)//물음표 없을때
	 * Map<String,Object>selectOne(String sql,List<Object>param)//물음표있을때
	 * 
	 * 전체조회
	 * List<Map<String,Object>>selectList(String sql)//물음표 없을때
	 *  List<Map<String,Object>>selectList(String sql,List<Object>param)//물음표 있을때
	 *  
	 * select를 제외한 나머지를 쓸때 쓴다
	 *  int update(String sql) //물음표 없을때
	 *  int update(String sql,List<Object>param) //물음표 있을때
	 */
	
	
	public List<Map<String,Object>>selectList(String sql, List<Object>param){
		List<Map<String,Object>> list =new ArrayList<>();

		try {
			con = DriverManager.getConnection(url, user, password);

			ps=con.prepareStatement(sql);

			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}
			rs = ps.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();

			while (rs.next()) {
				HashMap<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
					} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

		return list;

	}

	public List<Map<String,Object>>selectList(String sql){
		List<Map<String,Object>> list =new ArrayList<>();
		
	    try {
			con = DriverManager.getConnection(url, user, password);
			
			ps=con.prepareStatement(sql);
			rs =ps.executeQuery();
			
			ResultSetMetaData metaData =rs.getMetaData();
			int columnCount = metaData.getColumnCount();

			while (rs.next()) {
				HashMap<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		return list;
		
	}

	
	public Map<String,Object>selectOne(String sql){
		Map<String,Object> row =null; //한줄조회를 했는데 조회가 되지않을경우를 대비해서 null이다
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps= con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData =rs.getMetaData();
			int columnCount = metaData.getColumnCount();

			
         while(rs.next()){
        	 row =new HashMap<>();
        	 for (int i = 1; i <= columnCount; i++) {
        		row.put(metaData.getColumnName(i),rs.getObject(i));  
			} 
         }	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return row;
	}
	
	
	public Map<String, Object> selectOne(String sql, List<Object> param) {
		Map<String, Object> row=null; //이건그냥뱐수일뿐

		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);

			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}

			rs = ps.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();

			while (rs.next()) {
				 row= new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

		return row;
	}
	

	
	public int update(String sql) {
		int result = 0;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);

			result = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		return result;

	}
	
	
	
	public int update(String sql, List<Object> param) {
		int result = 0;

		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);

			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}

			result = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

























































