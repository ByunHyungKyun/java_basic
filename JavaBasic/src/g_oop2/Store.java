package g_oop2;

public class Store {

	public static void main(String[] args) {
		
		Desktop d1=new Desktop("삼성컴퓨터",1000000);
		Desktop d2=new Desktop("LG컴퓨터",1000000);

		
		AirCon ac1=new AirCon("삼성에어컨",200000);
		AirCon ac2=new AirCon("LG에어컨",200000);
		
		TV tv1=new TV("삼성TV",3000000);
		TV tv2=new TV("LGTV",3000000);
		
		Customer c=new Customer();
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d1);//형변환이 숨어 있는것이다 
		
		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac2);
		
		System.out.println(tv1.getInfo());
		System.out.println(tv2.getInfo());
		c.buy(tv2);
		
		c.showItem();

	}

}



class Product{
	
	String name;	//이름
	int price;	//가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//상품의 정보를 반환하는 메서드
	String getInfo(){
		return name + "(" + price + "원)";
	}
	
}



class Desktop extends Product{
	Desktop(String name, int price){
		super(name, price);
	}
	
	void programming(){ //고유한기능
		System.out.println("프로그램을 만듭니다.");
	}
}


class AirCon extends Product{
	AirCon(String name, int price){
		super(name, price);
	}
	
	void setTemperature(){
		System.out.println("온도를 설정합니다.");
	}
}


class TV extends Product{
	TV(String name, int price){
		super(name, price);
	}
	
	void setChannel(){
		System.out.println("채널을 변경합니다.");
	}
}



class Customer{
	int money = 10000000;
	
	Product[] item = new Product[100]; //장바구니 다항성을 사용해야 하나의 배열로 해결이 된다
	void buy(Product p){ //다형성 다향성을 안쓰면 3가지 구입하는 메소드를 따로따로 만들어야한다
		if(money < p.price){
			System.out.println("잔돈이 부족합니다.");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "를 구매했습니다.");
	}

	
	
	
	void showItem(){
		System.out.println("=============== 장바구니 ===============");
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				break;
			}else{
				System.out.println(item[i].getInfo());
			}
		}
		System.out.println("========================================");
	}
}



























































































