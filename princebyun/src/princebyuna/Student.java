package princebyuna;

public class Student {

	String name; //이름객체
	int kor; //국어객체
	int eng; //영어객체
	int math;//수학객체
	int sum;//과목합계객체
	double avg;//과목평균객체
	int rank;//등수객체
	
	void createRandomScore() { //점수부여메소드
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
	}
	
	int getSum() {//학생점수합계메소드
		return sum = kor + eng + math;
	}
	
	double getAverage() {//학생점수평균메소드
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
	}

	int getRank(Student[] students) { //학생등수메소드
		rank = 1;
		
		for(int i = 0; i < students.length; i++) {
			if(getSum() < students[i].getSum()) {
				rank++;
			}
		}
		
		return rank;
	}
	
	String getInfo() { //출력메소드
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}
	
}
