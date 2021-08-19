package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		
		/*
		 * Object put(Object,key, Object value) :  지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 저장된 키로 저장된 값을 제거한다 
		 * Object get(Object key) : 저장된 키의 값(없으면 null)을 반환한다  
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다
		 */
		
		
		HashMap<String, Object> map = new HashMap<>( ); //제네릭 두개를 지정

		map.put("number", 10);
		map.put("name", "홍길동");
		map.put("scanner", new Scanner(System.in));
		//Scanner object = (Scanner)map.get("scanner");
		//object.nextLine();
		
		
		
		//Object 타입은 모든 타입을 저장할 수 있다.
		// key는 임의로 지정하기 때문에 순서라는 개념이 없다.
		System.out.println(map);
	 	map.put("name", "이순신"); //덮어쓰기 -> 하나의 key는 하나의 값만 저장할 수 있다.
	 	System.out.println(map);
		
		
	 	
	 	
	 	
	 	
	 	map.remove("number");

		System.out.println(map);
		
		
		
		
		
		
		Object value = map.get("name");
		//타입에 맞는 변수를 만들어서 출력
		System.out.println(value);
		System.out.println(((String)value).substring(0, 1));
		
		
		
		
		
		
		Set<String> keys = map.keySet(); //저장된 모든 키

		for(String key : keys){ //타입에 맞는 변수 선언
		//향상된 for문 : keys라는 set을 String key라는 변수에 넣는다.
			System.out.println(key + " : " + map.get(key));
		}
		
		
		/* 오라클을 자바에 불러오는 방법
		ArrayList<HashMap<String,Object>> table = new ArrayList<>();
		HashMap<String,Object> row = new HashMap();
		row.put("CART_NUMBER", "a001");
		table.add(row);
		*/
		
		/*
		 * 래퍼클래스 
		 * 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스 
		 * byte : Byte
		 * short : Short
		 * int : Integer 
		 * long : Long 
		 * float : Float
		 * double : Double 
		 * char : Character 
		 * boolean : Boolean		
		 */
		
		
		//회원테이블 
		//아이디, 비밀번호, 이름, 전화번호
		ArrayList<HashMap<String, Object>> users = new ArrayList<>(); 
		HashMap<String, Object> user = new HashMap<>(); //테이블의 한 행
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "관리자");
		user.put("tel", "010-1234-5678");
		users.add(user);
		//테이블 출력
		/*
		for (int i = 0; i < users.size(); i++) {
			HashMap<String,Object> u=users.get(i);
			for(String j : u.keySet()){ 
				System.out.println(j + " : " + u.get(j));
			}
		}
		*/
		//두가지 방법이 있다
		for (HashMap<String,Object> u : users) {
			for(String j : u.keySet()){ 
				System.out.println(j + " : " + u.get(j));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
