package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class JDBCBoard {

	public static void main(String[] args) {
		
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고 게시판 프로그램을 만들어 주세요 
		 * 데이터 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO,TITLE,CONTENT,USER_ID,REG_DATE
		 * 
		 * 1. 게시판 List
		 * 2. 게시판 등록
		 * 3. 게시판 상세보기 
		 * 4. 게시판 수정 
		 * 5. 게시판 삭제 
		 * 
		 * JDBC순서 
		 * 1. url,user,password -> DB에 접근할 모든 곳에 공통-->어떻게 해놓으면 좋을까요?
		 * 2.DB접속=>Connection객체 ->url->ip,port,sid
		 * 3.Query생성 
		 * 4.질의 -> PreparedStatement
		 * 5.결과 저장->ResultSet
		 * 6.자원반납 close()
		 */
		
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();

		while (true) {
			System.out.println("-----------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-----------------------------");
			for (int i = boardList.size() - 1; i >= 0; i--) {
				HashMap<String, Object> board = boardList.get(i);
				System.out.println(board.get("board_no") + "\t"
						+ board.get("title") + "\t" + board.get("user") + "\t"
						+ board.get("reg_date"));
			}
			System.out.println("-----------------------------");
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				read(boardList);
				break;
			case 2:
				insert(boardList);
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}

	}

	private static void insert(ArrayList<HashMap<String, Object>> boardList) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc14";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		
		
		System.out.print("번호>");
		String boardNo = ScanUtil.nextLine();
		
		
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("이름>");
		String users = ScanUtil.nextLine();

		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "insert into TB_JDBC_BOARD (BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE)  values (?, ?, ?, ?, sysdate)";
			ps = con.prepareStatement(sql);
			ps.setObject(1, boardNo);
			ps.setObject(2, title);
			ps.setObject(3, content);
			ps.setObject(4, users);

			int result = ps.executeUpdate();
			con.commit();

			System.out.println(result + " 행 추가되었습니다");

			sql = "select * from TB_JDBC_BOARD where BOARD_NO = ? ";
			ps = con.prepareStatement(sql);
			ps.setObject(1, boardNo);
			rs = ps.executeQuery();
			while (rs.next()) {
				HashMap<String, Object> board2 = new HashMap<>();
				board2.put("board_no", rs.getObject("BOARD_NO"));
				board2.put("title", rs.getObject("TITLE"));
				board2.put("content", rs.getObject("CONTENT"));
				board2.put("user", rs.getObject("USER_ID"));
				board2.put("reg_date", rs.getObject("REG_DATE"));
				boardList.add(board2);
				System.out.println("게시물 등록이 완료되었습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			if (rs != null)try {rs.close();} catch (Exception e) {}
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e) {}
		}


	}

	private static void read(ArrayList<HashMap<String, Object>> boardList) {
		System.out.print("게시글 번호 입력>");
		String no = ScanUtil.nextLine();

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc14";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "select * from TB_JDBC_BOARD where BOARD_NO = ? ";
			ps = con.prepareStatement(sql);
			ps.setObject(1, no);
			rs = ps.executeQuery();

			while (rs.next()) {

				HashMap<String, Object> board = new HashMap<>();

				System.out.println("-----------------------------");
				System.out.println("번호\t: " + rs.getObject("BOARD_NO"));
				System.out.println("작성자\t: " + rs.getObject("USER_ID"));
				System.out.println("작성일\t: " + rs.getObject("REG_DATE"));
				System.out.println("제목\t: " + rs.getObject("TITLE"));
				System.out.println("내용\t: " + rs.getObject("CONTENT"));
				System.out.println("-----------------------------");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * HashMap<String, Object> board = new HashMap<>();
		 * System.out.println("-----------------------------");
		 * System.out.println("번호\t: " + board.get("board_no"));
		 * System.out.println("작성자\t: " + board.get("user"));
		 * System.out.println("작성일\t: " +board.get("reg_date"));
		 * System.out.println("제목\t: " + board.get("title"));
		 * System.out.println("내용\t: " + board.get("content"));
		 * System.out.println("-----------------------------");
		 */

		HashMap<String, Object> board = new HashMap<>();
		for (int i = 0; i < boardList.size(); i++) {
			if ((String) boardList.get(i).get("board_no") == no) {
				board = boardList.get(i);
				break;
			}
		}

		System.out.println("1.수정\t2.삭제\t0.목록");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();

		switch (input) {
		case 1:
			update(board);
			break;
		case 2:
			delete(boardList, board);
			break;

		}

	}

	private static void update(HashMap<String, Object> board) {
		
		
		
		
		
		
		
		
		
		
		

	}

	private static void delete(ArrayList<HashMap<String, Object>> boardList,
			HashMap<String, Object> board) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc14";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		System.out.print("삭제할 게시글 번호 입력>");
		String boardNo = ScanUtil.nextLine();

		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "DELETE   FROM TB_JDBC_BOARD  WHERE   BOARD_NO = ? ";
			ps = con.prepareStatement(sql);
			ps.setObject(1, boardNo);

			int result = ps.executeUpdate();
			con.commit();
			System.out.println(result + " 행 삭제되었습니다");

			for (int i = 1; i <boardList.size(); i++) {
				if (boardList.get(i).get("board_no") == boardNo) {
					boardList.remove(i);
					System.out.println("삭제가 완료되었습니다.");
					break;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (rs != null)try {rs.close();} catch (Exception e) {}
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e) {}
		}

	}

}
