package step6_02.method;


class Ex08 {
	
	void printSum(int[] arr) {
		int tol = 0;
		for (int i = 0; i < arr.length; i++) {
			tol += arr[i];
		}
		System.out.println("arr배열의 전체 합 : "+ tol);
		
	}
	void printSumMultiple4(int[] arr) {
		int num4 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]% 4 == 0) {
				num4 += arr[i];
			}
		}
		System.out.println("4의 배수의 합 : " + num4);
		
	}
	void printCountMultiple4(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]% 4 == 0) {
				cnt++;
			}
		}
		System.out.println("4의 배수의 개수 : " + cnt);
		
	}
}


public class MethodEx08_풀이 {

	public static void main(String[] args) {
		
		Ex08 e = new Ex08();
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		e.printSum(arr);
		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		e.printSumMultiple4(arr);
		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		e.printCountMultiple4(arr);
		

	}

}
