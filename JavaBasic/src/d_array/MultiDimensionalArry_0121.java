package d_array;

import java.util.Arrays;

public class MultiDimensionalArry_0121 {

	public static void main(String[] args) {
		
		/*
		 * 다차원배열
		 * 배열안에 배열이저장디어있는 형태
		 */
		
		//2차원
		int[][] array2;
		
		//3차원
		int[][][] array3;
		
		/*
		 * 2차원배열
		 * 변수 : 주소1
		 * 
		 * 주소1 : {주소2,주소3}
		 * 
		 * 주소2 : {값1,값2}
		 * 주소3 : {값3,값4}
		 */
		
		int[][] arr=new int[2][3];//2칸짜리 배열안에 각 칸마다 3칸짜리 배열이생성된다
		int arr2[][]=new int[][]{{1,2,3},{4,5,6}};//값의 개수로배열의길이가정해진다
		int[]arr3[]={{1,2,3},{4,5,6},{7,8,9}};//선언과초기화를 동시에 해야한다
		
		
		int[][] arr4=new int[3][];//가변배열
		arr4[0]= new int[3];
		arr4[1]= new int[5];
		arr4[2]= new int[10];
		
		System.out.println(arr[0][1]);
		
		//arr[0]=10; --값을 저장할수없다
		arr[0]=new int[5]; //배열을 저장해야한다
		arr[0][0]=10;//2차원에값을 저장할수있다
		arr[0][1]=20;
		arr[1][0]=100;
		
		System.out.println(arr.length);//1차원배열의 길이
		System.out.println(arr[0].length);//2차원배열의 길이
		System.out.println(arr[1].length);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
				arr[i][j]=i*j;
			}
		}
		
		int[][] scores=new int[3][5];//int[학생수][과목수]
		int[] sum=new int[scores.length];//합게
		double[] avg =new double[scores.length];//평균
		
		for (int i = 0; i < scores.length; i++) {

			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		//선생님이 한거
	  }
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			}
			avg[i] = Math.round(sum[i] / (double) scores[i].length * 10) / 10.0;
			System.out.println("합게 :"+sum[i]+" / 평균: "+avg[i]);
		}
		
			
	    /* 내가한거
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			}

			avg[i] = Math.round(sum[i] / (double)scores[i].length*10)/10.0;
		}

		System.out.println("합게 :"+Arrays.toString(sum));
		System.out.println("평균 :"+Arrays.toString(avg));
		
		*/
		
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
