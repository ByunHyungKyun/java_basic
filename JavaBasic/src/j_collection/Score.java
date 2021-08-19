package j_collection;

import java.util.ArrayList;

public class Score {

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
		
		
		ArrayList<String> name=new ArrayList<>();
		name.add("김민지");name.add("서주형");name.add("최윤성");
		name.add("변형균");name.add("김두환");name.add("현유진");
		name.add("김현슬");name.add("이광렬");name.add("박예진");
		name.add("강건우");name.add("명민호");name.add("박상영");
		name.add("이휘로");name.add("김현태");name.add("최영준");
		name.add("정영인");name.add("정유진");name.add("공슬기");
		name.add("김이현");name.add("전윤주");name.add("전재수");
		name.add("유은지");
		
		ArrayList<String> subject=new ArrayList<>();
		subject.add("국어");subject.add("영어");
		subject.add("수학");subject.add("사회");
		subject.add("과학");subject.add("oracle");
		subject.add("java");
		
		ArrayList<ArrayList<Integer>> sub = new ArrayList<>(); // 과목점수생성
		for (int i = 0; i < name.size(); i++) {
			ArrayList<Integer> list = new ArrayList();
			for (int j = 0; j < subject.size(); j++) {
				int a = (int) (Math.random() * 101);
				list.add(a);
			}
			sub.add(list);
		}

		ArrayList<Integer> namesum = new ArrayList<>(); // 학생 과목 점수 합계,평균
		ArrayList<Double> nameavg = new ArrayList<>();
		for (int i = 0; i < sub.size(); i++) {
			int sum = 0;
			for (int j = 0; j < sub.get(i).size(); j++) {
				sum += sub.get(i).get(j);

			}
			double avg = Math.round((double) sum / sub.get(i).size() * 10) / 10.0;
			namesum.add(sum);
			nameavg.add(avg);
		}

		ArrayList<Integer> rank = new ArrayList<>();// 학생 석차 정렬
		int r = 1;
		for (int i = 0; i < name.size(); i++) {
			rank.add(r);
		}

		for (int i = 0; i < rank.size(); i++) {
			r = 1;
			for (int j = 0; j < rank.size(); j++) {
				if (namesum.get(i) < namesum.get(j)) {
					r++;
				}
			}
			rank.set(i, r);
		}

		for (int i = 0; i < rank.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < rank.size(); j++) {
				if (namesum.get(j) > namesum.get(min)) {
					min = j;
				}
			}
			ArrayList<Integer> temp = sub.get(i);
			sub.set(i, sub.get(min));
			sub.set(min, temp);

			int temp2 = namesum.get(i);
			namesum.set(i, namesum.get(min));
			namesum.set(min, temp2);

			double temp3 = nameavg.get(i);
			nameavg.set(i, nameavg.get(min));
			nameavg.set(min, temp3);

			int temp4 = rank.get(i);
			rank.set(i, rank.get(min));
			rank.set(min, temp4);

			String temp5 = name.get(i);
			name.set(i, name.get(min));
			name.set(min, temp5);
		}

		ArrayList<Integer> subsum = new ArrayList<>();// 과목합계
		for (int i = 0; i < sub.get(i).size(); i++) {
			int sum = 0;
			for (int j = 0; j < sub.size(); j++) {
				sum += sub.get(j).get(i);
			}
			subsum.add(sum);
		}

		ArrayList<Double> subavg = new ArrayList<>();// 과목평균
		for (int i = 0; i < subsum.size(); i++) {
			double avg = Math.round(subsum.get(i) / (double) name.size() * 10) / 10.0;
			subavg.add(avg);
		}

		System.out.print("\t");
		for (int i = 0; i < subject.size(); i++) {
			System.out.print("\t" + subject.get(i));
		}
		System.out.print("\t합계\t평균\t석차");
		System.out.println();

		for (int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i) + "\t");
			for (int j = 0; j < sub.get(i).size(); j++) {
				System.out.print(sub.get(i).get(j) + "\t");
			}
			System.out.println(namesum.get(i) + "\t" + nameavg.get(i) + "\t"
					+ rank.get(i));
		}

		System.out.print("과목합계 \t");
		for (int i = 0; i < subsum.size(); i++) {
			System.out.print(subsum.get(i) + "\t");
		}
		System.out.println();

		System.out.print("과목평균 \t");
		for (int i = 0; i < subavg.size(); i++) {
			System.out.print(subavg.get(i) + "\t");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
