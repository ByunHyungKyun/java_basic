package d_array;

import java.util.Arrays;


public class Sort_0119 {

	public static void main(String[] args) {
		
		/*
		 * 정렬
		 * 석차 구하기: 점수를 비교해 작은 숫자의등수를 증가시키는 방식
		 * 선택정렬 : 가장 작은 숫자를 찾아서 앞으로보내는 방식
		 * 버블정렬 : 바로 뒤의숫자와비교해서큰 수를 뒤로 보내는 방식
		 * 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로밀고 중간에삽입하는 방식
		 */
		
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		/*
		//석차구하기
		int[] rank=new int[arr.length];    //점수가 저장된 배열의 길이와 동등하게 해야한다
		for(int i=0;i<rank.length;i++){
			rank[i]=1;
		}  //rank 배열 각 자리에 1값(등수) 저장
		for(int i=0;i<arr.length;i++){        //i가 나이고 j가다른사람들
			for(int j=0;j<arr.length;j++){
			if(arr[i]<arr[j]){
				rank[i]++; //비교해서 등수저장--저장하면 등수가내려가는 것이다
			  }
			}
		}  //모든 사람들과비교를 위해 3개의 for문 만들기
		System.out.println(Arrays.toString(rank));
		*/
		
		
		//선택정렬
		/*
		for(int i=0;i<arr.length-1;i++){       
			for(int j=i;j<arr.length;j++){
			    int temp=0;
				if(arr[j]<arr[i]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//선생님코드
		for(int i=0;i<arr.length-1;i++){       
			int min=i;
			for(int j=i;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		/*
		//버블정렬
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j+1]<arr[j]){
					int temp=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//버블정렬이 바뀌지 않을때 끝내는법
		for(int i=0;i<arr.length-1;i++){
			boolean flag=false;
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j+1]<arr[j]){
					int temp=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
				    flag=true;
				}
			}
			if(flag==false){ //if(!flag) : 같은 표현이다	
				System.out.println(Arrays.toString(arr));
				System.out.println("끝났지롱");
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		
		//삽입정렬
			for(int i=1;i<arr.length;i++){
				int temp=arr[i];
				int j=0;
				for( j=i-1;j>=0;j--){
					if(temp<arr[j]){
					arr[j+1]=arr[j];
					}else{
					break;	
					}
					
				}
				arr[j+1]=temp;	
			}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
