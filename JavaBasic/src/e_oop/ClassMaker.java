package e_oop;

public class ClassMaker {
	
	
	//전역변수 하나를 선언 및 초기화를 해주세요
	String str="ABC";
	
	//리턴타입과 파라미터가없는 메서드 하나를 만들어 주세요
	//메서드 안에서전역변수를 출력해주세요
	
	void a(){
		System.out.println(str);
	}
	
	//전역변수와동일한 타임의 리턴타입이 있고 파라미터가 없는 메서드 하나를 만들어 주세요
	//메서드 안에서 전역변수를 리턴해주세요
	
	String b(){
		return str;
	}
	
	//리턴타임은 없고 파라미터가 있는 메서드 하나를 만들주세요
	//메서드안에서 파라미터를 출력주세요
	
	void c(int q){
		System.out.println(q);
	}
	
	//int타임의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어 주세요
	//메서드 안에서두 파라미터를 곱한 결과를 리턴해주세요 
	
	int d(int a,int b){
		return a*b; //1.메서드를 종요시키는 역할  2.값을 넘겨주는 역할
	}
	
	
	
	
	
	
	
	
	
}
