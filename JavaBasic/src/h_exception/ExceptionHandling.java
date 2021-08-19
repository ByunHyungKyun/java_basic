package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {

		
		
		/*
		 * -에러
		 * 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄) 
		 * 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * 런타임 에러 : 실행 시에 발생되는 에러
		 * 
		 * -런타임 에러 
		 * 런타임 에러 발생 시 발생한 위치에서 프로그램이 비정상적으로 종료된다. 
		 * 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리 불가) 
		 * 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (처리 가능)
		 * 
		 * -예외 
		 * 모든 예외는 Exception 클래스의 자식 클래스이다. 
		 * RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다. 
		 * [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스 자식들은 예외처리가 강제된다.
		 * 
		 * -예외처리(try-catch)
		 * 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다. 
		 * try { } catch(Exception e) { } → 블럭안의 내용과 파라미터의 타입이 같아야 한다. 
		 * try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다. 
		 * catch의 ( )안에는 처리할 예외를 지정해줄 수 있다. 
		 * 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다. 
		 * 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다. 
		 * 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 */
		
		try{
			int result=10/0;
			System.out.println(result);	
		}catch(ArithmeticException e){
			e.printStackTrace();//예외를 했다는것을 출력해주는 메소드
		}catch(NullPointerException | IndexOutOfBoundsException e){ //가장많이나타나는 에러
			 //IndexOutOfBoundsException 일어날때 예:
			int[] arr=new int[10];
			System.out.println(arr[10]);
			//NullPointerException 일어날때 예:
			String str=null;
			System.out.println(str.equals(""));
			
		}catch(Exception e){//이것만 붙이면 모든 에러를 나타낼수있다
			
		}
		
		
		
			
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 * CallStack 
		 * |_test2()_| 
		 * |_test1()_| 
		 * |_main()__|
		 * 위에있는것을 삭제해야 밑에있는것을 삭제할수있다
		 * 위에서 들어가고 위에서 나가는 구조,제일 마지막 데이터는 그 위에 쌓인 데이터가 나가야 나갈 수 있다.
		 * 
		 */

		test1();
		
		
	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
		//System.out.println(10/0);
		
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}






























