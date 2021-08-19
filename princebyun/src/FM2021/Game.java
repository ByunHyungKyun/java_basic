package FM2021;

import java.util.Scanner;

public class Game {

	
	Player[] p;
	Coach c;
	int score=0;
	Player p2;
	
	
	Game(){
		p=new Player[25];
		p[0]=new Player("아자르",175,75,"벨기에","fw","오른발",10);
		p[1]=new Player("드록바",189,85,"코트디브아루","fw","오른발",9);
		p[2]=new Player("윌리안",175,70,"브라질","fw","오른발",11);
		p[3]=new Player("램파드",183,80,"잉글랜드","mf","오른발",7);
		p[4]=new Player("하미레스",178,70,"브라질","mf","오른발",13);
		p[5]=new Player("존오비미켈",188,80,"코튿브아루","mf","오른발",8);
		p[6]=new Player("이바노비치",183,78,"세비야","cb","오른발",4);
		p[7]=new Player("존테리",190,85,"잉글랜드","cb","오른발",3);
		p[8]=new Player("케이휠",195,88,"잉글랜드","cb","오른발",5);
		p[9]=new Player("아스필리쿠에타",175,70,"스페인","cb","오른발",2);
		p[10]=new Player("체흐",199,85,"벨기에","gk","왼발",1);
		p[11]=new Player("손흥민",183,75,"대한민국","fw","오른발",10);
		p[12]=new Player("호날두",185,80,"포르투칼","fw","오른발",7);
		p[13]=new Player("메시",170,70,"아르헨티나","fw","왼발",10);
		p[14]=new Player("모드리치",175,75,"네덜란드","mf","오른발",10);
		p[15]=new Player("프티",183,75,"네덜란드","mf","오른발",10);
		p[16]=new Player("발락",183,80,"독일","mf","오른발",10);
		p[17]=new Player("비디치",198,85,"잉글랜드","cb","오른발",4);
		p[18]=new Player("박지성",175,75,"대한민국","mf","오른발",13);
		p[19]=new Player("캠벨",189,85,"잉글랜드","cb","오른발",4);
		p[20]=new Player("네이마르",175,75,"브라질","fw","오른발",10);
		p[21]=new Player("포그바",188,78,"프랑스","mf","오른발",10);
		p[22]=new Player("비에이라",188,85,"프랑스","mf","오른발",8);
		p[23]=new Player("말디니",185,80,"이탈리아","cb","오른발",5);
		p[24]=new Player("네스타",189,85,"이탈리아","cb","오른발",4);
	}
	

	
	
	public static void main(String[] args) {
		new Game().start();
	}

