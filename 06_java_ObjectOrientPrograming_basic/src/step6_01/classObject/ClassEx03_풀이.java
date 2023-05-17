package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_풀이 {
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_풀이 {

	public static void main(String[] args) {
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		Ex03_풀이 answer = new Ex03_풀이();
		
		int tol = 0; 
		for (int i = 0; i < answer.arr.length; i++) {
			tol += answer.arr[i];
		}
		System.out.println(tol);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		int num4 = 0;
		for (int i = 0; i < answer.arr.length; i++) {
			if (answer.arr[i] % 4 == 0) {
				num4 += answer.arr[i];
			}
		}
		System.out.println(num4);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int num4Cnt = 0;
		for (int i = 0; i < answer.arr.length; i++) {
			if (answer.arr[i] % 4 == 0) {
				num4Cnt++;
			}
		}
		System.out.println(num4Cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		int cnt = 0;
		for (int i = 0; i < answer.arr.length; i++) {
			if (answer.arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
