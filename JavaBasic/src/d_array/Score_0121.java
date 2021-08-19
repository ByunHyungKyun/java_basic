package d_array;

import java.util.Arrays;

public class Score_0121 {

	public static void main(String[] args) {
		

		/*
		 * 우리반 모두의 국어,영어,수학,사회,과학,oracle,java 점수를
		 * 0~100까지 랜더므올 생성해주시고, 아래와같이 출력해주세요 
		 * 
		 *      국어     영어   수학   사회   과학   oracle  java   합계       평균         석차
 		 *홍길동     90   90  90  90  90   90      90   360 	90.00	 1
 		 *홍길동     90   90  90  90  90   90      90   360 	90.00	 1
 		 *홍길동     90   90  90  90  90   90      90   360 	90.00	 1
 		 *홍길동     90   90  90  90  90   90      90   360 	90.00	 1
 		 *홍길동     90   90  90  90  90   90      90   360 	90.00	 1
 		 *홍길동     90   90  90  90  90   90      90   360 	90.00	 1
 		 *과목합계 150  150 015 150 015 015  
 		 *과목평균 150  90.0 90.0 90.0 90.0  90.0  
		*/
		
		String[] name={"김민지","서주형","최윤성","변형균","김두환","현유진","김현슬" //이름배열
				,"이광렬","박예진","강건우","명민호","박상영","이휘로","김현태","최영준"
			    ,"정영인","정유진","공슬기","김이현","전윤주","전재수","유은지"};
		int[][] sub=new int[22][7]; //과목배열
		int[] sum=new int[22];//학생 합계
		double[] avg=new double[22];//학생평균
		int[] num=new int[22];//학생 석차
		int[] sum2=new int[7];//과목합계
		double[] avg2=new double[7];//과목평균

		for (int i = 0; i < sub.length; i++) { // 학생점수정렬
			for (int j = 0; j < sub[i].length; j++) {
				sub[i][j] = (int) (Math.random() * 101);
			}
		}
		for (int i = 0; i < sub.length; i++) { // 학생합계정렬
			for (int j = 0; j < sub[i].length; j++) {
				sum[i] += sub[i][j];
			}
			avg[i] = Math.round((double) sum[i] / 7 * 10) / 10.0;// 학생 평균 정렬
		}

		for (int i = 0; i < num.length; i++) {
			num[i] = 1;
		}
		for (int i = 0; i < avg.length; i++) { // 학생 석차 정렬
			for (int j = 0; j < avg.length; j++) {
				if (avg[i] < avg[j]) {
					num[i]++;
				}
			}
		}
		for (int i = 0; i < sum2.length; i++) { // 과목합계
			for (int j = 0; j < avg.length; j++) {
				sum2[i] += sub[j][i];
			}
		}

		for (int i = 0; i < avg2.length; i++) { // 과목평균
			avg2[i] = Math.round(sum2[i] / (double) 22 * 10) / 10.0;
		}

		System.out.println("\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < sub[i].length; j++) {
				System.out.print(sub[i][j] + "\t");
			}
			System.out.println(sum[i] + "\t"+avg[i] + "\t"+num[i]);
		}

		System.out.print("과목합계\t");
		for (int i = 0; i < sum2.length; i++) {
			System.out.print(sum2[i] + "\t");	
		}
		System.out.println("");
		
		System.out.print("과목평균\t");
		for (int i = 0; i < avg2.length; i++) {
			System.out.print(avg2[i] + "\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
