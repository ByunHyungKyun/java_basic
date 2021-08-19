package e_oop;


public class oop {

	public static void main(String[] args) {
		
		/*
		 * 객체지향 프로그래밍
		 * 프로그래밍을 단순히 코드의 연속으로보는것이 아니라객체간의 상호작용으로 보는것
		 * 코드의 재사용성이 높고유지보수가 용이하다
		 */
		
		
		SampleClass sc = new SampleClass();
		
		
		System.out.println(sc.field);
		
		
		sc.method1();
		String returnValue =sc.method2(10);
		System.out.println(returnValue);
		
		
		
		sc.flowTest1();

		
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요
		//객체가저장된 변수를 통해 메서드를 호출해주세요
		//파라미터가있는 메서드는 타입에 맞는 값을 넘겨주시고,리턴타입이 있는 메서드를 리턴받은 값을 출력해주세요
		
		ClassMaker byun=new ClassMaker();
		
		
		byun.a();
		
		System.out.println(byun.b());
		
		byun.c(100);
		
		System.out.println(byun.d(10, 20));

		
		
	
		
		//계산기만들기
		Calculator cal=new Calculator();
		double result=cal.sum(123456, 654321);
		result=cal.gob(result, 123456);
		result=cal.na(result, 123456);
		result=cal.bba(result, 654321);
		result=cal.nam(result, 123456);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
