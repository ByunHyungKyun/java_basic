package FM2021;

import java.util.Scanner;

public class Player {

	String name; //선수이름 
	int length; //선수키 
	int weight; //선수몸무게 
	String from; //국적
	String position; //선수포지션 
	String foot; //주발
	int number; //선수 번호 
	Scanner sc=new Scanner(System.in);
	int[] q=new int[1];
	int[] y=new int[1];
	int[] w=new int[1];
	int[] l=new int[1];
	int[] d=new int[1];
	Player(String name, int length,int weight,String from,
			String position, String foot,int number){ //선수 초기화 
	this.name = name;
	this.length = length;
	this.weight = weight;
	this.from = from;
	this.position=position;
	this.foot =foot;
	this.number =number;
	}
	
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	void showplayer(){ //선수 상태창
		System.out.println("\t\t\t\t======================");
		System.out.println("\t\t\t\t----------상태----------");
		System.out.println("\t\t\t\t이름: "+name);
		System.out.println("\t\t\t\t키: "+length);
		System.out.println("\t\t\t\t몸무게: "+weight);
		System.out.println("\t\t\t\t포지션: "+position);
		System.out.println("\t\t\t\t국적: "+from);
		System.out.println("\t\t\t\t주발: "+foot);
		System.out.println("\t\t\t\t등번호: "+number);
		System.out.println("\t\t\t\t=======================");
		System.out.println("");
		System.out.println("");
	}
	
	void shoot(String name) {

		Game g = new Game();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\t\t\t\t"+name + "이 슛을 하였습니다!!!");
		System.out.println("");
		int a = (int) (Math.random() * 2) + 1;
		if (a == 2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			q[0]++;
			System.out.println("\t\t\t\t"+name + "이 골을  넣었습니다!!!");
			System.out.println("\t\t\t\t"+"현재 스코어는 " + q[0] + " 대 " + y[0]);
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\t\t\t\t"+name + "의 슈팅이 막혔습니다!");
			System.out.println("");

		}

	}

	void defense(String name) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\t\t\t\t"+name + "이 태클을 시도하였습니다");
		System.out.println("");
		int a = (int) (Math.random() * 2) + 1;
		if (a == 2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\t\t\t\t"+name + "이 태클을 성공하였습니다");
			System.out.println("");

		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\t\t\t\t"+name + "의 태글이 실패하였습니다 ");
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			y[0]++;
			System.out.println("\t\t\t\t골을 먹혔습니다....");
			System.out.println("\t\t\t\t현재 스코어는 " + q[0] + " 대 " + y[0]);
			System.out.println("");

		}
	}

	void dribble(String name) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\t\t\t\t"+name + "이 드리블을 시도하였습니다");
		System.out.println("");
		int a = (int) (Math.random() * 2) + 1;
		if (a == 2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\t\t\t\t"+name + "이 드리블이 성공하였습니다");
			System.out.println("");

		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\t\t\t\t"+name + "의 드리블이 실패하였습니다 ");
			System.out.println("");
		}

	}

	void pass(String name) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\t\t\t\t"+name + "이 패스를 시도하였습니다");
		System.out.println("");
		int a = (int) (Math.random() * 2) + 1;
		if (a == 2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\t\t\t\t"+"아! " + name + "이 롱패스를 시도하였습니다!");
			System.out.println("");
			int b = (int) (Math.random() * 3) + 1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b == 3)
				System.out.println("\t\t\t\t"+name + "이 롱킬패스를 성공하였습니다!");
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b == 2)
				System.out.println("\t\t\t\t"+name + "이 쓰루롱패스를 성공하였습니다");
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b == 1)
				System.out.println("\t\t\t\t"+name + "이 롱패스를 실패하였습니다");
			System.out.println("");

		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("\t\t\t\t"+"아! " + name + "이 숏패스를 시도하였습니다!");
			System.out.println("");
			int b = (int) (Math.random() * 3) + 1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b == 3)
				System.out.println("\t\t\t\t"+name + "이 숏킬패스를 성공하였습니다!");
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b == 2)
				System.out.println("\t\t\t\t"+name + "이 쓰루숏패스를 성공하였습니다");
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b == 1)
				System.out.println("\t\t\t\t"+name + "이 숏패스를 실패하였습니다");
			System.out.println("");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
