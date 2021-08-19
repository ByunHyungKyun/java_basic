package e_oop_restaurant;

import java.util.Arrays;

public class Boss {
	public static void main(String[] args) {
		Alba alba=new Alba(); //사장이 알바 부르기
		
		String[] order = alba.order();//손님이주문한 음식 받아오라시키기
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리 만드는중...완성!");
		String[] foods={"완성된 자장면","완성된 탕수육"}; //요리 만드는중
		
		alba.serve(foods);//알바에게 서빙하라 하기
		
		alba.pay(order);//알바에게 계산하게 하기
		

	}

}
