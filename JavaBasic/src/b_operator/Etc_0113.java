package b_operator;

import java.util.Scanner;

public class Etc_0113 {

	public static void main(String[] args) {
		
		/*
		 * 비트연산자
		 * |,%,^,-,<<,>>
		 * 비트단위를 연산한다
		 * 
		 * 기타연산자
		 * (창조연산자) = 특정범위내에 속해있는 멤버를 지칭할때 사용한다
		 * (type) = 형변환
		 * ?:(삼항연산자)= 조건식            ?조건식이 참일경우 수행할문장       :조건식이 거짓일경우 수행할문장
		 */
		
		
		//1byte : 01010101 이렇게 생겼다
		System.out.println(10|15); // | : 둘다0인 경우 0 그외 1
		//10 : 00001010
		//15 : 00001111
		//결과 : 00001111=15
		
/*
		int x=10;
		int y=20;
		int result=x<y  ?x  :y; //int result=x; 라는 뜻을 나타낸다
		System.out.println(result);
		
		//주민등록번호 뒷자리의첫번째 숫자가1이면남자 2이면여자 
		int regNo;
		Scanner sc=new Scanner(System.in);
		regNo=sc.nextInt();
		
		String gender=regNo==1 ?"남자" :"여자";
		System.out.println("당신의성별은 : "+gender+"입니다.");
		
		gender=regNo==1?"남자" : (regNo==2?"여자":"확인불가");
		System.out.println("당신의 성별은 "+gender+"입니다");
		*/
		
		//2개의 숫자를 입력받고,둘중 더큰 숫자를 출려해주세요 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오: ");
		int aa=sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오: ");
		int bb=sc.nextInt();
		
		int re=aa<bb  ?bb :aa ;
		System.out.println("두개의숫자중 더 큰 숫자는 "+re+"입니다");
		
		
		//숫자를 입력받고,그숫자가 1이나 3이면 남자를 2나 4이면 여자를 출력해주세요
		//그외의 숫자를 입력하면확인불가를 출력해주세요
		
		System.out.println("남자이면 1,3을 누르시고 여자이면2,4를 눌러주세요");
		int cc=sc.nextInt();
		String dd= cc==1 || cc==3 ?"남자" :(cc==2 || cc==4 ?"여자" :"확인불가" );
		
		System.out.println("당신의성별은 "+dd+"입니다");
		
		
		System.out.println("남자이면 1,3을 누르시고 여자이면2,4를 눌러주세요");
		int num1=Integer.parseInt(sc.nextLine());
		String gender;
		gender=num1==1||num1==3 ?"남자" :(num1==2||num1==4?"여자" :"확인불가");
		System.out.println(gender);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
