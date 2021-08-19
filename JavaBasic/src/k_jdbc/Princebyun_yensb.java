package k_jdbc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class Princebyun_yensb {

	public static void main(String[] args) {
		
		
		new Princebyun_yensb().start();

	}
	
	
	private JDBCUtil jdbcUtil= JDBCUtil.getInstance();
	
	private void start() {
		
	
	while(true){	
	System.out.println("===================================");	
	System.out.println("===========게시판====================");
	String sql = "select * from tb_jdbc_board";
	List<Map<String,Object>>list = jdbcUtil.selectList(sql);
	for (Map<String, Object> board : list) {
		System.out.println(board.get("BOARD_NO"));
		System.out.println(board.get("TITLE"));
		System.out.println(board.get("CONTENT"));
		System.out.println(board.get("USER_ID"));
		System.out.println(board.get("REG_DATE"));
	}
	System.out.println("1.입력하기\t2.조회하기\t3.종료하기");
	System.out.println("===================================");
	int input = ScanUtil.nextInt();
	
	switch(input){
	
	case 1: 
		insertboard();
		break;
		
	case 2:
	


		break;
		
	case 3: 
		System.out.println("프로그램이 종료되었습니다");
		System.exit(0);
		break;
	
			}

		}

	}

	
	
	private void insertboard() {
		
	 System.out.println("제목을 입력하시오: ");
		String title = ScanUtil.nextLine();
		System.out.println("아이디를 입력하시오");
		String userid = ScanUtil.nextLine();
		System.out.println("내용을 입력하시오");
		String content = ScanUtil.nextLine();
		
		List<Object> list= new ArrayList<>();
		list.add(title);
		list.add(userid);
		list.add(content);
		list.add( new Date(new java.util.Date().getTime()));
		String sql="insert into tb_jdbc_board values(("
				+ "select nvl(max(board_no), 0) + 1 from tb_jdbc_board"
				//+"testseq_seq.nextval" //시퀀스를 사용하는 경우
				+ "),?,?,?,?)";
		jdbcUtil.update(sql, list);
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