	void start() {
		int m = 0;
		int wt=0;
		int lt=0;
		int dt=0;
		System.out.println("\t\t\t\t=========================================================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\t\t\t\t=========================FM2021==========================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\t\t\t\t=========================================================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("");
		System.out.println("");
		int input = 0;
		System.out.println("\t\t\t\t=========================감독설정==========================");
		System.out.println("\t\t\t\t이름을 입력하시오 ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("\t\t\t\t국적을 입력하시오");
		String from = sc.nextLine();
		System.out.println("\t\t\t\t팀 이름을 입력하시오");
		String team = sc.nextLine();
		c = new Coach(name, from, team);
		c.showcoach();
		System.out.println("\t\t\t\t포메이션을 정해주세요");
		System.out.println("\t\t\t\t예: 1433이면 차례대로 숫자를 입력하시오");
		System.out.println("\t\t\t\t골기퍼 포메이션을 입력하세오");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("\t\t\t\t수비수 포메이션을 입력하세요");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("\t\t\t\t미드필더 포메이션을 입력하세요");
		int d = Integer.parseInt(sc.nextLine());
		System.out.println("\t\t\t\t공격수 포메이션을 입력하시요");
		int e = Integer.parseInt(sc.nextLine());
		c.formation(a, b, d, e);
		c.showcoach();

		System.out.println("\t\t\t\t공격수를" + e + "명 을 입력하는 창입니다");
		System.out.println("\t\t\t\tfw를 입력하시오");
		String po = sc.nextLine();
		c.form(po);

		System.out.println("\t\t\t\t미드필더를" + d + "명 을 입력하는 창입니다");
		System.out.println("\t\t\t\tmf를 입력하시오");
		String po1 = sc.nextLine();
		c.form(po1);

		System.out.println("\t\t\t\t수비수를" + b + "명 을 입력하는 창입니다");
		System.out.println("\t\t\t\tcb를 입력하시오");
		String po2 = sc.nextLine();
		c.form(po2);

		System.out.println("\t\t\t\t골기퍼를" + a + "명 을 입력하는 창입니다");
		System.out.println("\t\t\t\tgk를 입력하시오");
		String po3 = sc.nextLine();
		c.form(po3);

		c.showteam();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\t\t\t\t============곧 게임이 시작합니다=============");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\t\t\t\t============잠시만 기다려주세요==============");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("\t\t\t\t====================3==================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("\t\t\t\t===================2====================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("\t\t\t\t==================1======================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\t\t\t\t시작!");
		while (true) {
			System.out.println("");
			System.out.println("\t\t\t\t원하는 메뉴를 누르시오");
			System.out.println("\t\t\t\t1.팀정보\t2.감독정보\t3.선수정보\t4.선수교체\t5.경기\t6.전적\t7.종료");
			input = sc.nextInt();
			switch (input) {
			case 1:
				c.showteam();
				break;
			case 2:
				c.showcoach();
				break;
			case 3:
				for (int j = 0; j < 25; j++) {
					System.out.println("\t\t\t\t" + j + "번 :" + p[j].name);
				}
				System.out.println("\t\t\t\t보고싶은 선수의번호를 누루시오");
				input = sc.nextInt();
				System.out.println("\t\t\t\t이름: " + p[input].name);
				System.out.println("\t\t\t\t키: " + p[input].length);
				System.out.println("\t\t\t\t몸무게: " + p[input].weight);
				System.out.println("\t\t\t\t주발: " + p[input].foot);
				System.out.println("\t\t\t\t국가: " + p[input].from);
				System.out.println("\t\t\t\t등번호: " + p[input].number);
				System.out.println("\t\t\t\t포지션: " + p[input].position);
				break;
			case 4:
				c.change();
				break;
			case 5:
				match();
				m++;
				if(p2.w[0] !=0){
					wt += p2.w[0];
					}
				if(p2.l[0] !=0){
					lt += p2.l[0];
					}
				if(p2.d[0] !=0){
					dt += p2.d[0];
					}
				break;
			case 6:
				System.out.println("\t\t\t\t==============총전적==============");
				System.out.print("\t\t\t\t총 매치수: " + m);
				System.out.print("\t총 승리수: " + wt);
				System.out.print("\t총 패배수: " + lt);
				System.out.print("\t총 비긴수: " + dt);
				System.out.println("");
				break;
			case 7:
				System.out.println("\t\t\t\t종료되었습니다");
				System.exit(0);

			}

		}
	}

	void match() {
		score = 0;
		int g = 0;
		System.out.println("\t\t\t\t경기가 곧 시작됩니다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\t\t\t\t팀포메이션");
		c.showteam();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\t\t\t\t============잠시만 기다려주세요==============");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("\t\t\t\t====================3==================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("\t\t\t\t===================2====================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("\t\t\t\t==================1======================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("\t\t\t\t시작!");
		p2 = new Player();
		int u = 0;
		for (int i = 0; i < 6; i++) {
			int j = 0;
			int a = (int) (Math.random() * 4) + 1;
			switch (a) {
			case 1:
				a = (int) (Math.random() * 3);
				if (c.mf[a] != null) {
					p2.pass(c.mf[a].name);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 2:
	a = (int) (Math.random() * 2);
				if (c.mf[a] != null) {
					p2.dribble(c.mf[a].name);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:
				a = (int) (Math.random() * 3);
				if (c.fw[a] != null) {
					p2.shoot(c.fw[a].name);
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 4:
				a = (int) (Math.random() * 2);
				if (c.cb[a] != null) {
					p2.defense(c.cb[a].name);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			}
		}

		System.out.println("\t\t\t\t==============경기종료!================");
		System.out.println("\t\t\t\t스코어는 " + p2.q[0] + " 대 " + p2.y[0]);
		if (p2.q[0] > p2.y[0]) {
			p2.w[0]++;
		} 
		if (p2.q[0] < p2.y[0]) {
			p2.l[0]++;
		} 
		if(p2.q[0] == p2.y[0]) {
			p2.d[0]++;
		}
		p2.q[0] = 0;
		p2.y[0] = 0;

	}

	private void formation() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
