package f_game;

import e_oop.ScanUtil;

public class MyGame {

	
	Character c; //게임주인공
	Item[] items;
	
	MyGame(){ //주인공 초기화
		c=new Character("가렌",100,50,20,10);
		items =new Item[10];
		items[0]=new Item("무한의 대검",0,0,50,0);
		items[1]=new Item("가시갑옷",0,0,0,50);
		items[2]=new Item("손도끼",0,0,10,10);
		items[3]=new Item("냉동참치",0,0,50,0);
		items[4]=new Item("빛의 화살",0,0,35,15);
		items[5]=new Item("게틀링건",0,0,40,50);
		items[6]=new Item("불꽃망토",0,0,10,60);
		items[7]=new Item("삼위일체",0,0,100,100);
		items[8]=new Item("마법공학벨트",0,0,5,100);
		items[9]=new Item("기사신발",50,50,0,10);
	}
	
	
	public static void main(String[] args) {
		new MyGame().start();
	}

	
	
	void start(){ //사용자가 시작할때입력하는 창
		int input =0;
		while(true){
			System.out.println("1.내정보\t2.사냥\t3.종료");
			input=ScanUtil.nextInt();
			
			switch(input){
			case 1:
				c.showInfo();
				break;
			case 2:
				System.out.println("1.고블린\t2.장로용\t가이탄");
				input=ScanUtil.nextInt();
				switch(input){
				case 1:
				    hunt();
				    continue;
				case 2:
					hunt2();
					continue;
				case 3:
					hunt3();
					continue;
				}
			case 3:
				System.out.println("종료되었습니다");
				System.exit(0);
				
			}

		}	
		
	}
	
	
	
	void hunt(){ //사냥 메소드 
		int a=(int)(Math.random()*100);
		Monster m = new Monster("고블린",a,10,(int)(Math.random()*100)
				,10,new Item[]{items[0],items[1],items[2]
						,items[3],items[4],items[5],items[6],items[7],items[8],items[9]});
		System.out.println("고블린의체력은: "+m.maxHp);
		System.out.println(m.name+"를 만났습니다.전투를 시작합니다");
		
		int input=0;
		battle : while(true){
			
			System.out.println("1.공격\t2.도망");
			input=ScanUtil.nextInt();
			switch(input){
			case 1:
				c.attack(m);
				if(m.hp<=0){
					System.out.println(m.name+"을 처치하였습니다");
					c.getExp((int)(Math.random()*1000));
					c.getItem(m.itemDrop());
					break battle;
				}
			m.attack(c);
			break;
			case 2:
				break battle;
			
			}
				
		}
					
	}
	
	
	void hunt2(){ //사냥 메소드 
		int a=(int)(Math.random()*100);
		Monster m = new Monster("장로용",a,10,(int)(Math.random()*100)
				,50,new Item[]{items[0],items[1],items[2]
						,items[3],items[4],items[5],items[6],items[7],items[8],items[9]});
		System.out.println("장로용의체력은: "+m.maxHp);
		System.out.println(m.name+"를 만났습니다.전투를 시작합니다");
		
		int input=0;
		battle : while(true){
			
			System.out.println("1.공격\t2.도망");
			input=ScanUtil.nextInt();
			switch(input){
			case 1:
				c.attack(m);
				if(m.hp<=0){
					System.out.println(m.name+"을 처치하였습니다");
					c.getExp((int)(Math.random()*1000));
					c.getItem(m.itemDrop());
					break battle;
				}
			m.attack(c);
			break;
			case 2:
				break battle;
			
			}
				
		}
					
	}
	

	void hunt3(){ //사냥 메소드 
		int a=(int)(Math.random()*100);
		Monster m = new Monster("가이탄",a,10,(int)(Math.random()*100)
				,1000,new Item[]{items[0],items[1],items[2]
						,items[3],items[4],items[5],items[6],items[7],items[8],items[9]});
		System.out.println("가이탄의체력은: "+m.maxHp);
		System.out.println(m.name+"를 만났습니다.전투를 시작합니다");
		
		int input=0;
		battle : while(true){
			
			System.out.println("1.공격\t2.도망");
			input=ScanUtil.nextInt();
			switch(input){
			case 1:
				c.attack(m);
				if(m.hp<=0){
					System.out.println(m.name+"을 처치하였습니다");
					c.getExp((int)(Math.random()*1000));
					c.getItem(m.itemDrop());
					break battle;
				}
			m.attack(c);
			break;
			case 2:
				break battle;
			
			}
				
		}
					
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









