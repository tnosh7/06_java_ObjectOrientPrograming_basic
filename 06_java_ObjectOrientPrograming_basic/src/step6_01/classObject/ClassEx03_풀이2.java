package step6_01.classObject;
//23-08-21 17:15 ~ 17~19
//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03풀이2{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_풀이2 {

	public static void main(String[] args) {
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		Ex03풀이2 ex03 = new Ex03풀이2();
		
		int total = 0;
		for (int i = 0; i < ex03.arr.length; i++) {
			total += ex03.arr[i];
		}
		System.out.println(total);
		
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int total4 = 0;
		for (int i = 0; i < ex03.arr.length; i++) {
			if (ex03.arr[i] % 4 == 0) {
				total4 += ex03.arr[i];
			}
		}
		System.out.println(total4);
		
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for (int i = 0; i < ex03.arr.length; i++) {
			if (ex03.arr[i] % 4 == 0) cnt++;
		}
		System.out.println(cnt);
		
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int cnt2 = 0;
		for (int i = 0; i < ex03.arr.length; i++) {
			if (ex03.arr[i] % 2 == 0) cnt2++;
		}
		System.out.println(cnt2);

	}

}
