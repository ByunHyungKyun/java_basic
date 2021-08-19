package d_array;

import java.util.Arrays;

public class Array_0118 {

	public static void main(String[] args) {
		
		/*
		 * 배열
		 * 여러개의 값을 하나의변수에 저장해서 사용하는 것이다
		 * 참조형 타입이다
		 * 인덱스로 값을 구분한다
		 * 길이를 변경할수없다
		 * 같은 타입의 데이터만 묶을수 있다(int 끼리, double끼리)
		 * 
		 */
		
		int[] array;//배열의 주소를 저장할 공간이 만들어진다
		array=new int[5];//배열이 생성되고 그 주소가 저장된다-공간이 5개를 만든다는 뜻이다
		//배열 초기화시 기본값이저장된다
		
		/*
		 * 기본값 : 내가 값을 저장하지 않았을때 저장되는 값
		 * byte,short,int,long : 0
		 * float,double : 0
		 * char : ''(0)
		 * boolean : false
		 * 참조형 : null
		 */
		
		/*
		 * 위에 선언한것이 어떤뜻이냐면 
		 * 변수 = 주소
		 * 주소 (0,0,0,0,0)
		 * 
		 */
		
		
		array=new int[]{1,2,3,4,5};//또다른 초기화 방법  : 길이를 선언하지않고 값을 저장한다
		
		
		
		//array={1,2,3,4,5};//선언과 초기화를 동시에 해야한다
		int[] array2={1,2,3,4,5};
		
		
		//출력방법 : 0부터쓴다
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		
	/*	array[0]=10;//배열자리에값을 저장하는법
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		*/
		
		
		//배열은 for문과자주쓰인다
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		
		//배열자리에 값을 for문으로 저장하는법 (위에꺼랑 결과값이 같다)
		for(int i=0;i<array.length;i++){
			array[i] = (i+1)*10;
			System.out.println(array[i]);
		}
		
		
		//10개의 정수를 저장할수 있는 배열을 선언및초기화해주세요
		int[] random = new int[10];
		
		//배열의 모든인덱스에 1~100사이의 랜덤한 값을 저장해주세요
		
			for(int i=0;i<random.length;i++){
				random[i]=(int)(Math.random()*100)+1;
			}
			System.out.println(Arrays.toString(random));
		
			
		//배열에저장된모든 값의합계와 평균을 구해주세요
		int sum=0;
		double avg=0;
			for(int i=0;i<random.length;i++){
				sum += random[i];	
		}
		avg=(double)sum/random.length;//둘다 인트라서 하나를 더블로 해준다
		System.out.println(sum+","+avg);
		
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요
		int so = 0;
		int da = 0;

		for (int i = 0; i < random.length; i++) {
			int count1 = 0;
			int count2 = 0;
			int a = random[i];

			for (int j = 0; j < random.length; j++) {
				a = random[i];
			if (a > random[j]) {count1++;}
			if (a < random[j]) {count2++;}
			}
			
			if (count1 == 0) {so = a;}
			if (count2 == 0) {da = a;}
			}
		
		System.out.println(da + "," + so);
		
		
		//선생님코드
		int min =random[0];
		int max =random[0];
		for(int i=0;i<random.length;i++){
			if(random[i]<min){
				min=random[i];
			}
			if(max<random[i]){
				max=random[i];
			}
		}
		System.out.println(max+",,"+min);
		
	
		
		int[] shuffle = new int[10];
		for(int i=0;i<shuffle.length;i++){
			shuffle[i]=i+1;
		}
		
	
		

	
		//배열의값을 섞어주세요
		//랜덤 인덱스와 0번인덱스의자리를 바꿔주세요(여러번반복)		
	/*	int ran=(int)(Math.random()*9)+1;
		int i=ran;
		int b=shuffle[0];
		int c=shuffle[i];
		int d=shuffle[0];
		
		if(b != c){
		shuffle[0]=c;
		shuffle[i]=d;
		}
		System.out.println(Arrays.toString(shuffle));
		*/
		
		
	/*	//선생님 코드
		for(int i=0;i<shuffle.length*10;i++){
		int ran=(int)(Math.random()*shuffle.length);
		int temp =shuffle[0];
		shuffle[0]=shuffle[ran];
		shuffle[ran]=temp;
		}
		System.out.println(Arrays.toString(shuffle));
		*/
		
		
		
		
		//1~10사이의랜덤값을 500번 생성하고 각 숫자가 생성된 횟수를출력해주세요
/*
		int[] test=new int[500];
		int[] test2=new int[10];
		
		for(int i=0;i<500;i++){
		int ran=(int)(Math.random()*10)+1;
		test[i]=ran;
		
			if (ran == 1) {
				test2[0] += 1;
			} else if (ran == 2) {
				test2[1] += 1;
			} else if (ran == 3) {
				test2[2] += 1;
			} else if (ran == 4) {
				test2[3] += 1;
			} else if (ran == 5) {
				test2[4] += 1;
			} else if (ran == 6) {
				test2[5] += 1;
			} else if (ran == 7) {
				test2[6] += 1;
			} else if (ran == 8) {
				test2[7] += 1;
			} else if (ran == 9) {
				test2[8] += 1;
			} else if (ran == 10) {
				test2[9] += 1;
			}
	}
		System.out.println(Arrays.toString(test2));
		*/
		
		//선생님 코드
		int[] counts=new int[10];
		
		for(int i=0;i<500;i++){
			int ran=(int)(Math.random()*10)+1;
			counts[ran-1] ++;
		}
		System.out.println(Arrays.toString(counts));
		
		
		
		
	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
