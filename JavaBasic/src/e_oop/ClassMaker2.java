package e_oop;

public class ClassMaker2 {

	
	//인스턴스변수 하나를 선언하고 명ㅅ적으로 초기화해주세요  :1번
	int a=10;
	
	//위에서 선언한 인스턴스를 초기화 블럭을 사용해 초기화해주세요 :2번
	{
		a=20;
	}
	
	//위에서 선언한 인스턴스변수를 생성자의 파라미터를 사용하여 초기화해주세요 :3번 
	ClassMaker2(int a){
		this.a=a;
	}
	
	//위에서 선언한 인스턴스변수를 생성자를 하나더 만들어서 초기화해주세요
	ClassMaker2(){
		this(40);
	}
	
	//초기화순서 : 명시적 초기화->초기화블럭->생성자     --결국에는 생성자의 초기화값이 나온다 
	
	
	
	
public static void main(String[] args){
		
		ClassMaker2 cm=new ClassMaker2();
		System.out.println(cm.a);
		
		ClassMaker2 cm2=new ClassMaker2(30);
		System.out.println(cm2.a);
	}
	
}
