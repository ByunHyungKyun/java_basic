package f_game;

public class Character {

	String name; //이름 
	int maxHp;   //최대체력 
	int maxMp;   //최대마나
	int hp;      //체력
	int mp;      //마나
	int att;     //공격력
	int def;     //방어력
	int level;   //레벨
	int exp;     //경험치 
	int maxexp;  //도달경험치
	Item[] items; //보유아이템 
	
	
	
	
	
	Character(String name ,int hp,int mp, int att, int def){ //캐릭터초기화
		this.name = name;
		this.maxHp =hp;
		this.maxMp =mp;
		this.hp=this.maxHp;
		this.mp=this.maxMp;
		this.att=att;
		this.def=def;
		this.level=1;
		this.exp=0;
		this.items=new Item[10];
		
	}
	
	

	
	void showInfo(){ //상태창
		System.out.println("======================");
		System.out.println("----------상태----------");
		System.out.println("이름: "+name);
		System.out.println("레벨: "+level+"/"+exp);
		System.out.println("체력: "+hp+"/"+maxHp);
		System.out.println("마나: "+mp+"/"+maxMp);
		System.out.println("공격: "+att);
		System.out.println("방어: "+def);
		System.out.println("----------아이템----------");
		for(int i=0;i<items.length;i++){
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
			}
			System.out.println("=========================");
		}
	}
	

	
	void attack(Monster m){ //공격메소드 어떤몬스터를 공격하는가 파라미터
		
		int damage = att - m.def;
		damage = damage<=0   ?1   :damage; //데미지가 무조건 1이상 나오도록
		m.hp=m.hp < damage ?m.hp-m.hp :m.hp-damage; //hp보다 데미지가 크면 즉사
		System.out.println(name+"가 공격으로"+m.name+"에게"+damage+"만큼 데미지를 주었습니다."); 
		System.out.println(m.name+"의 남은 HP: "+m.hp);
	}
	
	
	void getExp(int exp){ //경험치얻은 메소드 얼만큼 경험치를 얻는지 파라미터
		System.out.println(exp+"의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100<=this.exp){ //경험치가 100이 넘었을때 레벨업을 하는것--경험치가100이상짜리를 위해 while문을 썼다 
			levelUp();
			this.exp -= 100;
		}
	}
	

	
	void levelUp(){ //레벨업 메소드
		level++;
		maxHp +=10;
		maxMp +=5;
		att +=2;
		def +=2;
		hp = maxHp;
		mp = maxMp;
		System.out.println("LEVEL UP!!");
		
	}
	

	
	void getItem(Item item){ //아이템을 얻는 메소드 ..어떤아이템을 얻었는가 파라미터 
		
		System.out.println(item.name+"을 획득하였습니다");
		for(int i=0;i<items.length;i++){
			if(items[i]==null){
				items[i]=item;
				break;	
			}
		}
		
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
