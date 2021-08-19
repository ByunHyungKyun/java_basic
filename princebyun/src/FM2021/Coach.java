package FM2021;

import java.util.Scanner;

public class Coach {

	
	String name; //감독이름 
	String from; //국적
	String team; //소속팀 이름 
	Player[] fw;//공격수
	Player[] mf;//미드필더
	Player[] cb;//수비
	Player[] gk;//골기퍼
	int[] formation=new int[4];//포메이션 ps.1433 포메이션
	Game g=new Game();
	Scanner sc=new Scanner(System.in);
	Player pp=new Player();
	
	
	Coach(String name, String from, String team){
		this.name=name;
		this.from=from;
		this.team=team;	
	}

	void showcoach() {
		System.out.println("\t\t\t\t======================");
		System.out.println("\t\t\t\t이름: " + name);
		System.out.println("\t\t\t\t국적: " + from);
		System.out.println("\t\t\t\t팀이름: " + team);
		System.out.print("\t\t\t\t포메이션: ");
		for (int i = 0; i < formation.length; i++) {
			System.out.print(formation[i]);
		}
		System.out.println("");
		System.out.println("\t\t\t\t======================");
		System.out.println("");
		System.out.println("");
	}

	void showteam() { // 팀포지션 상태
		System.out.println("\t\t\t\t---------" + team + "팀 포메이션----------");
		System.out.print("\t\t\t\t");
		for (int i = 0; i < fw.length; i++) {
			if (fw[i] != null) {
				System.out.print(fw[i].name + "\t");
			}
		}
		System.out.println("");
		System.out.print("\t\t\t\t");
		for (int i = 0; i < mf.length; i++) {
			if (mf[i] != null) {
				System.out.print(mf[i].name + "\t");
			}
		}
		System.out.println("");
		System.out.print("\t\t\t\t");
		for (int i = 0; i < cb.length; i++) {
			if (cb[i] != null) {
				System.out.print(cb[i].name + "\t");
			}
		}
		System.out.println("");
		System.out.print("\t\t\t\t");
		for (int i = 0; i < 1; i++) {
			if (gk[i] != null) {
				System.out.print(gk[i].name + "\t");
			}
		}
		System.out.println("");
		System.out.println("\t\t\t\t----------------------------");
		System.out.println("");
		System.out.println("");
	}
	
	
	void formation(int a,int b,int c,int d){ //팀 포메이션을 결정하는메소드
		formation[0]=a;
		formation[1]=b;
		formation[2]=c;
		formation[3]=d;
		
		
		this.fw=new Player[formation[3]];
		this.mf=new Player[formation[2]];
		this.cb=new Player[formation[1]];
		this.gk=new Player[formation[0]];
	}

	void form(String position) { // 선수를 포메이션의 포지션으로 배정

		if (position.equals("fw")) {
			for (int i = 0; i < fw.length; i++) {
				for (int j = 0; j < 25; j++) {
					System.out.println("\t\t\t\t" + j + "번 :" + g.p[j].name);
				}
				System.out.println("");
				if (fw[i] == null) {
					System.out.println("\t\t\t\t원하시는 선수를 입력하시오: ");
					int a = Integer.parseInt(sc.nextLine());
					fw[i] = g.p[a];
				}
			}
		}
		if (position.equals("mf")) {
			for (int i = 0; i < mf.length; i++) {
				for (int j = 0; j < 25; j++) {
					System.out.println("\t\t\t\t" + j + "번 :" + g.p[j].name);
				}
				System.out.println("");
				if (mf[i] == null) {
					System.out.println("\t\t\t\t원하시는 선수를 입력하시오: ");
					int a = Integer.parseInt(sc.nextLine());
					mf[i] = g.p[a];
				}
			}
		}
		if (position.equals("cb")) {
			for (int i = 0; i < cb.length; i++) {
				for (int j = 0; j < 25; j++) {
					System.out.println("\t\t\t\t" + j + "번 :" + g.p[j].name);
				}
				System.out.println("");
				if (cb[i] == null) {
					System.out.println("\t\t\t\t원하시는 선수를 입력하시오: ");
					int a = Integer.parseInt(sc.nextLine());
					cb[i] = g.p[a];
				}
			}
		}

		if (position.equals("gk")) {
			for (int i = 0; i < gk.length; i++) {
				for (int j = 0; j < 25; j++) {
					System.out.println("\t\t\t\t" + j + "번 :" + g.p[j].name);
				}
				System.out.println("");
				if (gk[i] == null) {
					System.out.println("\t\t\t\t원하시는 선수를 입력하시오: ");
					int a = Integer.parseInt(sc.nextLine());
					gk[i] = g.p[a];
				}
			}
		}

	}

