package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Finally {

	public static void main(String[] args) {
		
		/*
		 * -finally
		 * 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다. 
		 * finally는 예외의 발생 여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * -자동 자원 반환
		 * try(변수선언;변수 선언) {} catch(Exception e) {}
		 * 사용후 반환이 필요한 객체를 try의 ()안에서언선하면  try 블럭 종료시자동으로 반환된다
		 */

		
	  FileInputStream fis=null;//파일 읽기
	  
		try {
			fis = new FileInputStream("d:/file.text");
		} catch (FileNotFoundException e) {// FileNotFoundException : 파일을 읽어들이기위한 클래스
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();// 사용하고 난 후 닫아야한다
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 
	 
		//자동 자원 반환
		try(FileOutputStream fos = new FileOutputStream("d:/file.text") ){
			String str="아무내용이나 글을 적어봅니다...";
			
			byte[] bytes=str.getBytes();
			
			for(int i = 0; i < bytes.length; i++){
				fos.write(bytes[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
	
}
