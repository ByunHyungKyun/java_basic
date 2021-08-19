package a_variable;  //클래스의 위치 설명

import java.util.Scanner;
//ctrl+shift+o(알파벳)-임포트 단축키


public class variable_0112{ //클래스 이름 설명
	public static void main(String[] args) { //메소드 이름()가붙은것-이름 뒤에 소괄호가 붙는게메소드
		//메소드 : 명령문들이 모여있는것
		//main이름을 가진메소드는 프로그램의 시작과 끝을 담당
		//한줄 주석 : ctrl + shift + c
		//범위 주석 : ctrl + shift + /(해제는 \) 
		//변수를 만드는 방법 :데이터의형태(데이터타입) +이름
		int x; //정수를 지정할수있는 x라는 이름을 가진 그릇을 만들어라=변수
		//변수를 만드는 것을 변수를 선언한다고 표현한다
//		double x;//블럭[]안에서 이름을 중복될수없다
		double y;//대입연산자 : 오른쪽의 값을 왼쪽의 변수에 저장
		x=10;//초기화 : 변수에 처음으로 값을 저장하는것
		y=3.14;//변수의 타입에 맞는 값을 저장해야한다
		int abc=30; //일반적으로 선언과 동시에 초기화를 해준다
		long l=40L;//접미사L을 붙어야 long타입이 된다 
		float f = 5.5f;//접미사f를 붙여야 float타입이 된다
		char c='한';//따옴표안에 반드시 한글자를 넣어야 한다
		boolean D=true;//true,false 둘중하나 저장
		
		//8가지 기본형타입을 사용하여 8개의변수를 선언 및 초기화 하기 
		int a=4;
		byte aa=1;
		short aaa=2;
		long aaaa=4L;
		float aaaaa=4.4f;
		double aaaaaa=3.33;
		char aaaaaaa='궁';
		boolean aaaaaaaa=false;
		x=20;//기존에 저장 되어있는 10이라는 것은 사라지고 20이라는 값이 저장된다
		y=5.5;
		
		//위에서 만든 8개의 변수에 새로운 값을 저장하기 
		a=2;
		aa=4;
		aaa=6;
		aaaa=8L;
		aaaaa=10.44f;
		aaaaaa=10.1;
		aaaaaaa='일';
		aaaaaaaa=true;
		
		//콘솔창에 출력
		System.out.println(x);
		
		//실행 단축키 : ctrl+f11 
		System.out.println(100);
		
		//위에 만든 8개의 값 출력하기 
		System.out.println(a);
		System.out.println(aa);
		System.out.println(aaa);
		System.out.println(aaaa);
		System.out.println(aaaaa);
		System.out.println(aaaaaa);
		System.out.println(aaaaaaa);
		System.out.println(aaaaaaaa);
		
		//문자열
		String str="문자 여러개...";//클래스는 참조형타입 데이터이다
		System.out.println(str);
		
		//문자열과 다른타입의 데이터가 결합되면 문자열의 결과가 출력된다
		System.out.println(str+50);//50은 String으로 바뀌게 된다 
		System.out.println(str+50+30);//숫자가 합쳐지지않고 그대로 출력된다 
		System.out.println(50+30+str);//숫자가 앞으로 나오면 계산이 되고 문장이 나온다
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환이라 한다 
		int small=10;
		long big=10L;
		small=(int)big;//괄호안에 바꾸고 싶은 타입을 쓰면 바뀌게 된다 
		big=small;//크기에 따라 작은게 큰것으로변하면 생략이 가능하다(그릇을 생각하면 이해하기 쉽다 )
		
		/* 
		 * 명명규칙
		 * -영문자 대소문자, 한글,숫자, 특수문자('_','&')를 사용할수 있다
		 * -숫자로 시작할수 없다 
		 * -예약어는 사용할수없다(int,long 등 선언한것을 예약어라 한다,색이 다른거 )
		 * -[낙타식 표기법을 사용한다,(mySampleVarlable)앞글자를 제외한 다른 시작한 글자를 대문자쓴다-변수 또는 메소드(메소드는 괄호를 붙인다)]
		 * -[클래스의 첫글자를 대문자로 한다.(MySampleClass)]
		 */
		
		/* 
		 * 상수규칙
		 * -값을 변경할수없는 그릇
		 * -리터럴에 의미를 부여하기 위해 사용한다
		 */
		final int MAX_NUMBER=10;
//		MAX_NUMBER=20;//값을 바꿀수 없어서 에러가 난다
		
		//출력규칙
		System.out.print("줄바꿈을 하지 않는다");//ln이 있고 없고 차이,출력하면 바로뒤에 출력된다
		System.out.println("줄바꿈을 한다");
		System.out.print("줄바꿈을 하지 않는다\n");//\n을 넣으면 줄바꿈이 된다 
		System.out.println("줄바꿈을 한다");
		System.out.println("줄바꿈을 \t한다");//\t는 탭기능을 수행한다
		System.out.printf("문자열:%s, 숫자:%d", "안녕",10);//출력 포맷을 지원한다 ,%s는 문자, %d는 숫자 
		System.out.println();
		
		//입력
		Scanner sc = new Scanner(System.in);//입력받기 위한 클래스,맨위에서 임포트를 선언해줘야한다
		
		
		
		//정상적인 문자열 
		/*System.out.println("아무거나입력해주세요");
		String str2 = sc.nextLine();//nextline은 문자열을 받을수 있다 
		System.out.println("입력받은 내용 : "+str2);
		*/
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//입력을 받게되면 사용자가 입력 할때까지 프로그램이 멈추게 된다 
		//내용을 입력후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다 
		/*System.out.println("Int 입력>");
		int nextInt = sc.nextInt();//nextInt는 숫자열을 받을수 있다 버그가 있는데 그것은 뒤에 문자열을 받을수있다 
		System.out.println("입력받은 숫자"+nextInt);
		*/
		
		//앞에 숫자열 버그떄문에 영향받는 문자열
		/*System.out.println("문자열 입력 ");
		String nextLine = sc.nextLine();//nextline은 문자열을 받을수 있다 
		System.out.println(nextLine);
		System.out.println("입력끝!");
		*/
		
		
		/*
	    //버그 없는 숫자 받는법
		System.out.println("int 입력");
		int number=Integer.parseInt(sc.nextLine());//intrger.parseInt를 사용해야 문자열로 숫자열을 받을수 있다 ,대신 문자는 받을수없다 
		System.out.println(number);
		*/
	
		
		//자신의 이름을 저장할 변수를 선언해주세요 
		String name;
		
		//위에서 서언한 변수를 초기화 하기 위해 이름을 입력받아주세요 
		System.out.println("이름을 입력해주세요");
		name = sc.nextLine();
		
		//자신의나이를 저장할 변수를 선언해주세요 
		int age;
		
		//위에서 선언한 변수를 초기화하기위해 나이를 입력받아 주세요 
		System.out.println("나이를 입력하세요");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("이름: "+name+ "\t나이: "+age);
		
		
		
	}
}
