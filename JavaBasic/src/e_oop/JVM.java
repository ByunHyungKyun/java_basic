package e_oop;


public class JVM {

	public static void main(String[] args) {
		
		/*
		 * JVM(java virtual machine)
		 * 자바로 만들어진 프러그램이실행되는 컴퓨터 안의 가상 컴퓨터
		 * 운영체제 ->JVM->자바프로그램 
		 * 장점 : 운영체제에 상관없이 실행할수 있다 
		 * 단점 : 속도가 느리다 
		 * 
		 * JVM 메모리 구조 
		 * Method Area(메소드 영역): 클래스 멤버가 저장된다
		 * call stack(호출스택): 현재 호출되어 있는 메서드가 저장된다	
		 * Heep: 객체가 저장된다	
		 * */
			
		/*
		 * Method Area(실행시 메모리에 올라가는 것들) : 1번:main(),classVar,classMethod(),System.out 6번:JVM이 삭제되면서 다 프로그램이종료되고다삭제한다
		 * Heep : 3번:JVM->6번:GarbageCollector에 의해 제거됨
		 * call stack : 1번:mail(){3번:jvm=new JVM의주소  6번:주소 삭제 null},println(호출하고 삭제 한다) 2번:classMethod(프린트를 하고 삭제한다),println(호출하고 삭제 한다)
		 * 4번:println(호출하고 삭제 한다)  5번:instanceMethod(),println(호출하고 삭제 한다),println(호출하고 삭제 한다)
		 * 
		 */
		System.out.println(classVar);
		
		classMethod();
		
		JVM jvm =new JVM();
		
		System.out.println(jvm. instanceVar);
		
		jvm.instanceMethod();
		
		jvm=null;//GarbageCollector에 의해 제거됨
		//결론은 프로그램이 끝이나면 메모리에 있는것들이 다삭제 되고 없다
		
	}

	
	int instanceVar;
	static int classVar;//객체생성을 하지않고자동으로 메모리에올린다
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod(){
		//System.out.println(instanceVar);//객체생성전이라 메모리에 올라가 있지 않다
		System.out.println(classVar);
	}
	
	
	
}
