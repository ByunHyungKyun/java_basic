package c_statement;

import java.util.Scanner;

public class baseball_0115 {

	public static void main(String[] args) {
		/*
		 * 숫자 야구게임 만들기
		 * 6,2,5 : 1S 0B 20
		 * 6,1,3 : 0S 0B 30
		 * 7,2,9 : 1S 0B 20
		 * 4,2,8 : 3S--정답은 4,2,8
		 */
 
		int a = 0;
		int b = 0;
		int c = 0;
		int count = 0;

		/*선생님 코드
		 * do{
		 * a=(int) (Math.random() * 9) + 1;
		 * b=(int) (Math.random() * 9) + 1;
		 * c=(int) (Math.random() * 9) + 1;
		 * }while(a==b||a==c||b==c);
		 * 
		 * 
		 * while(true){
		 * System.out.println("3자리 숫자");
		 * int input=Integer.parseint(s.nextLine());
		 * int i3=input %10;
		 * input /=10;
		 * int i2=input %10;
		 * input /=10;
		 * int i1=input %10;
		 * 
		 * 
		 * int strike=0;
		 * int ball=0;
		 * int out=0;
		 * 
		 * if(a==i1) strike++;
		 * if(b==i2) strike++;
		 * if(c==i3)strike++;
		 * 
		 * 
		 * 
		 * if(a==i2||a==i3) ball++;
		 * if(b==i1||a==i3) ball++;
		 * if(c==i2||a==i1) ball++;
		 * 
		 * out=3-strike-ball;
		 * 
		 * 
		 * System.out.println("입력하신 숫자=" + a + "와 " + b + "와 " + c + "의 결과는 "
					+ strike + "S," + ball + "B," + out + "O 입니다");
		 * 
		 * if(strike==3){
		 * System.out.println("정답");
		 * 
		 * break;
		 *   }
		 * 
		 * }
		 */
		
		int s1 = (int) (Math.random() * 9) + 1;
		int s2 = (int) (Math.random() * 9) + 1;
		int s3 = (int) (Math.random() * 9) + 1;

		while (s2 == s1 || s2 == s3) {
			s2 = (int) (Math.random() * 9) + 1;
		}
		while (s3 == s2) {
			s3 = (int) (Math.random() * 9) + 1;
		}
		System.out.println(s1 + "," + s2 + "," + s3);

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("정답일거 같은 숫자 3개를 입력하시오 ");
			System.out.println("첫번째 숫자 :  ");
			a = Integer.parseInt(sc.nextLine());
			System.out.println(" ");
			System.out.println("두번째 숫자 :  ");
			b = Integer.parseInt(sc.nextLine());
			System.out.println(" ");
			System.out.println("세번째 숫자 :  ");
			c = Integer.parseInt(sc.nextLine());
			System.out.println(" ");

			count++;

			int st = 0;
			int ba = 0;
			int ou = 0;

			if (a == s1) {
				st += 1;
			} else if (a == s2) {
				ba += 1;
			} else if (a == s3) {
				ba += 1;
			} else {
				ou += 1;
			}
			if (b == s1) {
				ba += 1;
			} else if (b == s2) {
				st += 1;
			} else if (b == s3) {
				ba += 1;
			} else {
				ou += 1;
			}
			if (c == s1) {
				ba += 1;
			} else if (c == s2) {
				ba += 1;
			} else if (c == s3) {
				st += 1;
			} else {
				ou += 1;
			}

			System.out.println("입력하신 숫자=" + a + "와 " + b + "와 " + c + "의 결과는 "
					+ st + "S," + ba + "B," + ou + "O 입니다");
			System.out.println("");

		} while (a != s1 || b != s2 || c != s3);
		System.out
				.println("---------------------------------------------------");
		System.out.println("정답입니다^^ " + "총 시도 횟수는 " + count + "번입니다! "
				+ "당신의승리!");
		
		
		
		
		
	}

}
