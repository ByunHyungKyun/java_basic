package e_oop.score;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
Student[] students =new Student[10];
		
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();  //주의해야한다-->for문안에서 학생을 10명을 만든것이다,이것이for문 밖에있으면 학생1명밖에 안만들어진다
			int kor=student.kor();
			int eng=student.eng();
			int math=student.math();
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.temp=0;
			int sum=student.sum(kor,eng,math);
			double avg=student.avg(kor,eng,math);
			students[i] = student; //이게 10명을 만든다는 증거 
		}

		Scanner sc;
		sc=new Scanner(System.in);
		// 성적관리 프로그램을 완성해주세요

		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
		
		for(int i = 0; i < students.length - 1; i++){  //석차
			int min = i;
			for(int j = i + 1; j < students.length; j++){
				if(students[j].sum > students[min].sum){
					min = j;
				}
			}
			Student temp=students[i];
			students[i]=students[min];
			students[min]=temp;
			
			/*
			String temp1 =students[i].name;
			students[i].name = students[min].name;
			students[min].name = temp1;
		
			int temp2 = students[i].kor;
			students[i].kor = students[min].kor;
			students[min].kor = temp2;
			
			int temp3 = students[i].eng;
			students[i].eng = students[min].eng;
			students[min].eng = temp3;
			
			int temp4 = students[i].math;
			students[i].math = students[min].math;
			students[min].math= temp4;
			
			int temp5 = students[i].sum;
			students[i].sum = students[min].sum;
			students[min].sum= temp5;
			
			double temp6 = students[i].avg;
			students[i].avg = students[min].avg;
			students[min].avg = temp6;
			
			int temp7 = students[i].rank;
			students[i].rank = students[min].rank;
			students[min].rank = temp7;
			*/
		}
		
		
		
		int[] subsum=new int[3];
		double[] subavg=new double[3];
		for(int i=0;i<students.length;i++){
			subsum[0] += students[i].kor;
			subsum[1] += students[i].eng;
			subsum[2] += students[i].math;
		}
		
		subavg[0] += subsum[0]/students.length;
		subavg[1] += subsum[1]/students.length;
		subavg[2] += subsum[2]/students.length;
		
		
		
		/*
		for (int i = 0; i < students.length; i++) {
			students[0].subsum += students[i].kor;
		}
		students[0].subavg = Math.round(students[0].subsum/ (double) students.length * 100) / 100.0;

		for (int i = 0; i < students.length; i++) {
			students[1].subsum += students[i].eng;
		}
		students[1].subavg = Math.round(students[1].subsum/ (double) students.length * 100) / 100.0;

		for (int i = 0; i < students.length; i++) {
			students[2].subsum += students[i].math;
		}
		students[2].subavg = Math.round(students[2].subsum/ (double) students.length * 100) / 100.0;

		*/
		
		
		System.out.println("\t국어\t수학\t영어\t합계\t평균\t석차");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + "\t" + students[i].kor() + "\t"+ students[i].eng() + "\t" + students[i].math() + "\t"
					+ students[i].sum + "\t" + students[i].avg + "\t"+ students[i].rank());
		}
		
		System.out.print("과목합계");
		for (int i = 0; i < subsum.length; i++) {
			System.out.print("\t" + subsum[i]);
		}
		System.out.println();

		System.out.print("과목평균");
		for (int i = 0; i < subavg.length; i++) {
			System.out.print("\t" + subavg[i]);
		}
		
	
		
/*
		System.out.print("과목합계");
		for (int i = 0; i < 3; i++) {
			System.out.print("\t" + students[i].subsum);
		}
		System.out.println();

		System.out.print("과목평균");
		for (int i = 0; i < 3; i++) {
			System.out.print("\t" + students[i].subavg);
		}
*/
	}
}
