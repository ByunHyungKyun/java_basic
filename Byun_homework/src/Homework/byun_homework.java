package Homework;

import java.util.Scanner;

public class byun_homework {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		
		System.out.println("탄수화물 중독 자가진단 테스트");	
		System.out.println("");
		System.out.println("아침을 배불리 먹은후 점심시간전에 배가 고프다");
		System.out.println("맞으면 1, 아니면 2를 누르시오");
		int a = Integer.parseInt(sc.nextLine());
	
		int b = 0;
		
		if(a==1){
			b +=1;
			System.out.println("밥,빵,과자등 음식을 먹기 시작하면 끝이 없다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("밥,빵,과자등 음식을 먹기 시작하면 끝이 없다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
	    
	    if(a==1){
			b +=1;
			System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
	    
	    if(a==1){
			b +=1;
			System.out.println("정말 배고프지 않더라도 먹을때가 있다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("정말 배고프지 않더라도 먹을때가 있다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
	    
	    if(a==1){
			b +=1;
			System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
		
	    if(a==1){
			b +=1;
			System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
		
	    if(a==1){
			b +=1;
			System.out.println("책상이나 식탁위에 항상 과자,초콜릿등이 놓여놓는다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("책상이나 식탁위에 항상 과자,초콜릿등이 놓여놓는다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
		
	    if(a==1){
			b +=1;
			System.out.println("오후 5시가 되면 피곤함과배고픔을 느끼고 일이 손에 안잡힌다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("오후 5시가 되면 피곤함과배고픔을 느끼고 일이 손에 안잡힌다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
		
	    if(a==1){
			b +=1;
			System.out.println("과자 촠콜릿등 단음식은 상상만해도 먹고싶어진다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("과자 촠콜릿등 단음식은 상상만해도 먹고싶어진다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
	    
	    if(a==1){
			b +=1;
			System.out.println("다이어트를 위해 식이조절을 하는데 3일도못간다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}else {
			System.out.println("다이어트를 위해 식이조절을 하는데 3일도못간다");
			System.out.println("맞으면 1, 아니면 2를 누르시오");
		}
		
	    a = Integer.parseInt(sc.nextLine());
	    
	    switch (b){
	    
	    case 0: case 1: case 2: case 3:
	    	System.out.println("질문에 해당되는 개수:"+b+"입니다"+"=>주의!위험한수준은 아니지만 관리가 필요");
	    	break;
	    case 4: case 5: case 6:
	    	System.out.println("질문에 해당되는 개수:"+b+"입니다"+"=>위험!!탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
	    	break;
	    case 7: case 8: case 9: case 10:
	    	System.out.println("질문에 해당되는 총 개수:"+b+"입니다"+"=>중독!!!전문의 상담이 필요함");
	    	break;
	    
	    }
	    
	    

	}

}
