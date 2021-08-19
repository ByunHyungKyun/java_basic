package e_oop_restaurant;

public class Alba {

	//메서드 : 알바가 할일(보스가 알바한테 시킨일)
	//파라미터 : 일을 하기 위해필요한 것(보스가 알바에게 주는것)
	//리턴타입 : 일을 하고난후돌려주는것(알바가 보그에게 주는것)
	
	
	//주문받기위해 필요한 것? 사장님이주는것없음 파라미터
	//주문받은 후 보스에게줄것? 주문서 리턴값
	String[] order(){
		System.out.println("주문하시겠습니까?");
		return new String[]{"짜장면","탕수육"};
	}
	
	
	//서빙하기 위해 필요한것? 음식
	//서빙후보스에게줄것? 줄거 없음
	void serve(String[] foods){
		System.out.println("맛있게 드세요");
	}
	
	
	//계산하기 위해 필요한것? 계산서
	//계산후 보스에게줄것? 없음
	void pay(String[] order){
		System.out.println("2만원입니다,안녕히가세요");
	}
	
	
	
	
	
	
	
}
