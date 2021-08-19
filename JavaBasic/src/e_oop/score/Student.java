package e_oop.score;

public class Student {

	int kor=0;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	int rank;
	int subsum ;
	double subavg ;
	int temp;
	
	
	
	
	//만들어야하는 메서드
	/*
	국어 성적 메서드 ㅇ
	영어 성적 메서드 ㅇ
	수학 성적 메서드  ㅇ
	학생 과목 합계메서드 ㅇ
	학생 과목 평균 ㅇ
	등수 메서드 o
	석차메서드 0
	과목 합계메서드
	과목 평균 메서드
	출력 메서드 
	*/
	
	int kor(){
		return(int) (Math.random() * 101);
	}
	int eng(){
		return(int) (Math.random() * 101);
	}
	int math(){
		return(int) (Math.random() * 101);
	}
	
	int sum(int a,int b,int c){
		return  a+b+c;
	}
	double avg(int a,int b,int c){
		return Math.round((a+b+c)/(double)3*100)/100.0;
	}
	
	
	int rank(){
		return rank++;	
	}
			
	int ranking(int a,int b){
	      temp=a;
	       a=b;
	    return  b=temp; 
        
	}
		
	
	int subsum (int a){
		return a++ ;
	}
	
	double subavg(int a,int b,int c){
		return Math.round((a+b+c)/3*100)/100.0;
	}
	

	
	
	
	
	
	
	
}