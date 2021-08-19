package c_statement;

import java.util.Scanner;

public class RepetitiveStatement_0115 {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * for문
		 * while문
		 * do-while문
		 * 
		 * for문 
		 * for(초기화; 조건식; 증감식;){}
		 * 포함하고있는 문장들을 정해진 횟수만큼 반복하는 문장
		 */
		
		
		for(int i=1;i<=10;i++){
			//초기화 : 조건식과증감식에사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안에 내용을 수행한다
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다
			System.out.println(i+"번째 반복");
			//초기화한 변수를 블럭안에서 사용할수있다
		}
		//규칙이있는 문장들을 효율적으로작성하기 위해 반복문을 사용한다
		
		
		int sum=0;
		for(int i=1;i<=100;i++){
			sum +=i;
		}
		System.out.println(sum);
		
		
	    sum=0;
	    for(int i=100;i>=1;i--){
	    	sum +=i;
	    }
	    System.out.println(sum);
		
		
		//1부터 100까지 짝수의합을 출력하시오
	   sum=0;
	   for(int i=2;i<=100;i+=2){
		  sum +=i;
	   }
	   System.out.println(sum);
		
		
		//11부터100까지홀수의 합을 출력하시오
		sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==1){
				sum +=i;
			}
		}
		
		System.out.println(sum);
		
		//구구단을 출력
		/*
		 * 2*1=2
		 * 2*2=4
		 * ...
		 */
		for(int i=1;i<10;i++){		
			for(int j=2;j<10;j++){
				System.out.println(i+"*"+j+"="+i*j+" ");		
			}
		}
		
		//구구단 전체를 가로로 출력하시오		
		for(int i=1;i<10;i++){		
			for(int j=2;j<10;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");		
			}
			System.out.println();
		}
		
		/*
		 * while문
		 * while(조건식){}
		 * 포함하고 있는 문장들을 조건식이만족하는 동안 반복하는 문장
		 * 반복횟수가 정확하지 않는 경우에 주로 사용한다
		 */
		
		
		int a=1;
		//a에 2씩몇번을 곱해야 1000이사이 되는가?
		int count =0;
		while(a<1000){
			a *=2;
			count++;
			System.out.println(count+" : "+a);
			
		}
		
		
		/*
		 * do-while문
		 * do{}while(조건식);
		 * 최소한 한번의 수행을 보장한다
		 */
		
	/*	//숫자맞추기 게임
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		Scanner sc=new Scanner(System.in);
		do{
				System.out.println("1~100사이의 수를 입력하시오= ");
				input=Integer.parseInt(sc.nextLine());
	 
		if(answer<input){
			System.out.println(input+" 보다 작습니다");
		}else if(input<answer){
			System.out.println(input+" 보다 큽니다");
		}else{
			System.out.println("정답입니다!");
		}
		}while(input !=answer);
		*/
		
		//이름붙은 반복문
		outer : for(int i=2;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(j==5){
					//break;//가장 가까운 반복문 하나를 빠져나간다
					//break outer; // = outer라는 이름의 반복문을 빠져나간다
					//continue;  //= 가장 가까운 반복문의현재 반복회차를 빠져나간다
					//continue outer;  //= outer라는 이름의 현재반복회차를 빠져나간다 
					
				}
				 System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		
		
		//도형만들기
		for(int i=1;i<4;i++){
			
			for(int j=1;j<6;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		 //트리만들기
		    for(int i=1;i<=6;i++){
		    	
			for(int j=1;j<=i;j++){
	
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		  
		
		
		//역트리만들기
		for(int i=1;i<=6;i++){	
			for(int j=1;7-i>j;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=6;i>=1;i--){	//선생님이 짜신코드
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		//중간이 빈 트리
		
		
		for (int i =1; i <= 6; i++) {
			for (int j=6;j>0;j--) {
					
				if(i<j){
					System.out.print(" ");	
					
				}else{
					System.out.print("*");	
				}		
			}
			System.out.println();
		}
		

	
		
		
		//역 중간의 빈트리
		
		for (int i =6; i >= 1; i--) {
			for (int j=1;j<=6;j++) {
					
				if(i+j<=6){
					System.out.print(" ");	
					
				}else{
					System.out.print("*");	
				}		
			}
			System.out.println();
		}
		

	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
