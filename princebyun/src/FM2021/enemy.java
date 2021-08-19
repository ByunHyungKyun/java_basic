package FM2021;

import java.util.Scanner;

public class enemy {

	
	String name; //선수이름 
	int length; //선수키 
	int weight; //선수몸무게 
	String from; //국적
	String position; //선수포지션 
	String foot; //주발
	int number; //선수 번호 
	Scanner sc=new Scanner(System.in);
	
	enemy(String name, int length,int weight,String from,
			String position, String foot,int number){ //선수 초기화 
	this.name = name;
	this.length = length;
	this.weight = weight;
	this.from = from;
	this.position=position;
	this.foot =foot;
	this.number =number;
		
	}
	
	
	
	void showplayer(){ //선수 상태창
		System.out.println("======================");
		System.out.println("----------상태----------");
		System.out.println("이름: "+name);
		System.out.println("키: "+length);
		System.out.println("몸무게: "+weight);
		System.out.println("포지션: "+position);
		System.out.println("국적: "+from);
		System.out.println("주발: "+foot);
		System.out.println("등번호: "+number);
		System.out.println("=========================");
	}
	
	
	
	
	
	void shoot(){
		System.out.println(name+"이 슛을 하였습니다!!!");
		int a=(int)(Math.random()*2)+1;
		if(a==2){
			System.out.println(name+"이 골을  넣었습니다!!!");
			//g.score++;
		}else{
			System.out.println(name+"의 슈팅이 막혔습니다!");
		}
	}
	
	
	void defense(){
		System.out.println(name+"이 태클을 시도하였습니다");
		int a=(int)(Math.random()*2)+1;
		if(a==2){
			System.out.println(name+"이 태클을 성공하였습니다");
		
		}else{
			System.out.println(name+"의 태글이 실패하였습니다 ");
		}
	}
	
	
	
	void dribble(){
		System.out.println(name+"이 드리블을 시도하였습니다");
		int a=(int)(Math.random()*2)+1;
		if(a==2){
			System.out.println(name+"이 드리블이 성공하였습니다");
		
		}else{
			System.out.println(name+"의 드리블이 실패하였습니다 ");
		}
		
	}
	
	
	void pass(){
		System.out.println(name+"이 패스를 시도하였습니다");
		int a=(int)(Math.random()*2)+1;
		if(a==2){
			System.out.println("아! "+name+"이 롱패스를 시도하였습니다!");
			int b=(int)(Math.random()*3)+1;
			if(b==3)System.out.println(name+"이 롱킬패스를 성공하였습니다!");
			if(b==2)System.out.println(name+"이 쓰루롱패스를 성공하였습니다");
			if(b==1)System.out.println(name+"이 롱패스를 실패하였습니다");
			
		}else{
			System.out.println("아! "+name+"이 숏패스를 시도하였습니다!");
			int b=(int)(Math.random()*3)+1;
			if(b==3)System.out.println(name+"이 숏킬패스를 성공하였습니다!");
			if(b==2)System.out.println(name+"이 쓰루숏패스를 성공하였습니다");
			if(b==1)System.out.println(name+"이 숏패스를 실패하였습니다");
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
