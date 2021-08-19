package b_operator;

public class arithmeticopertator_0113 {

	public static void main(String[] args) {
		
		/*
		 * 산술연산자
		 * 사칙연산 : +,-,*,/,%(나머지)
		 * 복합연산자 : +=,-=,*=,/=,%=
		 * 증감연산자 : ++,--
		 */
		
		//int result=10+20-30*40/50%60;
		
    /*  //나머지 연산
		result=10/3;
		System.out.println(result);
		result=10%3;
		System.out.println(result);
		*/
		
		
		
	/*	//5개의 산술연산자를 사용해 5개의 연산을 수행후 출력
		result=11+3;
		System.out.println(result);
		result=11-3;
		System.out.println(result);
		result=11*3;
		System.out.println(result);
		result=11/3;
		System.out.println(result);
		result=11%3;
		System.out.println(result);
		*/
		
		
	/*	//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할때 연산자의 대입연산자를 결합해 사용할수있다
		result += 3;//원래 저장되어있던 result값에 3을 더한다는 뜻
		System.out.println(result);
		result=result+3;//위에꺼와 같은 뜻
		System.out.println(result);
		result -=5;
		System.out.println(result);
		result *=2;
		System.out.println(result);
		result /=2;
		System.out.println(result);
		*/
		
		
	/*	//아래의문장을 복합연산자를 사용한 문장으로 만들어라
		//result=result+10;
		result +=10;
		System.out.println(result);
		//result=result-2*3;
		result -=2*3;
		System.out.println(result);
		//result=result%5;
		result %=5;
		System.out.println(result);
		*/
		
		
	/*	//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다
		//감소연산자(--) : 변수의 값을 1 감소시킨다
		int i=0;
		++i;//전위형 : 변수의 값을 읽어오기전에 1증가시킨다 
		i++;//후위형 : 변수의 값을 읽어온 후에 1 증가시킨다
		--i;
		i--;
		
		i=0;
		System.out.println("++i="+ ++i);
        i=0;
		System.out.println("i++="+ i++);
		System.out.println(i);
		*/
		
		
/*		//피연산자의 타입이 서로 같아야만 연산이 가능하다 
		int _int=10;
		double _double=3.14;
		
		double result2=_int+_double;//표현범위가더 큰 타입으로형변환한다, 원래는 double result2=(double)_int+_double; 이다 
		System.out.println(result2);
		
		long _long=100L;
		_long=_int+ _long;
	//	_int=_int+ _long;//얘는 오류가 나는데 롱을 인트타입으로 바꿔줘야한다,원래는 _int=_int+ (int)_long; 이다
		
		byte _byte=5;
		short _short=10;
		int result3=_byte+_short;//int보다 작은 타입은 int로 형변환한다
		System.out.println(result3);
		
	    char _char='a';
	    char _char2='b';
	    _int = _char+_char2;//int보다 작은 char은 int로 형변환한다
	    System.out.println(_int);
		
		//오버플로우,언더플로우
		//표현범위를 벅어나는 값을 표현할때 방생하는 현상
	    byte b=127;
	    b++;
	    System.out.println(b);//오버플로우:가장큰값을 벗어나면 가장작은 값으로 변경된다
		b--;
		System.out.println(b);//언더플로우:가장작은값을 벗어나면 가장작은갑승로변경된다
		
		//다음을 한줄씩 계산해서 결과값을 출력하라
		//1. 123456+654321
		//2. 1번의 결과값*123456
		//3. 2번의 결과값/123456
		//4. 3번의 결과값-654321
		//5. 4번의 결과값%123456
		
		int s=123456;
		int v=654321;
		long resulta;
		
		//1
		resulta=s+v;
		System.out.println(resulta);
		//2
		resulta *=s;
		System.out.println(resulta);
		//3
		resulta /=s;
		System.out.println(resulta);
		//4
		resulta -= v;
		System.out.println(resulta);
		//5
		resulta %=s;
		System.out.println(resulta);
		*/
		
		
		//3개의 int형 변수를 선언 및 초기화후  합계와 평균을 구하여라 
		int q=15;
		int w=34;
		int e=49;
		double res;
		
	    res=q+w+e;
	    System.out.println(res);
	    res /=3;
	    System.out.println(res);
		
		//반올림
		//res=Math.round(res);//반올림을 해주는 메소드
		//System.out.println(res);
		res=Math.round(res*10)/10.0;//소수점을 보고 싶을때 곱하기를 하면 된다
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
