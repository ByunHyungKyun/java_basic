package e_oop;

public class Static {

	/* 
	 * static을 붙이면 프로그램 실행시 메모리에올라간다
	 * 객체생성을 하지않아도 사용할수있다
	 * static을 붙인 변수는 객체간에 변수의값을 공유한다
	 * static이 붙은 멤버의 명칭 : 클래스변수,클래스메서드 
	 * static이 붙지 않은 멤버의 명칭 : 인스턴스변수,인스턴스메서드
	 */
	

	//변수의값을 공유하기위해 static을 붙인다
	static int var;//전역변수에만 static을 붙일수있다
	
	public static void main(String[] args) {
		
		Human 철수 =new Human();
		Human 영희 =new Human();
		
		철수.saveMoney(100000);
		영희.saveMoney(200000);
		
		철수.saveDataMoney(200000);
		영희.saveDataMoney(200000);
		
		System.out.println(Math.random());
		
		
		System.out.println("문자열 입력");
		String str=ScanUtil.nextLine();
		System.out.println("입력받은 문자열: "+str);
		
		System.out.println("숫자입력");
		int num=ScanUtil.nextInt();
		System.out.println("입력받은 숫자열: "+num);
	}
}


class Human{
	int account; //계좌,통장  필드
	void saveMoney(int money){ //메서드
		account +=money;
		System.out.println("통장잔고: "+account);
	}
	
	static int dataAccount;//계좌,통장  필드,값을 공유하기 위해서 static을 붙이는 것이다 
	void saveDataMoney(int money){ //메서드
		dataAccount +=money;
		System.out.println("데이트 통장잔고: "+dataAccount);
		
	}
}