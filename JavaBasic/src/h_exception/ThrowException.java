package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		
		
		/*
		 * 예외발생시키기
		 * throw new Exception( );
		 * throw 예약어와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 */

		
		IOException ioe = new IOException( );

		try {
			throw ioe;
		}catch (IOException e) {
			e.printStackTrace();
		} //이런게 있다 그냥 알아만두자
				
		throw new NullPointerException(); //예외처리를 하지 않아도 된다.
		
		

	}

}














