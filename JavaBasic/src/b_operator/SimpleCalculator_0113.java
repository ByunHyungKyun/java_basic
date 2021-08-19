package b_operator;

import java.util.Scanner;

public class SimpleCalculator_0113 {

	public static void main(String[] args) {
		
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만드시오
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오");
		int a=Integer.parseInt(sc.nextLine());
		
		System.out.println("사용할 기본연산자를 입력하시오");
		String b=sc.nextLine();
		
		System.out.println("두번째 숫자를 입력하시오");
		int c=Integer.parseInt(sc.nextLine());
		
	    double d= b.equals("+") ? (a+c) :b.equals("-") ?(a-c) :b.equals("*") ?(a*c) :b.equals("/") ?(a/c) :0;
		
	 
		
		/*  int e=b.equals("+") ? (a+c) :
	    	      b.equals("-") ? (a-c) :
	    		  b.equals("*") ? (a*c) :
	    		  b.equals("/") ? (a/c) :
	    		  a%c;
		*/ //선생님이 짜신 코드
		
		 		        				        				
		System.out.println("계산한 결과값은 "+d+"입니다");
		

	}
	

}
