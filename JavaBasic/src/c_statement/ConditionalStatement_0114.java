package c_statement;

import java.util.Scanner;

public class ConditionalStatement_0114 {

	public static void main(String[] args) {

		/*
		 * 조건문 if문 switch문
		 * 
		 * if문 if(조건식){} : 조건식의 결과가 true이면 블럭안의문장을 수행한다 else if(조건식){} : 다수의 조건이
		 * 필요할때 if 뒤에 추가한다 else() : 결과가 true인 조건식이 하나도없는 경우를 위해 추가한다
		 */

		int a = 1;

		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 0) {
			System.out.println("조건식의연산결과가 false이면 수행되지 않는다.");
		}

		if (a == 1) {
			System.out.println("a가 1인 경우에 하고싶은것");
		} else if (a == 2) {
			System.out.println("a가 2인 경우에 하고싶은것");
		} else if (a == 3) {
			System.out.println("a가 3인 경우에 하고싶은것");
		} else {
			System.out.println("이외에 경우에 하고싶은것");
		}

		// 조건을 한묶음으로 사용하기위해서는 반드시 else if를 사용한다
		if (a < 10) {
			System.out.println("a가 10보다 작다");
		} else if (a < 20) {
			System.out.println("a가 20보다 작다");
		}

		// 시험점수가 60점 이상이면 합격그렇지 않으면 불합격
		int score = 50;

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		
		
		/*
		// 성적에 등급을 부여하는 프로그램을 만드십시오
		Scanner sc = new Scanner(System.in);
		String grade = null;

		System.out.println("당신의 점수를 입력하시오 : ");
		score = Integer.parseInt(sc.nextLine());
		/*
		 * if(90<score && score<=100){ grade="a"; }else if(80<=score){
		 * grade="b"; }else if(70<=score){ grade="c"; }else if(60<=score){
		 * grade="d"; }else{ grade="f"; }
		 

		if (90 <= score) {
			grade = "a";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "b";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (70 <= score) {
			grade = "c";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (60 <= score) {
			grade = "d";
			if (67 <= score) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "f";
		}
		System.out.println("당신의 " + score + "점,점수의 등급은 " + grade + "입니다.");
		// 자동정렬 : ctrl + shift + f

		
		/*
		 * switch문
		 * switch(int/string)(case1: break;)
		 * 조건식의 결과는 점수와 문자열만(JDK1.7부터 문자열 허용)허용한다
		 * 조건식의 일치하는 case문 이후의 문자을 수행한다
		 */
		
		/*
		a = 1;
		switch(a){
			case 1:
				System.out.println("a가 1인 경우에 하고싶은 것");
				break;
			case 2:
				System.out.println("a가 2인 경우에 하고싶은 것");
				break;
			default:
				System.out.println("의외에 경우에 하고싶은 것");
		}
		
		
		String b="a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것");
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것");
			break;
		default : 
			System.out.println("이외에 경우에 하고싶은것");
			
		}
		*/
		
		
		
		
		
		//주어진 월에해당하는 계절을 출력하세요
		int mounth =5;
		String season=null;
		
		switch(mounth){
		
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
			
		case 6: case 7:case 8:
			season = "여름";
			break;
			
		case 9:case 10:case 11:
			season = "가을";
			break;
			
		case 12:case 1:case 2:
			season = "겨울";
			break;
		}
		System.out.println(mounth+"월은 "+season+"계절이다");
		
		
		String grade;
		
		score=100;
		grade = null;
		switch(score/10){
		
		case 10:case 9: 
			grade = "a";
			
			break;
		case 8: 
			grade ="b";
			
			break;
		case 7:
			grade ="c";
			
			break;
		case 6:
			grade ="d";
			
			break;
			default:
				grade ="f";		
		}
		   System.out.println("당신의 등급은 : "+grade);
		   
