package i_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		
		/*
		 * String의 주요 메서드 
		 * equals() : 문자열의 내용일 같은지 반환한다
		 * length() : 문자열의길이를 반환한다 
		 * charAt() : 특정 인덱스에 위치한 문자를 반환한다 
		 * substring() : 문자열의 특정부분을 잘라서 반환한다 
		 * indexOf() : 문자열내의 특정 문자의 인덱스를 반환한다 
		 * contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환한다 
		 * split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다 
		 * trim() : 문자열 앞뒤의 공백을 제거해 반환한다
		 * valueOf() : 다른 타입의 데이터를 문자열로 반환해 반환한다
		 */
		
		
		boolean equals="문자열".equals("문자열");
		System.out.println(equals);
		
		String str1="문자열";
		String str2=null;
		System.out.println(str1.equals(str2));
		//System.out.println(str2.equals(str1)); : 값이 있어야 비교를 하게된다
		//null이 있을수 있는 변수를 앞에 두지 않는다
		
		
		
		String str ="12345";
		int length = str.length();
		for(int i=0;i<length;i++){
			char charAt=str.charAt(i);
			System.out.println(charAt);
		}
		
		//문자열 뒤집기
		String rev ="";
		for(int i=str.length()-1;i>=0;i--){
			rev +=str.charAt(i);
		}
		System.out.println(rev);
		
		
		str ="0123456789";
		String sub1=str.substring(3);//3번 인덱스부터 끝까지 잘라서 반환한다
		System.out.println(sub1);
		String sub2= str.substring(5,8);//5번 인덱스부터 8번인덱스전까지 잘라서 반환한다
		System.out.println(sub2);
		
		str = "수박 오렌지 귤 블루베리";
		int index=str.indexOf("오렌지");//몇번인덱스인지 위치를 알려준다,공백을 포함해서 0부터 시작을 한다
		System.out.println(index);
		
		//substring과 indexOf를 조합해서 문자열 자르기
		String[] menu={"수박 20000원","오렌지 100000원","귤 500원","블루베리 3000원"};
		for(int i=0;i<menu.length;i++){
			String name=menu[i].substring(0,menu[i].indexOf(" "));
			System.out.println(name);
		}
		//가격만 잘라서 int 타입의 변수에 저장해주세요 
		for(int i=0;i<menu.length;i++){
			int a=menu[i].indexOf(" ");
			int b=menu[i].indexOf("원");
			int price =Integer.parseInt(menu[i].substring(a+1,b));
			System.out.println(price+"원");
		}
		
		
		str="abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		//오렌지가 메뉴의 몇번 인덱스에 있는지 확인 
		for(int i=0;i<menu.length;i++){
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는 "+i+"몇번 인덱스에 존재합니다");
			}
		}
		
		
		str = "a/b/c";
		String[] split= str.split("/");
		System.out.println(Arrays.toString(split));
		
		
		//메뉴명과 가격을 나누기 (이거조금어렵다 잘이해 해야해)
		for(int i=0;i<menu.length;i++){
			split=menu[i].split(" ");
			System.out.println("메뉴명:"+split[0]+"/가격:"+split[1]);	
		}
		
		
		
		str=" 문자열 ";
		String trim=str.trim();
		System.out.println("["+str+"] ->["+trim+"]");
		//trim ==> 사용자의 실수로 아이디나 비밀번호 앞 뒤에 공백이 들어가는 것을 방지하기 위해 사용할수있다 ,특히 뒤에 공백을 알기가 힘들기때문!
		String id= " idid";
		String pass="sdlsdlsdl ";
		System.out.println(id);
		System.out.println(pass);
		System.out.println(id.trim());
		System.out.println(pass.trim());
		
		
		
		//number를 String 타입으로 바꿔라
		int number =10;
		str = number+""; //편법
		str = String.valueOf(number);//제대로된 방법
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
