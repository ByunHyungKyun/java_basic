package b_operator;

public class LogicalOperator_0113 {

	public static void main(String[] args) {
		
		
		/*
		 * 논리연산자
		 * &&(AND),||(OR),!(NOT)
		 * 피연산자로 boolean만 허용한다
		 */
		
		int x=10;
		int y=20;
		boolean b = 0<x && x<10 || x<y;
		//||보다 &&의 우선순위가 높다.
		
		b=!(x<y);//조건식의 결과를 반대로 저장한다,not은  비교하고 싶은것 끼리 ()를 해야한다
		
		//효율적연산
		b=true && true; //true
		b=true && false; //false
		b=false && true; //false
		b=false && false; //false
		
		b=true || true; //true
		b=true || false; //true
		b=false || true; //true
		b=false || false; //false
		//왼쪽의피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다
		
		int a=10;
		b=a<5 && 0<a++;
		System.out.println(a);
		
		//다음의 문장들을 코드로작성하시오
		//1. x가 y보다크고,x가10보다 작다
		b=x>y && x<10;
		//2.x가 짝수이고 x가y의배수이다
		b=x%2==0 && x%y==0;
		//3.x가3의배수이거나,x가 5의 배수이다
		b= x%3==0 || x%5==0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
