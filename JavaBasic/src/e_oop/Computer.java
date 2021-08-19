package e_oop;

import java.util.Scanner;

public class Computer {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		com c=new com();
		while(true){
			System.out.println("----------------------------------------------------");
			System.out.println("컴퓨터 사용하기 버튼");
			System.out.println("1.전원  2.검색하기 3.야구게임  4.계산기 " );
			System.out.println("5.화면밝기up 6.화면밝기down 7.볼륨up 8.볼륨down 0.종료");
			System.out.println("----------------------------------------------------");
			int a=Integer.parseInt(sc.nextLine());
			switch(a){
			case 1: 
				c.power();break;
			case 2: 
				System.out.println("검색할것을 입력하시오 : ");
				String b=sc.nextLine();
				c.serch(b);break;
			case 3: 
				c.game(); break;
			case 4: 
				System.out.println("첫번째 숫자를 입력하시오");
				int q=Integer.parseInt(sc.nextLine());
				System.out.println("사용할 기본연산자를 입력하시오");
			  String w=sc.nextLine();
				System.out.println("두번째 숫자를 입력하시오");
				int  e=Integer.parseInt(sc.nextLine());
				c.cal(q, w, e); break;
			case 5: 
				c.lightup(); break;
			case 6: 
				c.lightdown(); break;
			case 7: 
				c.volumeup(); break;
			case 8: 
				c.volumedown(); break;
			default:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			
			
			}
					
		}
				
	}

}



class com{
	//컴퓨터의 속성 : 검색,계산기,게임,전원,밝기,소리 
	boolean power = false;
	int volume = 5;
	int light = 5;

	final int min_volume = 1;
	final int max_volume = 10;
	final int min_light = 1;
	final int max_light = 10;

	void power() {
		power = !power;
		System.out.println(power ? "켜짐" : "꺼짐");
	}

	void light(int light) {
		if (power) {
			if (min_light < light && light < max_light) {
				this.light = light;
			}
			System.out.println("현재 밝기는 "+this.light+"입니다");
		}else{
			System.out.println("현재 전원이 켜져있지 않습니다");
		}
	}

	void lightup() {
		System.out.println("밝기가올라갔습니다");
		light(light+1);
	}

	void lightdown() {
		System.out.println("밝기가내려갔습니다");
		light(light-1);
	
	}

	void volume(int volume) {
		if (power) {
			if (min_volume < volume && volume < max_volume) {
				this.volume = volume;
			}
			System.out.println("현재 볼륨는 "+this.volume+"입니다");
		}else {
			System.out.println("현재 전원이 켜져있지 않습니다");
		}
	}

	void volumeup() {
		System.out.println("볼륨이 올라갔습니다");
		volume(volume+1);

	}

	void volumedown() {
		System.out.println("볼륨이 내려갔습니다");
		volume(volume-1);
	
	}

	void serch(String a) {
		if (power) {
		System.out.println("입력하신 " + a + "는 인터넷이연결되어 있지 않아 검색할수없습니다");
		}else {
			System.out.println("현재 전원이 켜져있지 않습니다");
		}
	}

	void cal(int a, String b, int c) {
		
		if (power) {
		double d = b.equals("+") ? (a + c) : b.equals("-") ? (a - c) : b
				.equals("*") ? (a * c) : b.equals("/") ? (a / c) : 0;
		System.out.println("계산한 결과값은 " + d + "입니다");
		}else {
			System.out.println("현재 전원이 켜져있지 않습니다");
		}
	}

	void game() {
		if (power) {
		int a = 0;
		int b = 0;
		int c = 0;
		int count = 0;

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
	}else {
		System.out.println("현재 전원이 켜져있지 않습니다");
	}
	}
	
}