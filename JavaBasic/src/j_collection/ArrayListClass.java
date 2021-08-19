package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {

		//List(배열과 같은것, 인덱스를통해 저장),Map(값을 저장하는데 내가 저장하고 싶은 키로 저장),Set(생긴건 배열과 비슷한데 중복을 저장할순 없다)
		

		/*
		 * ArrayList
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다. 
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다. 
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다. 
		 * Object get(int index) : 지정된 위치의객체를 반환한다. (값을 가져오기 위한 메서드) 
		 * int size() : 지정된 객체의 수를 반환한다. 
		 * booleanremove(int index) : 지정된 위치의 객체를 제거한다.
		 */

		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		//ArrayList의 타입이 정해져있지 않다면 다른 타입을 넣을 수 있다.
		
		//제네릭을 저장하지않으면 널을때는 편하나 꺼낼때는 타입을 예측하기어렵다 
		//따라서 제네릭의 사용이 권장된다 
		ArrayList<Integer>list = new ArrayList<>();
		list.add(10);
		//list.add("abc"); 타입이 int라서 다른값을 넣을수 없다
		list.add(20);
		System.out.println(list.add(30));;
		System.out.println(list);
		
		list.add(1,40); //(1은) 인덱스(2는) 저장하고 싶은 값 : 1번인덱스부터 뒤로 밀고 값을 저장한다
		System.out.println(list);
		
		//list.add(5, 50) //컴파일 에러 : 해당 인덱스가 없다.
		
		Integer before = list.set(2, 50);//2번 인덱스에 값을 저장하고 기존 값을 반환한다.
		System.out.println("before : " + before);//before : 20 출력
		System.out.println("after : " + list.get(2));//after : 50 출력
		System.out.println(list);
		
		
		Integer integer = list.get(2);
		System.out.println(integer);
		
		
		
		for(int i = 0;i<list.size(); i++){
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println(list);
		
		
		//값을 제거 할 때는 뒤에서부터 제거해야 한다,앞에서 부터 제거를 하면 제거한값의 뒤에 값에 땡겨 온다 
		for(int i = list.size()-1; i >= 0; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list);
		System.out.println("-------------------------------------------------------------------");
		
		
		
		
		//list에 1부터 100까지 랜덤한값을 10개 저장해주세요 
		for (int i = 0; i < 10; i++) {
			int random=(int)(Math.random()*100)+1;
			list.add(random);
		}
		System.out.println(list);
		
		
		//list에 저장된 값을 합계와 평균을 구해주세요
		int sum=0;
		double avg=0;
		for (int i = 0; i <list.size(); i++) {
			sum +=list.get(i);
		}
		avg = (double)sum/list.size();
		System.out.println("합계:"+sum+"\t평균:"+avg);
		
		
		//list에서 최소값과 최대값을 구해주세요
		int max=list.get(0);
		int min=list.get(0);
		for (int i = 0; i <list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println("최대값:"+max+"\t최소값"+min);
		
		//list를 오름차순으로 정렬해주세요 
		for (int i = 0; i < list.size() - 1; i++) {
			min = i;
			for (int j = i; j < list.size(); j++) {
				if (list.get(j) < list.get(min)) {
					min = j;
				}
			}
			int temp = list.get(i);
			 list.set(i, list.get(min));
			 list.set(min, temp);
		}
		System.out.println(list);	
		
		
		
		//2차원 ArrayList 
		ArrayList<ArrayList<Integer>> list2= new ArrayList<>();
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list2.add(list);

		
		list = new ArrayList<>();
		list2.add(list);
		list.add(40);
		list.add(50);
		System.out.println(list2);

		
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> li = list2.get(i);
			for(int j = 0; j < li.size(); j++){
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i <list2.size(); i++) {
			for (int j = 0; j < list2.get(i).size(); j++) {
				System.out.print(list2.get(i).get(j)+"\t");
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