	/*	  
		   //숫자를 입력받아 그숫자가0인지 아닌지 출력해주세요
		Scanner sc=new Scanner(System.in);
		int num;
		
	   System.out.println("숫자를 입력하시오");
	   num=Integer.parseInt(sc.nextLine());
	   */
	 /* if(num==0){
		  
		 System.out.println("입력받은 숫자 "+num+"은 0이 맞다.");
	  }else{
		  System.out.println("입력받은 숫자 "+num+"은 0이 아니다.");
	  }
		
		switch(num){
		case 0:
			System.out.println("입력받은 숫자 "+num+"은 0이 맞다");
			break;
			default:
				System.out.println("입력받은 숫자 "+num+"은 0이 아니다");			
		}
		*/
		
	   //숫자를 입력받아 그 숫자가 홀수인지 짝수인지출력하시오
		/*
		if(num%2==0){
			 System.out.println("입력받은 숫자 "+num+"은 짝수이다.");
			
		}else{
			System.out.println("입력받은 숫자 "+num+"은 홀수이다.");
		}
		
		*/
		//정수 3개를 입력받아 총점,평균,등급을 출력해주세요
		//평균은 소수점 1자리까지
	   
		   
		/*   
	   Scanner sc=new Scanner(System.in);
		
	   System.out.println("첫번째숫자를 입력하시오");
	   int num1=Integer.parseInt(sc.nextLine());
	   System.out.println("두번째숫자를 입력하시오");
	   int num2=Integer.parseInt(sc.nextLine());
	   System.out.println("세번째숫자를 입력하시오");
	   int num3=Integer.parseInt(sc.nextLine());
			
		int sum = num1 + num2 + num3;
		double avg = Math.round(sum/3.0*10)/10.0;
		if (90 <= avg) {
			grade = "a";
			if (97 <= avg) {
				grade += "+";
			} else if (avg <= 93) {
				grade += "-";
			}
		} else if (80 <= avg) {
			grade = "b";
			if (87 <= avg) {
				grade += "+";
			} else if (avg <= 83) {
				grade += "-";
			}
		} else if (70 <= avg) {
			grade = "c";
			if (77 <= avg) {
				grade += "+";
			} else if (avg <= 73) {
				grade += "-";
			}
		} else if (60 <= avg) {
			grade = "d";
			if (67 <= avg) {
				grade += "+";
			} else if (avg <= 63) {
				grade += "-";
			}
		} else {
			grade = "f";
		}
	

		System.out.println("입력받은 3개의 값 "+num1+","+num2+","+num3+"은 총합이 "+sum+"이고 평균은 "+avg+"이며 최종등급은 "+grade+"등급입니다.");
		
		*/
		
		
		
		
		
		//램덤발생
		//Math.random() : 0.0~1.0미만의 랜덤수 발생
		int random=(int)(Math.random()*100)+1;
		System.out.println(random);
		
		//1~100 사이의 랜덤한수를 3개 발생시키고오름차순으로 출력하시오
		int one=(int)(Math.random()*100)+1;
		int two=(int)(Math.random()*100)+1;
		int three=(int)(Math.random()*100)+1;
		
		int n=one;
		int w=two;
		int h=three;
		/*
		if(n<w && w<h){
			System.out.println("3가지 랜덤수를 오름순서대로 출력하면:  "+n+","+w+","+h); 
		}else if(w<h && h<n){
			System.out.println("3가지 랜덤수를 오름순서대로 출력하면: "+w+","+h+","+n);
		}else if(h<n && n<w){
			System.out.println("3가지 랜덤수를 오름순서대로 출력하면: "+h+","+n+","+w);	
		}else if(n<h && h<w){
			System.out.println("3가지 랜덤수를 오름순서대로 출력하면: "+n+","+h+","+w);
		}else if(w<n && n<h){
			System.out.println("3가지 랜덤수를 오름순서대로 출력하면: "+w+","+n+","+h);
		}else {
			System.out.println("3가지 랜덤수를 오름순서대로 출력하면:"+h+","+w+","+n);
		}
		*/
		
		//위에를 선생님이 코딩한것
		if(n>w){
			int t=n;
			n=w;
			w=t;
		}if(n>h){
			int t=n;
			n=h;
			h=t;
		}if(w>h){
			int t=w;
			w=h;
			h=t;
		}
		System.out.println(n+","+w+","+h);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