	void change() {
		showteam();
		System.out.println("\t\t\t\t바꾸고 싶은 포지션을 입력하시오");
		System.out.println("\t\t\t\tfw,mf,cb,gk");
		String d = sc.nextLine();
		if (d.equals("fw")) {
			System.out.print("\t\t\t\t");
			for (int j = 0; j < fw.length; j++) {
				if (fw[j] != null) {
					System.out.print("\t"+"(" + j + ")" + fw[j].name + "\t");
				}
			}
			System.out.println("");
			System.out.println("\t\t\t\t바꾸고 싶은 선수를 입력하시오");
			int a = Integer.parseInt(sc.nextLine());
			for (int j = 0; j < 25; j++) {
				System.out.println("\t\t\t\t" + j + "번 :" + g.p[j].name);
			}
			System.out.println("");
			System.out.println("\t\t\t\t바꾸실 선수를 입력하시오");
			int b = Integer.parseInt(sc.nextLine());
			fw[a] = g.p[b];

		}

		if (d.equals("mf")) {
			System.out.print("\t\t\t\t");
			for (int j = 0; j < mf.length; j++) {
				if (mf[j] != null) {
					System.out.print("\t"+"(" + j + ")" + mf[j].name + "\t");
				}
			}
			System.out.println("");
			System.out.println("\t\t\t\t바꾸고 싶은 선수를 입력하시오");
			int a = Integer.parseInt(sc.nextLine());
			for (int j = 0; j < 25; j++) {
				System.out.println("\t\t\t\t" + j + "번 :" + g.p[j].name);
			}
			System.out.println("");
			System.out.println("\t\t\t\t바꾸실 선수를 입력하시오");
			int b = Integer.parseInt(sc.nextLine());
			mf[a] = g.p[b];

		}

		if (d.equals("cb")) {
			System.out.print("\t\t\t\t");
			for (int j = 0; j < cb.length; j++) {
				if (cb[j] != null) {
					System.out.print("\t"+"(" + j + ")" + cb[j].name + "\t");
				}
			}
			System.out.println("");
			System.out.println("\t\t\t\t바꾸고 싶은 선수를 입력하시오");
			int a = Integer.parseInt(sc.nextLine());
			for (int j = 0; j < 25; j++) {
				System.out.println("\t\t\t\t" + j + "번 :" + g.p[j].name);
			}
			System.out.println("");
			System.out.println("\t\t\t\t바꾸실 선수를 입력하시오");
			int b = Integer.parseInt(sc.nextLine());
			cb[a] = g.p[b];

		}

		if (d.equals("gk")) {
			System.out.print("\t\t\t\t");
			for (int j = 0; j < gk.length; j++) {
				if (gk[j] != null) {
					System.out.print("\t"+"(" + j + ")" + gk[j].name + "\t");
				}
			}
			System.out.println("");
			System.out.println("\t\t\t\t바꾸고 싶은 선수를 입력하시오");
			int a = Integer.parseInt(sc.nextLine());
			for (int j = 0; j < 25; j++) {
				System.out.println("\t\t\t\t" + j + "번 :" + g.p[j].name);
			}
			System.out.println("");
			System.out.println("\t\t\t\t바꾸실 선수를 입력하시오");
			int b = Integer.parseInt(sc.nextLine());
			gk[a] = g.p[b];

		}

	}
	
	
	
	
	
	
	
	
	
}
