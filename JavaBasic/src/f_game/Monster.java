package f_game;

public class Monster {

	
	
	String name; //이름 
	int maxHp;   //최대체력 
	int maxMp;   //최대마나
	int hp;      //체력
	int mp;      //마나
	int att;     //공격력
	int def;     //방어력
	Item[] items; //아이템 
	
	
	Monster(String name ,int hp,int mp, int att, int def, Item[] items){ //몬스터 초기화
		this.name = name;
		this.maxHp =hp;
		this.maxMp =mp; 
		this.hp=this.maxHp;
		this.mp=this.maxMp;
		this.att=att;
		this.def=def;
		this.items=items;
		
	}
	
	
   void attack(Character c){ //몬스터공격 메소드
		
		int damage = att - c.def;
		damage = damage<=0   ?1   :damage; 
		c.hp=c.hp < damage ?c.hp-c.hp :c.hp-damage; 
		System.out.println(name+"가 공격으로"+c.name+"에게"+damage+"만큼 데미지를 주었습니다."); 
		System.out.println(c.name+"의 남은 HP: "+c.hp);
	}
	
	
	Item itemDrop(){ //아이템을 떨어트리는 메소드
		return items[(int)(Math.random()*items.length)];//아이템 배열안에 랜덤으로 아이템을 떨어트린다
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
