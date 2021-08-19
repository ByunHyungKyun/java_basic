package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 * 정규표현식 : 문자열의패턴을 검사하는 표현식 
		 * 
		 * ^ : 뒷 문자로 시작 
		 * $ : 앞 문자로 종료 
		 * . : 임이의 문자(줄바꿈제외)
		 * * : 앞 문자가 0개 이상 
		 * + : 앞 문자가 1개이상 
		 * ? : 앞문자가없거나 1개
		 * [] : 문자의 집합이나 범위([a-z]:a부터z까지,[^a-z]:a부터z가 아닌것)
		 * {} : 앞 문자의 개수 ({2}:2개,{2,4}:2개이상 4개이하)
		 * () : 그룹화(1개의 문자처럼 인식)
		 * | : OR연산
		 * \s : 공백,탭,줄바꿈
		 * \S : 공백, 탭, 줄바꿈
		 * \w : 알파벳이나 숫자
		 * \W : 알파벳이나 숫자가 아닌 문자
		 * \d : 숫자
		 * \D : 숫자가아닌 문자
		 * (?i) : 뒷 문자의 대소문자 구분안함
		 * \  : 정규표현식에서 사용되는 특수문자 표현
		 */
		
		
		String str="abc123";
		//String regex="[a-z]{3}[0-9]{1,3}";//정규표현식(문자열로 만든다)-->문자열을 검사하는 표현
		//String regex="[a-z0-9]+"; //둘다 포함하는것들이 한개이상온다-->아무문자나 와도 상관없다
		String regex="\\w*";//알파벳또는 순자가 0개이상온다(없어도된다)라는 뜻,문자열안에 \를 표현하고 싶으면 자바는 두개를 넣어줘야한다
		
		

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		
		//아이디,전화번호,이메일주소의 유효성을 검사하는 정규표현식을 만들어 주세요 
		String id="[a-z_0-9]{6,8}"; //문자또는 숫자또는 특수문자 8개
		String num="[0-9]{3}-[0-9]{4}-[0-9]{4}"; //숫자 11개
		//String num="^0\\d{1,3}-\\d{3,4}-\\d{4}";
		String em="[a-z0-9]{6,20}@[a-z0-9]{1,8}.[a-z0-9]{3}";//문자또는 숫자로 8개
		//	String em="[a-z0-9]{6,20}@[a-z0-9]{1,8}+\\.(?i)(com|net|org|([a-z]{2}\\.[a-z]{z}))";
		
		String str2="sds212";
		String str3="010-3360-0299";
		String str4="princebyun@naver.com";
		
		Pattern p1 = Pattern.compile(id);
		Matcher m1 = p1.matcher(str2);
		System.out.println(m1.matches());
		
		Pattern p2 = Pattern.compile(num);
		Matcher m2 = p2.matcher(str3);
		System.out.println(m2.matches());
		
		Pattern p3 = Pattern.compile(em);
		Matcher m3= p3.matcher(str4);
		System.out.println(m3.matches());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
