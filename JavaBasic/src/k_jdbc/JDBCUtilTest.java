package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JDBCUtilTest {

	public static void main(String[] args) {

		
		JDBCUtil jdbc = JDBCUtil.getInstance();

		String sql = "select * from cart where cart_member = ?";

		List<Object> param = new ArrayList<>();
		param.add("a001");
		List<Map<String, Object>> list = jdbc.selectList(sql, param);
		System.out.println(list);

		sql = "select * from prod";
		List<Map<String, Object>> list2 = jdbc.selectList(sql);
		System.out.println(list2);

		
		
		sql = "select * from member where mem_id = 'b001'";
		Map<String, Object> list3 = jdbc.selectOne(sql);
		System.out.println(list3);

		
		
		sql = "select * from member where mem_id = ? ";
		List<Object> param3 = new ArrayList<>();
		param3.add("d001");
		Map<String, Object> list4 = jdbc.selectOne(sql, param3);
		System.out.println(list4);

		
		
		sql = "insert into tb_jdbc_board(board_no,user_id,title,content) values('23','sdfsf','fsdf','asdgfdfg')";
		int a = jdbc.update(sql);
		if (0 < a) {
			System.out.println("수정이 완료되었습니다.");
		}

		
		
		sql = "insert into tb_jdbc_board(board_no,user_id,title,content) values(?,?,?,?)";
		List<Object> param2 = new ArrayList<>();
		param2.add("2");
		param2.add("sdfsdf");
		param2.add("asdasd");
		param2.add("sdfsdf");
		int b = jdbc.update(sql, param2);
		if (0 < b) {
			System.out.println("수정이 완료되었습니다.");
		}
		
		

	}

}
