package step6_02.method;

import java.util.Arrays;
/*
class Ex10 {
	
	int test1 (int[] arr) { 
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt; 
		
	}
	
	
	int[] test2 (int[] arr) { 
		
		int cnt = test1(arr);			//변수에 담거나 아니면 그냥 써도 됨 . 	//test1의 값을 불러올수 있음.
		int[] temp = new int[cnt];		//지역변수는 불가능 . 결과값만 가능 .
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[j++] = arr[i];
			}
		}
		
		return temp; 
	}
	
}


public class MethodEx10_정답예시 {

	public static void main(String[] args) {
		
		Ex10 e = new Ex10();
		
		int[] arr = {87, 12, 21, 56, 100};
		
		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
		int cnt = e.test1(arr);				//class안에 조건식을 적용하고 arr로 리턴해줌 이때 클래스안에 
		System.out.println("cnt = " + cnt);	//변수명과 같아야 함 / arr=cnt값 / 돌려받는 변수가 있거나
											//e.test1(arr) 이렇게 써서 적용시켜야 값이 나옴.
		
		// 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
		int[] temp = e.test2(arr);					
		System.out.println(Arrays.toString(temp));



	}

}
*/